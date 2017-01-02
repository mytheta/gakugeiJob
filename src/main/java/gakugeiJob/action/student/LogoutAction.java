package gakugeiJob.action.student;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.StudentAuth;

public class LogoutAction {
	@Execute(validator = false)
	@StudentAuth
	@RemoveSession(name="studentDto")
    public String index(){
        return "/?redirect=true";
    }
}
