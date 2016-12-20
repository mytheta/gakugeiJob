package gakugeiJob.action.admin;

import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.AdminAuth;
import gakugeiJob.db.exentity.Admin;
import gakugeiJob.form.admin.LoginForm;
import gakugeiJob.service.LoginService;

public class LoginAction {
	
	@Resource
	@ActionForm 
	protected LoginForm loginForm; 
	
	@Resource
	protected LoginService loginService;
	
	@Execute(validator = false)
	@AdminAuth
    public String index(){
        return "index.jsp";
    }
	
	@Execute(input = "/error/?redirect=true")
	@AdminAuth
	public String login() throws NoSuchAlgorithmException{
		System.out.println("aiueo");
		Admin admin = loginService.selectAdminByUserIdAdminPass(loginForm.adminPass1, loginForm.adminPass2);
		if(admin != null)
			return "/admin/home/?redirect=true";
		return "/?redirect=true";
	}
}
