package gakugeiJob.action.student;

import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.StudentAuth;
import gakugeiJob.dto.StudentDto;
import gakugeiJob.form.student.EditPassForm;
import gakugeiJob.service.StudentService;

public class EditPassAction {

	@Resource
	@ActionForm
	protected EditPassForm editPassForm;
	
	@Resource
	protected StudentService studentService;
	
	@Resource
	protected StudentDto studentDto;
	
	@Execute(validator = false)
	@StudentAuth
    public String index(){
        return "index.jsp";
    }
	
	@Execute(input ="/error/?redirect=true")
	@StudentAuth
	public String edit() throws NoSuchAlgorithmException{
		studentService.updatePass(studentDto.userId, editPassForm.userPass);
		return "confirm.jsp";
	}
}
