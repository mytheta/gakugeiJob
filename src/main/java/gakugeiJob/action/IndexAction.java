package gakugeiJob.action;

import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;

import org.apache.poi.hssf.record.formula.functions.False;
import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.db.exentity.Enterprise;
import gakugeiJob.db.exentity.Login;
import gakugeiJob.db.exentity.School;
import gakugeiJob.db.exentity.Student;
import gakugeiJob.dto.AdminDto;
import gakugeiJob.dto.EnterpriseDto;
import gakugeiJob.dto.SchoolDto;
import gakugeiJob.dto.StudentDto;
import gakugeiJob.form.LoginForm;
import gakugeiJob.service.EnterpriseService;
import gakugeiJob.service.LoginService;
import gakugeiJob.service.SchoolService;
import gakugeiJob.service.StudentService;

public class IndexAction{
	
	@Resource
	@ActionForm
	protected LoginForm loginForm;

	@Resource
	protected LoginService loginService;
	
	@Resource
	protected StudentService studentService;
	
	@Resource
	protected EnterpriseService enterpriseService;
	
	@Resource
	protected SchoolService schoolService;
	
	@Resource
	protected AdminDto adminDto;
	
	@Resource
	protected EnterpriseDto enterpriseDto;
	
	@Resource
	protected SchoolDto schoolDto;
	
	@Resource
	protected StudentDto studentDto;
	
	protected ListResultBean<Student> studentList;
	protected ListResultBean<Enterprise> enterpriseList;
	protected ListResultBean<School> schoolList;
	
	public int result;
	
    @Execute(validator = false)
    public String index(){
        return "index.jsp";
    }
    
    @Execute(validator = false)
    public String login() throws NoSuchAlgorithmException{
		Login login = loginService.selectUserByUserIdUserPassRole(loginForm.userId,loginForm.userPass);
    	if(login != null){
    		if(login.getRole() == 0){
    			adminDto.userId = login.getUserId();
    			return "/admin/login/?redirect=true";
    		}
    		if(login.getRole() == 1){
    			enterpriseDto.userId = login.getUserId();
    			enterpriseList = enterpriseService.selectAll();
    			for(Enterprise enterprise : enterpriseList){
    				if(enterprise.getUserId().equals(login.getUserId())){
    					enterpriseDto.enterpriseId = enterprise.getEnterpriseId();
    				}
    			}
    			return "/enterprise/home/?redirect=true";
    		}
    		if(login.getRole() == 2){
    			schoolDto.userId = login.getUserId();
    			schoolList = schoolService.selectAll();
    			for(School school : schoolList){
    				if(school.getUserId().equals(login.getUserId())){
    					schoolDto.schoolId = school.getSchoolId();
    				}
    			}
    			return "/school/home/?redirect=true";
    		}
    		if(login.getRole() == 3){
    			studentDto.userId = login.getUserId();
    			studentList = studentService.selectAll();
    			for(Student student : studentList){
    				if(student.getUserId().equals(login.getUserId())){
    					studentDto.studentId = student.getStudentId();
    				}
    			}
    			return "/student/home/?redirect=true";
    		}
    	}
    	result = -1;
    	return "/";
    }
}
