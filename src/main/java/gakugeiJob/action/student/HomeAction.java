package gakugeiJob.action.student;

import javax.annotation.Resource;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.StudentAuth;
import gakugeiJob.db.exentity.Student;
import gakugeiJob.dto.StudentDto;
import gakugeiJob.service.StudentService;

public class HomeAction {

	@Resource
	protected StudentDto studentDto;
	
	@Resource
	protected StudentService studentService;
	
	public ListResultBean<Student> studentList;
	public String userId;
	
	@Execute(validator = false)
	@StudentAuth
    public String index(){
		studentList = studentService.selectAll();
		userId = studentDto.userId;
        return "index.jsp";
	}
}
