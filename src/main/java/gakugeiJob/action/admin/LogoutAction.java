package gakugeiJob.action.admin;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.AdminAuth;

public class LogoutAction {
	@Execute(validator = false)
	@AdminAuth
	@RemoveSession(name="adminDto")
    public String index(){
        return "/?redirect=true";
    }
}
