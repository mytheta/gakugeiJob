package gakugeiJob.service;

import java.security.NoSuchAlgorithmException;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.BindingType;

import gakugeiJob.db.cbean.LoginCB;
import gakugeiJob.db.cbean.StudentCB;
import gakugeiJob.db.exbhv.LoginBhv;
import gakugeiJob.db.exbhv.StudentBhv;
import gakugeiJob.db.exentity.Login;
import gakugeiJob.db.exentity.Student;
import gakugeiJob.helper.LoginHelper;

public class StudentService {

	@Binding(bindingType = BindingType.MUST)
	protected StudentBhv studentBhv;
	
	@Binding(bindingType = BindingType.MUST)
	protected LoginBhv loginBhv;
	
	public ListResultBean<Login> loginList;
	
	public int insertStudent(String userId, String userPass) throws NoSuchAlgorithmException{
		Student student = new Student();
		Login login = new Login();
		
		//UserIdが使われているかチェック使われていたら-1を返す
		LoginCB loginCB = new LoginCB();
		loginList =  loginBhv.selectList(loginCB);
		for(Login logincheck : loginList){
			if(logincheck.getUserId().equals(userId)){
				return -1;
			}
		}
		
		student.setUserId(userId);
		
		login.setUserId(userId);
		login.setUserPass(LoginHelper.getHash(userPass, userPass));
		login.setRole(3);
		
		loginBhv.insert(login);
		studentBhv.insert(student);
		
		//正常な処理
		return 0;
	}
	
	public ListResultBean<Student> selectAll(){
		StudentCB studentCB = new StudentCB();
		return studentBhv.selectList(studentCB);
	}
	
	public void delete(String userId){
		Login login = new Login();
		login.setUserId(userId);
		loginBhv.delete(login);
	}
}