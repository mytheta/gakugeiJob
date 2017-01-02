package gakugeiJob.action.enterprise;

import javax.annotation.Resource;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.EnterpriseAuth;
import gakugeiJob.db.exentity.Enterprise;
import gakugeiJob.db.exentity.EnterpriseAplicant;
import gakugeiJob.db.exentity.EnterpriseFavo;
import gakugeiJob.db.exentity.EnterpriseOffer;
import gakugeiJob.dto.EnterpriseDto;
import gakugeiJob.form.enterprise.EnterpriseOfferForm;
import gakugeiJob.service.EnterpriseOfferService;
import gakugeiJob.service.EnterpriseService;

public class ViewMyOfferAction {

	@Resource
	@ActionForm
	EnterpriseOfferForm enterpriseOfferForm;

	@Resource
	protected EnterpriseDto enterpriseDto;

	@Resource
	EnterpriseService enterpriseService;

	@Resource
	EnterpriseOfferService enterpriseOfferService;

	public ListResultBean<EnterpriseOffer> enterpriseOfferList;
	public ListResultBean<Enterprise> enterpriseList;
	public ListResultBean<EnterpriseFavo> enterpriseFavoList;
	public ListResultBean<EnterpriseAplicant> enterpriseAplicantList;
	public int enterpriseId;
	public int jobOfferId;

	@Execute(validator = false)
	@EnterpriseAuth
	public String index() {

		enterpriseId = enterpriseDto.enterpriseId;
		enterpriseOfferList = enterpriseOfferService.selectAll();
		enterpriseList = enterpriseService.selectAll();
		return "index.jsp";
	}

	@Execute(validator = false)
	@EnterpriseAuth
	public String view() {
		jobOfferId = Integer.parseInt(enterpriseOfferForm.jobOfferId);
		enterpriseOfferList = enterpriseOfferService.selectAll();
		enterpriseList = enterpriseService.selectAll();
		enterpriseFavoList = enterpriseOfferService.selectAllFavo();
		enterpriseAplicantList = enterpriseOfferService.selectAllAplicant();
		return "detail.jsp";
	}

}
