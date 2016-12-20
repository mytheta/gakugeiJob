package gakugeiJob.action.admin;

import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.AdminAuth;
import gakugeiJob.form.admin.StudentForm;
import gakugeiJob.service.StudentService;

public class AddStudentAction {

	@Resource
	@ActionForm
	protected StudentForm studentForm;
	
	@Resource
	protected StudentService studentService;
	
	@Execute(validator = false)
	@AdminAuth
    public String index(){
        return "index.jsp";
    }
	
	@Execute(input ="/error/?redirect=true")
	@AdminAuth
	public String add() throws NoSuchAlgorithmException{
		int result = -1;
    	result = studentService.insertStudent(studentForm.userId, studentForm.userPass);
    			
    	if(result == 0)
    		return "confirm.jsp";
    	else
    		return "/error/?redirect=true";
    }
}
