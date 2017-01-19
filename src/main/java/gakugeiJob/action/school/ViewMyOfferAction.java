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
import gakugeiJob.db.exentity.Student;
import gakugeiJob.dto.SchoolDto;
import gakugeiJob.form.school.SchoolOfferForm;
import gakugeiJob.service.SchoolOfferService;
import gakugeiJob.service.SchoolService;
import gakugeiJob.service.StudentService;

public class ViewMyOfferAction {

	@Resource
	@ActionForm
	SchoolOfferForm schoolOfferForm;

	@Resource
	protected  SchoolDto schoolDto;

	@Resource
	protected SchoolService schoolService;

	@Resource
	SchoolOfferService schoolOfferService;

	@Resource
	StudentService studentService;

	public ListResultBean<SchoolOffer> schoolOfferList;
	public ListResultBean<School> schoolList;
	public ListResultBean<SchoolFavo> schoolFavoList;
	public ListResultBean<SchoolAplicant> schoolAplicantList;
	public ListResultBean<SchoolAplicant> studentOfferList;
	public ListResultBean<Student> studentList;
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

	@Execute(validator = false)
	@SchoolAuth
	public String view(){
		schoolOfferId = Integer.parseInt(schoolOfferForm.schoolOfferId);
		schoolOfferList = schoolOfferService.selectAll();
		schoolList = schoolService.selectAll();
		schoolFavoList = schoolOfferService.selectAllFavo();
		schoolAplicantList = schoolOfferService.selectAllAplicant();
		return "detail.jsp";
	}

	@Execute(validator = false)
	@SchoolAuth
	public String offer() {
		schoolOfferId = Integer.parseInt(schoolOfferForm.schoolOfferId);
		studentOfferList = schoolOfferService.selectAplicant(schoolOfferId);
		studentList = studentService.selectAll();
		return "offer.jsp";
	}

	@Execute(validator = false)
	@SchoolAuth
	public String favo() {
		schoolOfferId = Integer.parseInt(schoolOfferForm.schoolOfferId);
		schoolFavoList = schoolOfferService.selectAllFavo();
		studentList = studentService.selectAll();
		return "favo.jsp";
	}
}