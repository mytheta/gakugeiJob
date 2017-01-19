package gakugeiJob.action.enterprise;

import javax.annotation.Resource;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import gakugeiJob.annotation.EnterpriseAuth;
import gakugeiJob.db.exentity.Enterprise;
import gakugeiJob.db.exentity.EnterpriseOffer;
import gakugeiJob.dto.EnterpriseDto;
import gakugeiJob.form.enterprise.EditOfferForm;
import gakugeiJob.service.EnterpriseOfferService;
import gakugeiJob.service.EnterpriseService;

public class EditOfferAction {

	@Resource
	@ActionForm
	EditOfferForm editOfferForm;


	@Resource
	protected EnterpriseDto enterpriseDto;

	@Resource
	protected EnterpriseService enterpriseService;

	@Resource
	EnterpriseOfferService enterpriseOfferService;


	public ListResultBean<Enterprise> enterpriseList;
	public ListResultBean<EnterpriseOffer> enterpriseOfferList;
	public int enterpriseId;
	public int enterpriseOfferId;
	public int jobOfferId;

	@Execute(validator = false)
	@EnterpriseAuth
	public String index() {
		jobOfferId = Integer.parseInt(editOfferForm.jobOfferId);
		enterpriseOfferList = enterpriseOfferService.selectAll();
		enterpriseList = enterpriseService.selectAll();
		return "index.jsp";
	}

	@Execute(validator = false)
	@EnterpriseAuth
	public String edit() throws NumberFormatException, ParseException {
		jobOfferId = Integer.parseInt(editOfferForm.jobOfferId);
		enterpriseOfferService.updateOffer(enterpriseDto.enterpriseId, editOfferForm.description,
				editOfferForm.officeName, editOfferForm.address, editOfferForm.station, editOfferForm.period,
				editOfferForm.holiday, editOfferForm.workingTime, editOfferForm.salary, editOfferForm.qualification,
				editOfferForm.welfare, editOfferForm.oneThing, jobOfferId);
		return "confirm.jsp";
	}
}
