package gakugeiJob.action.enterprise;

import javax.annotation.Resource;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.EnterpriseAuth;
import gakugeiJob.dto.EnterpriseDto;
import gakugeiJob.service.EnterpriseService;

public class DeleteEnterpriseAction {

	@Resource
	protected EnterpriseDto enterpriseDto;

	@Resource
	protected EnterpriseService enterpriseService;

	String userId;

	@Execute(validator = false)
	@EnterpriseAuth
	public String index(){
		return "index.jsp";
	}

	@Execute(validator = false)
	@EnterpriseAuth
	@RemoveSession(name="enterpriseDto")
    public String delete(){
		enterpriseService.deleteEnterprise(enterpriseDto.userId);

        return "/?redirect=true";
    }

}
