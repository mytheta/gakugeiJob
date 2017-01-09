package gakugeiJob.action.school;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.SchoolAuth;
import gakugeiJob.dto.SchoolDto;
import gakugeiJob.form.school.SchoolOfferForm;
import gakugeiJob.service.SchoolService;

public class AddOfferAction {

	@Resource
	@ActionForm
	protected SchoolOfferForm schoolOfferForm;

	@Resource
	protected SchoolService schoolService;

	@Resource
	protected SchoolDto schoolDto;

	public Integer schoolId;

	@Execute(validator = false)
	@SchoolAuth
	public String index(){
		return "index.jsp";
	}

	@Execute(input = "/error/?redirect=true")
	@SchoolAuth
	public String add(){
		schoolId = schoolDto.schoolId;

		schoolService.insertOffer(schoolId, schoolOfferForm.description, schoolOfferForm.salary,
				schoolOfferForm.workSchedule, schoolOfferForm.period, schoolOfferForm.address,
				schoolOfferForm.station, schoolOfferForm.qualification,
				schoolOfferForm.welfare, schoolOfferForm.oneThing);

		return "confirm.jsp";
	}

}
