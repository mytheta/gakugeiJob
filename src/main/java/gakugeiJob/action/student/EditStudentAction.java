package gakugeiJob.action.student;

import java.text.ParseException;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.StudentAuth;
import gakugeiJob.db.exentity.Student;
import gakugeiJob.dto.StudentDto;
import gakugeiJob.form.student.EditStudentForm;
import gakugeiJob.helper.DateHelper;
import gakugeiJob.service.StudentService;

public class EditStudentAction {

	@Resource
	@ActionForm
	EditStudentForm editStudentForm;

	@Resource
	StudentService studentService;

	@Resource
	StudentDto studentDto;

	public Student student;
	public String birthday;

	@Execute(validator = false)
	@StudentAuth
    public String index(){
		student = studentService.selectByStudentId(studentDto.studentId);
		if(student.getBirthday() != null)
		birthday = DateHelper.formatYMD2(student.getBirthday());

        return "index.jsp";
	}

	@Execute(input ="/error/?redirect=true")
	@StudentAuth
	public String edit() throws NumberFormatException, ParseException{
		studentService.update(studentDto.studentId, studentDto.userId, editStudentForm.userId, editStudentForm.name, DateHelper.parse(editStudentForm.birthday),
				Integer.parseInt(editStudentForm.sex), editStudentForm.phoneNumber, editStudentForm.mailAddress, editStudentForm.address);
		studentDto.userId = editStudentForm.userId;
		return "confirm.jsp";
	}
}
