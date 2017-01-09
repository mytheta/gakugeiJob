package gakugeiJob.action.school;

import javax.annotation.Resource;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.SchoolAuth;
import gakugeiJob.db.exentity.School;
import gakugeiJob.db.exentity.SchoolAplicant;
import gakugeiJob.db.exentity.SchoolFavo;
import gakugeiJob.db.exentity.SchoolOffer;
import gakugeiJob.dto.SchoolDto;
import gakugeiJob.form.school.SchoolOfferForm;
import gakugeiJob.service.SchoolOfferService;
import gakugeiJob.service.SchoolService;

public class ViewOtherOfferAction {

	@Resource
	@ActionForm
	SchoolOfferForm schoolOfferForm;

	@Resource
	protected SchoolDto schoolDto;

	@Resource
	SchoolService schoolService;

	@Resource
	SchoolOfferService schoolOfferService;

	public ListResultBean<SchoolOffer> schoolOfferList;
	public ListResultBean<School> schoolList;
	public ListResultBean<SchoolFavo> schoolFavoList;
	public ListResultBean<SchoolAplicant> schoolAplicantList;
	public int schoolId;
	public int jobOfferId;

	@Execute(validator = false)
	@SchoolAuth
	public String index(){
		schoolId = schoolDto.schoolId;
		schoolOfferList = schoolOfferService.selectAll();
		schoolList = schoolService.selectAll();
		return "index.jsp";
	}

	@Execute(validator = false)
	@SchoolAuth
	public String view(){
		jobOfferId = Integer.parseInt(schoolOfferForm.jobOfferId);
		schoolOfferList = schoolOfferService.selectAll();
		schoolList = schoolService.selectAll();
		schoolFavoList = schoolOfferService.selectAllFavo();
		schoolAplicantList = schoolOfferService.selectAllAplicant();
		return "detail.jsp";
	}
}
