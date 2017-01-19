package gakugeiJob.action.school;

import javax.annotation.Resource;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import gakugeiJob.annotation.SchoolAuth;
import gakugeiJob.db.exentity.School;
import gakugeiJob.db.exentity.SchoolOffer;
import gakugeiJob.dto.SchoolDto;
import gakugeiJob.form.school.EditOfferForm;
import gakugeiJob.service.SchoolOfferService;
import gakugeiJob.service.SchoolService;

public class EditOfferAction {

	@Resource
	@ActionForm
	EditOfferForm editOfferForm;

	@Resource
	protected  SchoolDto schoolDto;

	@Resource
	protected SchoolService schoolService;

	@Resource
	SchoolOfferService schoolOfferService;

	public ListResultBean<School> schoolList;
	public ListResultBean<SchoolOffer> schoolOfferList;
	public int schoolId;
	public int schoolOfferId;


	@Execute(validator = false)
	@SchoolAuth
	public String index(){

		schoolId = schoolDto.schoolId;
		schoolOfferList = schoolOfferService.selectAll();
		schoolList = schoolService.selectAll();

		return "index.jsp";
	}

	@Execute(input = "/error/?redirect=true")
	@SchoolAuth
	public String edit() throws NumberFormatException, ParseException{
		schoolOfferId = editOfferForm.schoolOfferId;
		schoolOfferService.updateOffer(schoolOfferId, schoolDto.schoolId, editOfferForm.description, editOfferForm.salary,
				editOfferForm.workSchedule, editOfferForm.period, editOfferForm.address,
				editOfferForm.station, editOfferForm.qualification,
			    editOfferForm.welfare, editOfferForm.oneThing);

		return "confirm.jsp";
	}
}
