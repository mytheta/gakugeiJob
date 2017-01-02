package gakugeiJob.action.enterprise;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.EnterpriseAuth;

public class LogoutAction {
	@Execute(validator = false)
	@EnterpriseAuth
	@RemoveSession(name = "enterpriseDto")
	public String index() {
		return "/?redirect=true";
	}

}
