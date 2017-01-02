package gakugeiJob.service;

import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.util.Date;

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

	public Student selectByStudentId(int studentId){
		return studentBhv.selectByPKValue(studentId);
	}

	public void delete(String userId){
		Login login = new Login();
		login.setUserId(userId);
		loginBhv.delete(login);
	}

	public void updatePass(String userId, String userPass) throws NoSuchAlgorithmException{
		Login login = new Login();
		login.setUserId(userId);
		login.setUserPass(LoginHelper.getHash(userPass, userPass));
		loginBhv.update(login);
	}

	public void update(int studentId, String userId, String fixedUserId, String name, Date birthday, int sex, String phoneNumber, String mailAddress, String address){
		Student student = new Student();
		//一度、新しいカラムをLoginテーブルにinsert
		Login login = new Login();
		Login fixedLogin = new Login();
		login = loginBhv.selectByPKValue(userId);
		fixedLogin = loginBhv.selectByPKValue(userId);
		fixedLogin.setUserId(fixedUserId);
		//ユーザーIDを編集したのであれば、
		if(!(login.getUserId().equals(fixedLogin.getUserId()))){
			//古いユーザー情報を削除（ログインテーブル）
			loginBhv.insert(fixedLogin);
			student.setUserId(fixedUserId);
			student.setStudentId(studentId);
			student.setName(name);
			student.setBirthday(new Timestamp(birthday.getTime()));
			student.setSex(sex);
			student.setPhoneNumber(phoneNumber);
			student.setMailAddress(mailAddress);
			student.setAddress(address);
			studentBhv.update(student);
			loginBhv.delete(login);
		}
		student.setUserId(fixedUserId);
		student.setStudentId(studentId);
		student.setName(name);
		student.setBirthday(new Timestamp(birthday.getTime()));
		student.setSex(sex);
		student.setPhoneNumber(phoneNumber);
		student.setMailAddress(mailAddress);
		student.setAddress(address);
		studentBhv.update(student);
	}
}