package gakugeiJob.service;

import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.BindingType;

import gakugeiJob.db.cbean.LoginCB;
import gakugeiJob.db.cbean.SchoolCB;
import gakugeiJob.db.exbhv.LoginBhv;
import gakugeiJob.db.exbhv.SchoolBhv;
import gakugeiJob.db.exbhv.SchoolOfferBhv;
import gakugeiJob.db.exentity.Login;
import gakugeiJob.db.exentity.School;
import gakugeiJob.db.exentity.SchoolOffer;
import gakugeiJob.helper.LoginHelper;

public class SchoolService {
	@Binding(bindingType = BindingType.MUST)
	protected SchoolBhv schoolBhv;

	@Binding(bindingType = BindingType.MUST)
	protected LoginBhv loginBhv;

	@Binding(bindingType = BindingType.MUST)
	protected SchoolOfferBhv schoolOfferBhv;

	public ListResultBean<Login> loginList;

	public int insertSchool(String userId, String userPass, String name,
			String kinds, String phoneNumber, String mailAddress, String url,
			String oneThing) throws NoSuchAlgorithmException{
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
		school.setMailAddress(mailAddress);
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

	public void insertOffer(int  schoolId, String description, String salary,
			String workSchedule, String period, String address, String station,
			String qualification, String welfare, String oneThing){

		SchoolOffer schoolOffer = new SchoolOffer();

		schoolOffer.setSchoolId(schoolId);
		schoolOffer.setDescription(description);
		schoolOffer.setSalary(salary);
		schoolOffer.setWorkSchedule(workSchedule);
		schoolOffer.setPeriod(period);
		schoolOffer.setAddress(address);
		schoolOffer.setStation(station);
		schoolOffer.setQualification(qualification);
		schoolOffer.setWelfare(welfare);
		schoolOffer.setOneThing(oneThing);
		Timestamp registrationDate = new Timestamp(System.currentTimeMillis());
		schoolOffer.setRegistrationDate(registrationDate);
		schoolOffer.setFavo(0);
		schoolOfferBhv.insert(schoolOffer);
	}


	public School select(int schoolId){
		return schoolBhv.selectByPKValue(schoolId);
	}

	public ListResultBean<School> selectAll(){
		SchoolCB schoolCB = new SchoolCB();
		return schoolBhv.selectList(schoolCB);
	}

	public School selectBySchoolId(int schoolId){
		return schoolBhv.selectByPKValue(schoolId);
	}

	public void delete(String userId){
		Login login = new Login();
		login.setUserId(userId);
		loginBhv.delete(login);
	}

	public void updataPass(String userId, String userPass)throws NoSuchAlgorithmException{
		Login login = new Login();
		login.setUserId(userId);
		login.setUserPass(LoginHelper.getHash(userPass, userPass));
		loginBhv.update(login);
	}

	public int update(int schoolId, String userId, String fixedUserId, String name, String kinds, String phoneNumber, String mailAddress, String url, String oneThing){
		School school = new School();
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
			school.setUserId(fixedUserId);
			school.setSchoolId(schoolId);
			school.setName(name);
			school.setKinds(kinds);
			school.setPhoneNumber(phoneNumber);
			school.setMailAddress(mailAddress);
			school.setUrl(url);
			school.setOneThing(oneThing);
			schoolBhv.update(school);
			loginBhv.delete(login);
		}
		school.setUserId(fixedUserId);
		school.setSchoolId(schoolId);
		school.setName(name);
		school.setKinds(kinds);
		school.setPhoneNumber(phoneNumber);
		school.setMailAddress(mailAddress);
		school.setUrl(url);
		school.setOneThing(oneThing);
		schoolBhv.update(school);

		return 0;
	}

	public void deleteSchool(String userId){
		Login login = new Login();
		login = loginBhv.selectByPKValue(userId);
		loginBhv.delete(login);
	}

}
