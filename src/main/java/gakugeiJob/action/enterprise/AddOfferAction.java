package gakugeiJob.action.enterprise;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.EnterpriseAuth;
import gakugeiJob.dto.EnterpriseDto;
import gakugeiJob.form.enterprise.EnterpriseOfferForm;
import gakugeiJob.service.EnterpriseService;

public class AddOfferAction {

	@Resource
	@ActionForm
	protected EnterpriseOfferForm enterpriseOfferForm;

	@Resource
	protected EnterpriseService enterpriseService;

	@Resource
	protected EnterpriseDto enterpriseDto;

	public Integer enterpriseId;

	@Execute(validator = false)
	@EnterpriseAuth
	public String index() {
		return "index.jsp";
	}

	@Execute(validator = false)
	@EnterpriseAuth
	public String add() {
		enterpriseId = enterpriseDto.enterpriseId;

		enterpriseService.insertOffer(enterpriseId, enterpriseOfferForm.description,
				enterpriseOfferForm.officeName, enterpriseOfferForm.address, enterpriseOfferForm.station,
				enterpriseOfferForm.period, enterpriseOfferForm.holiday, enterpriseOfferForm.workingTime,
				enterpriseOfferForm.salary, enterpriseOfferForm.qualification, enterpriseOfferForm.welfare,
				enterpriseOfferForm.oneThing);

		return "confirm.jsp";
	}
}
