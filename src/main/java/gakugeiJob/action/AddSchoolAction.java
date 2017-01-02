package gakugeiJob.action;

import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.form.SchoolForm;
import gakugeiJob.service.SchoolService;

public class AddSchoolAction {

	@Resource
	@ActionForm
	protected SchoolForm schoolForm;
	
	@Resource
	protected SchoolService schoolService;
	
    @Execute(validator = false)
    public String index(){
        return "index.jsp";
    }
    
    @Execute(input ="/error/?redirect=true")
    public String add() throws NoSuchAlgorithmException{
    	int result = -1;
    	result = schoolService.insertSchool(schoolForm.userId, schoolForm.userPass, schoolForm.name, schoolForm.kinds, schoolForm.phoneNumber,
    			schoolForm.mailAddress, schoolForm.url, schoolForm.oneThing);
    			
    	if(result == 0)
    		return "confirm.jsp";
    	else
    		return "/error/?redirect=true";
    }
}
