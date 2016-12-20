package gakugeiJob.action.admin;

import javax.annotation.Resource;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.AdminAuth;
import gakugeiJob.db.exentity.Login;
import gakugeiJob.db.exentity.Student;
import gakugeiJob.form.admin.LoginListForm;
import gakugeiJob.service.LoginService;
import gakugeiJob.service.StudentService;

public class ViewStudentAction {

	@Resource
	@ActionForm
	LoginListForm loginListForm;
	
	@Resource
	StudentService studentService;
	
	@Resource
	LoginService loginService;
	
	public ListResultBean<Student> studentList;
	public ListResultBean<Login> loginList;
	
	@Execute(validator = false)
	@AdminAuth
    public String index(){
		studentList = studentService.selectAll();
		loginList = loginService.selectAll();
        return "index.jsp";
    }
	
	@Execute(validator = false)
	@AdminAuth
	public String delete(){
		studentService.delete(loginListForm.userId);
		return "confirm.jsp";
	}
}
