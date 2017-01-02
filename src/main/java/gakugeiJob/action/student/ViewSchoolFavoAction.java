package gakugeiJob.action.student;

import javax.annotation.Resource;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.StudentAuth;
import gakugeiJob.db.exentity.School;
import gakugeiJob.db.exentity.SchoolFavo;
import gakugeiJob.db.exentity.SchoolOffer;
import gakugeiJob.dto.StudentDto;
import gakugeiJob.form.student.AddSchoolOfferForm;
import gakugeiJob.service.SchoolOfferService;
import gakugeiJob.service.SchoolService;

public class ViewSchoolFavoAction {

	@Resource
	@ActionForm
	AddSchoolOfferForm addSchoolOfferForm;
	
	@Resource
	SchoolService schoolService;
	
	@Resource
	SchoolOfferService schoolOfferService;
	
	@Resource
	StudentDto studentDto;
	
	public ListResultBean<SchoolOffer> schoolOfferList;
	public ListResultBean<SchoolFavo> schoolFavoList;
	public ListResultBean<School> schoolList;
	public int schoolOfferId;
	public int studentId;
	
	@Execute(validator = false)
	@StudentAuth
    public String index(){
		schoolOfferList = schoolOfferService.selectAll();
		studentId = studentDto.studentId;
		schoolList = schoolService.selectAll();
		schoolFavoList = schoolOfferService.selectAllFavo();
		return "index.jsp";
	}
	
	@Execute(validator = false)
	@StudentAuth
	public String delete(){
		schoolOfferService.deleteFavo(Integer.parseInt(addSchoolOfferForm.schoolOfferId), studentDto.studentId);
		return "delete.jsp";
	}
}
