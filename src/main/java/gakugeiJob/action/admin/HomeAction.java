package gakugeiJob.action.admin;

import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.AdminAuth;

public class HomeAction {
	
	@Execute(validator = false)
	@AdminAuth
    public String index(){
        return "index.jsp";
    }
}
