package gakugeiJob.action.school;

import javax.annotation.Resource;

import org.seasar.framework.aop.annotation.RemoveSession;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.SchoolAuth;
import gakugeiJob.dto.SchoolDto;
import gakugeiJob.service.SchoolService;

public class DeleteSchoolAction {

	@Resource
	protected SchoolDto schoolDto;

	@Resource
	protected SchoolService schoolService;

	String userId;

	@Execute(validator = false)
	@SchoolAuth
	public String index(){
		return "index.jsp";
	}

	@Execute(validator = false)
	@SchoolAuth
	@RemoveSession(name="schoolDto")
    public String delete(){
		schoolService.deleteSchool(schoolDto.userId);

        return "/?redirect=true";
    }
}
