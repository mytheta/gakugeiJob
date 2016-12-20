package gakugeiJob.action;

import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.form.EnterpriseForm;
import gakugeiJob.service.EnterpriseService;


public class AddEnterpriseAction {

	@Resource
	@ActionForm
	protected EnterpriseForm enterpriseForm;
	
	@Resource
	protected EnterpriseService enterpriseService;
	
    @Execute(validator = false)
    public String index(){
        return "index.jsp";
    }
    
    @Execute(input ="/error/?redirect=true")
    public String add() throws NoSuchAlgorithmException{
    	int result = -1;
    	result = enterpriseService.insertEnterprise(enterpriseForm.userId, enterpriseForm.userPass, enterpriseForm.name, enterpriseForm.foundingDate,
    			enterpriseForm.founderName, enterpriseForm.address, enterpriseForm.capital, enterpriseForm.presidentName, enterpriseForm.numOfEmployees,
    			enterpriseForm.business, enterpriseForm.phoneNumber, enterpriseForm.url, enterpriseForm.oneThing, enterpriseForm.mailAddress);
    	if(result == 0)
    		return "confirm.jsp";
    	else
    		return "/error/?redirect=true";
    }
}
