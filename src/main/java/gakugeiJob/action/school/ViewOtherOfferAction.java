package gakugeiJob.action.school;

import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.SchoolAuth;

public class ViewOtherOfferAction {

	@Execute(validator = false)
	@SchoolAuth
	public String index(){
		return "index.jsp";
	}
}