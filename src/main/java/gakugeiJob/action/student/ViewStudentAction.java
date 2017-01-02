package gakugeiJob.action.student;

import javax.annotation.Resource;

import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.StudentAuth;
import gakugeiJob.db.exentity.Login;
import gakugeiJob.db.exentity.Student;
import gakugeiJob.dto.StudentDto;
import gakugeiJob.helper.DateHelper;
import gakugeiJob.service.LoginService;
import gakugeiJob.service.StudentService;

public class ViewStudentAction {

	@Resource 
	StudentService studentService;
	
	@Resource
	LoginService loginService;
	
	@Resource
	protected StudentDto studentDto;
	
	public Student student;
	public Login login;
	public String birthday;
	
	@Execute(validator = false)
	@StudentAuth
    public String index(){
		student = studentService.selectByStudentId(studentDto.studentId);
		if(student.getBirthday() != null)
		birthday = DateHelper.formatYMD1(student.getBirthday());
		
		return "index.jsp";
	}
}
