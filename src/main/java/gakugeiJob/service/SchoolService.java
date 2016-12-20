package gakugeiJob.service;

import java.security.NoSuchAlgorithmException;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.BindingType;

import gakugeiJob.db.cbean.LoginCB;
import gakugeiJob.db.cbean.SchoolCB;
import gakugeiJob.db.exbhv.LoginBhv;
import gakugeiJob.db.exbhv.SchoolBhv;
import gakugeiJob.db.exentity.Login;
import gakugeiJob.db.exentity.School;
import gakugeiJob.helper.LoginHelper;

public class SchoolService {
	@Binding(bindingType = BindingType.MUST)
	protected SchoolBhv schoolBhv;
	
	@Binding(bindingType = BindingType.MUST)
	protected LoginBhv loginBhv;
	
	public ListResultBean<Login> loginList;
	
	public int insertSchool(String userId, String userPass, String name, String kinds, String phoneNumber, String url, String oneThing) throws NoSuchAlgorithmException{
		School school = new School();
		Login login = new Login();
		
		//UserIdが使われているかチェック使われていたら-1を返す
		LoginCB loginCB = new LoginCB();
		loginList =  loginBhv.selectList(loginCB);
		for(Login logincheck : loginList){
			if(logincheck.getUserId().equals(userId)){
				return -1;
			}
		}
		
		school.setUserId(userId);
		school.setName(name);
		school.setKinds(kinds);
		school.setPhoneNumber(phoneNumber);
		school.setUrl(url);
		school.setOneThing(oneThing);
		
		login.setUserId(userId);
		login.setUserPass(LoginHelper.getHash(userPass, userPass));
		login.setRole(2);
		
		loginBhv.insert(login);
		schoolBhv.insert(school);
		
		//正常な処理
		return 0;
	}
	
	public ListResultBean<School> selectAll(){
		SchoolCB schoolCB = new SchoolCB();
		return schoolBhv.selectList(schoolCB);
	}
	
	public void delete(String userId){
		Login login = new Login();
		login.setUserId(userId);
		loginBhv.delete(login);
	}
}
