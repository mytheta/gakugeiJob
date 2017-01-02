package gakugeiJob.action.school;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.SchoolAuth;
import gakugeiJob.db.exentity.School;
import gakugeiJob.dto.SchoolDto;
import gakugeiJob.service.SchoolService;

public class ViewSchoolAction {

	@Resource
	protected SchoolDto schoolDto;

	@Resource
	protected SchoolService schoolService;

	public School school;


	@Execute(validator = false)
	@SchoolAuth
	public String index(){
		school = schoolService.select(schoolDto.schoolId);
		return "index.jsp";
	}
}