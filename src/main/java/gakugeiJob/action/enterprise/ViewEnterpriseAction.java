package gakugeiJob.action.enterprise;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.EnterpriseAuth;
import gakugeiJob.db.exentity.Enterprise;
import gakugeiJob.dto.EnterpriseDto;
import gakugeiJob.service.EnterpriseService;

public class ViewEnterpriseAction {

	@Resource
	protected EnterpriseDto enterpriseDto;

	@Resource
	protected EnterpriseService enterpriseService;

	public Enterprise enterprise;

	@Execute(validator = false)
	@EnterpriseAuth
	public String index() {
		enterprise = enterpriseService.select(enterpriseDto.enterpriseId);
		return "index.jsp";
	}

}
