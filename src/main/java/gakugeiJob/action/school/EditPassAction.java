package gakugeiJob.action.school;

import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.SchoolAuth;
import gakugeiJob.dto.SchoolDto;
import gakugeiJob.form.student.EditPassForm;
import gakugeiJob.service.SchoolService;

public class EditPassAction {

	@Resource
	@ActionForm
	protected EditPassForm editPassForm;

	@Resource
	protected SchoolService schoolService;

	@Resource
	protected SchoolDto schoolDto;

	@Execute(validator = false)
	@SchoolAuth
	public String index(){
		return "index.jsp";
	}

	@Execute(input ="/error/?redirect=true")
	@SchoolAuth
	public String edit() throws NoSuchAlgorithmException{
		schoolService.updataPass(schoolDto.userId, editPassForm.userPass);
		return "confirm.jsp";
	}

}