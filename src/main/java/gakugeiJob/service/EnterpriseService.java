package gakugeiJob.service;

import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.BindingType;

import gakugeiJob.db.cbean.EnterpriseCB;
import gakugeiJob.db.cbean.LoginCB;
import gakugeiJob.db.exbhv.EnterpriseBhv;
import gakugeiJob.db.exbhv.EnterpriseOfferBhv;
import gakugeiJob.db.exbhv.LoginBhv;
import gakugeiJob.db.exentity.Enterprise;
import gakugeiJob.db.exentity.EnterpriseOffer;
import gakugeiJob.db.exentity.Login;
import gakugeiJob.helper.LoginHelper;

public class EnterpriseService {
	@Binding(bindingType = BindingType.MUST)
	protected EnterpriseBhv enterpriseBhv;

	@Binding(bindingType = BindingType.MUST)
	protected LoginBhv loginBhv;

	@Binding(bindingType = BindingType.MUST)
	protected EnterpriseOfferBhv enterpriseOfferBhv;

	public ListResultBean<Login> loginList;

	public int insertEnterprise(String userId, String userPass, String name, String foundingDate, String founderName,
			String address, String capital, String presidentName, String numOfEmployees, String business, String phoneNumber,
			String url, String oneThing, String mailAddress) throws NoSuchAlgorithmException{
		Enterprise enterprise = new Enterprise();
		Login login = new Login();

		//UserIdが使われているかチェック使われていたら-1を返す
		LoginCB loginCB = new LoginCB();
		loginList =  loginBhv.selectList(loginCB);
		for(Login logincheck : loginList){
			if(logincheck.getUserId().equals(userId)){
				return -1;
			}
		}

		enterprise.setUserId(userId);
		enterprise.setName(name);
		enterprise.setFoundingDate(foundingDate);
		enterprise.setFounderName(founderName);
		enterprise.setAddress(address);
		enterprise.setCapital(capital);
		enterprise.setPresidentName(presidentName);
		enterprise.setNumOfEmployees(numOfEmployees);
		enterprise.setBusiness(business);
		enterprise.setPhoneNumber(phoneNumber);
		enterprise.setUrl(url);
		enterprise.setOneThing(oneThing);
		enterprise.setMailAddress(mailAddress);

		login.setUserId(userId);
		login.setUserPass(LoginHelper.getHash(userPass, userPass));
		login.setRole(1);

		loginBhv.insert(login);
		enterpriseBhv.insert(enterprise);

		//正常な処理
		return 0;
	}

	public void insertOffer(int enterpriseId, String description, String officeName, String address,
			String station, String period, String holiday, String workingTime, String salary, String qualification,
			String welfare, String oneThing) {

		EnterpriseOffer enterpriseOffer = new EnterpriseOffer();

		enterpriseOffer.setEnterpriseId(enterpriseId);
		enterpriseOffer.setDescription(description);
		enterpriseOffer.setOfficeName(officeName);
		enterpriseOffer.setAddress(address);
		enterpriseOffer.setStation(station);
		enterpriseOffer.setPeriod(period);
		enterpriseOffer.setHoliday(holiday);
		enterpriseOffer.setWorkingTime(workingTime);
		enterpriseOffer.setSalary(salary);
		enterpriseOffer.setQualification(qualification);
		enterpriseOffer.setWelfare(welfare);
		enterpriseOffer.setOneThing(oneThing);
		Timestamp registrationDate = new Timestamp(System.currentTimeMillis());
		enterpriseOffer.setRegistrationDate(registrationDate);
		enterpriseOffer.setFavo(0);
		enterpriseOfferBhv.insert(enterpriseOffer);
	}

	public int update(int enterpriseId, String userId, String fixedUserId, String name,
			String foundingDate, String founderName,
			String address, String capital, String presidentName, String numOfEmployees, String business,
			String phoneNumber, String url, String oneThing, String mailAddress) {

		// UserIdが使われているかチェック使われていたら-1を返す
		LoginCB loginCB = new LoginCB();
		loginList = loginBhv.selectList(loginCB);
		for (Login logincheck : loginList) {
			if (logincheck.getUserId().equals(fixedUserId) && !(userId.equals(fixedUserId))) {
				return -1;
			}
		}
		Enterprise enterprise = new Enterprise();
		// 一度、新しいカラムをLoginテーブルにinsert
		Login login = new Login();
		Login fixedLogin = new Login();
		login = loginBhv.selectByPKValue(userId);
		fixedLogin = loginBhv.selectByPKValue(userId);
		fixedLogin.setUserId(fixedUserId);
		// ユーザーIDを編集したのであれば、
		if (!(login.getUserId().equals(fixedLogin.getUserId()))) {
			// 古いユーザー情報を削除（ログインテーブル）
			loginBhv.insert(fixedLogin);
			enterprise.setUserId(fixedUserId);
			enterprise.setEnterpriseId(enterpriseId);
			enterprise.setName(name);
			enterprise.setFoundingDate(foundingDate);
			enterprise.setFounderName(founderName);
			enterprise.setAddress(address);
			enterprise.setCapital(capital);
			enterprise.setPresidentName(presidentName);
			enterprise.setNumOfEmployees(numOfEmployees);
			enterprise.setBusiness(business);
			enterprise.setPhoneNumber(phoneNumber);
			enterprise.setUrl(url);
			enterprise.setOneThing(oneThing);
			enterprise.setMailAddress(mailAddress);
			enterpriseBhv.update(enterprise);
			loginBhv.delete(login);
		}
		enterprise.setUserId(fixedUserId);
		enterprise.setEnterpriseId(enterpriseId);
		enterprise.setName(name);
		enterprise.setFoundingDate(foundingDate);
		enterprise.setFounderName(founderName);
		enterprise.setAddress(address);
		enterprise.setCapital(capital);
		enterprise.setPresidentName(presidentName);
		enterprise.setNumOfEmployees(numOfEmployees);
		enterprise.setBusiness(business);
		enterprise.setPhoneNumber(phoneNumber);
		enterprise.setUrl(url);
		enterprise.setOneThing(oneThing);
		enterprise.setMailAddress(mailAddress);
		enterpriseBhv.update(enterprise);
		// 正常な処理
		return 0;
	}

	public Enterprise select(int enterpriseId) {
		return enterpriseBhv.selectByPKValue(enterpriseId);
	}

	public ListResultBean<Enterprise> selectAll(){
		EnterpriseCB enterpriseCB = new EnterpriseCB();
		return enterpriseBhv.selectList(enterpriseCB);
	}

	public void delete(String userId){
		Login login = new Login();
		login.setUserId(userId);
		loginBhv.delete(login);
	}

	public void updatePass(String userId, String userPass) throws NoSuchAlgorithmException {
		Login login = new Login();
		login.setUserId(userId);
		login.setUserPass(LoginHelper.getHash(userPass, userPass));
		loginBhv.update(login);
	}

	public void deleteEnterprise(String userId) {
		Login login = new Login();
		login = loginBhv.selectByPKValue(userId);
		loginBhv.delete(login);
	}
}
