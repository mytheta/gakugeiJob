package gakugeiJob.action;

import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.db.exentity.Login;
import gakugeiJob.dto.AdminDto;
import gakugeiJob.dto.EnterpriseDto;
import gakugeiJob.dto.SchoolDto;
import gakugeiJob.dto.StudentDto;
import gakugeiJob.form.LoginForm;
import gakugeiJob.service.LoginService;

public class IndexAction{
	
	@Resource
	@ActionForm
	protected LoginForm loginForm;

	@Resource
	protected LoginService loginService;
	
	@Resource
	protected AdminDto adminDto;
	
	@Resource
	protected EnterpriseDto enterpriseDto;
	
	@Resource
	protected SchoolDto schoolDto;
	
	@Resource
	protected StudentDto studentDto;
	
    @Execute(validator = false)
    public String index(){
        return "index.jsp";
    }
    
    @Execute(input = "/error/?redirect=true")
    public String login() throws NoSuchAlgorithmException{
		Login login = loginService.selectUserByUserIdUserPassRole(loginForm.userId,loginForm.userPass);
    	if(login != null){
    		if(login.getRole() == 0){
    			adminDto.userId = login.getUserId();
    			return "/admin/login/?redirect=true";
    		}
    		if(login.getRole() == 1){
    			enterpriseDto.userId = login.getUserId();
    			return "/enterprise/home/?redirect=true";
    		}
    		if(login.getRole() == 2){
    			schoolDto.userId = login.getUserId();
    			return "/school/home/?redirect=true";
    		}
    		if(login.getRole() == 3){
    			studentDto.userId = login.getUserId();
    			return "/student/home/?redirect=true";
    		}
    	}
    	return "/?redirect=true";
    }
}
