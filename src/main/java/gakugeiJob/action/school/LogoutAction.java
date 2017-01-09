package gakugeiJob.action.school;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.SchoolAuth;

public class LogoutAction {

	@Execute(validator = false)
	@SchoolAuth
	@RemoveSession(name="schoolDto")
    public String index(){

        return "/?redirect=true";
    }
}
