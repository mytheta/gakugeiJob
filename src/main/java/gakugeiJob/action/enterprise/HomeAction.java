package gakugeiJob.action.enterprise;

import javax.annotation.Resource;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.EnterpriseAuth;
import gakugeiJob.db.exentity.Enterprise;
import gakugeiJob.dto.EnterpriseDto;
import gakugeiJob.service.EnterpriseService;

public class HomeAction {

	@Resource
	protected EnterpriseDto enterpriseDto;

	@Resource
	protected EnterpriseService EnterpriseService;

	public ListResultBean<Enterprise> enterpriseList;
	public String userId;

	@Execute(validator = false)
	@EnterpriseAuth
	public String index() {
		enterpriseList = EnterpriseService.selectAll();
		userId = enterpriseDto.userId;
		return "index.jsp";
	}
}