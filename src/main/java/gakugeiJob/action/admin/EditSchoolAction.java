package gakugeiJob.action.admin;

import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.AdminAuth;
import gakugeiJob.form.admin.LoginListForm;
import gakugeiJob.service.LoginService;

public class EditSchoolAction {

	@ActionForm
	@Resource
	protected LoginListForm loginListForm;
	
	@Resource
	protected LoginService loginService;
	
	@Execute(validator = false)
	@AdminAuth
	public String index(){
		String userId = loginListForm.userId;
		return "index.jsp";
    }
	
	@Execute(input ="/error/?redirect=true")
	@AdminAuth
	public String edit() throws NoSuchAlgorithmException{
		loginService.updatePass(loginListForm.userId, loginListForm.userPass);
		return "confirm.jsp";
	}
}
