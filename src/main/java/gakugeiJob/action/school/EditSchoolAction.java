package gakugeiJob.action.school;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import gakugeiJob.annotation.SchoolAuth;
import gakugeiJob.db.exentity.School;
import gakugeiJob.dto.SchoolDto;
import gakugeiJob.form.school.EditSchoolForm;
import gakugeiJob.service.SchoolService;

public class EditSchoolAction {

	@Resource
	@ActionForm
	EditSchoolForm editSchoolForm;

	@Resource
	SchoolService schoolService;

	@Resource
	SchoolDto schoolDto;

	public School school;

	@Execute(validator = false)
	@SchoolAuth
	public String index(){
		school = schoolService.selectBySchoolId(schoolDto.schoolId);

		return "index.jsp";
	}

	@Execute(input = "/error/?redirect=true")
	@SchoolAuth
	public String edit() throws NumberFormatException, ParseException{
		schoolService.update(schoolDto.schoolId, schoolDto.userId, editSchoolForm.userId, editSchoolForm.name, editSchoolForm.kinds,
				editSchoolForm.phoneNumber, editSchoolForm.mailAddress, editSchoolForm.url, editSchoolForm.oneThing);
		schoolDto.userId = editSchoolForm.userId;
		return "confirm.jsp";
	}
}
