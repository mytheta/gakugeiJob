package gakugeiJob.action.enterprise;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.EnterpriseAuth;
import gakugeiJob.db.exentity.Enterprise;
import gakugeiJob.dto.EnterpriseDto;
import gakugeiJob.form.enterprise.EditEnterpriseForm;
import gakugeiJob.service.EnterpriseService;

public class EditEnterpriseAction {

	@ActionForm
	@Resource
	protected EditEnterpriseForm editEnterpriseForm;

	@Resource
	protected EnterpriseService enterpriseService;

	@Resource
	protected EnterpriseDto enterpriseDto;

	public Enterprise enterprise;

	@Execute(validator = false)
	@EnterpriseAuth
	public String index() {
		enterprise = enterpriseService.select(enterpriseDto.enterpriseId);
		return "index.jsp";
	}
}
