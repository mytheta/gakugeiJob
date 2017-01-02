package gakugeiJob.action.enterprise;

import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.EnterpriseAuth;

public class EditPassAction {

	@Execute(validator = false)
	@EnterpriseAuth
	public String index() {
		return "index.jsp";
	}

}
