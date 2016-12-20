package gakugeiJob.service;

import java.security.NoSuchAlgorithmException;

import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.BindingType;

import gakugeiJob.db.exbhv.AdminBhv;
import gakugeiJob.db.exbhv.LoginBhv;
import gakugeiJob.db.exentity.Admin;
import gakugeiJob.db.exentity.Login;
import gakugeiJob.helper.LoginHelper;

public class AdminService {
	@Binding(bindingType = BindingType.MUST)
	protected AdminBhv adminBhv;
	
	@Binding(bindingType = BindingType.MUST)
	protected LoginBhv loginBhv;
	
	public void updateAdminPass(String userId, String userPass, String adminPass1, String adminPass2) throws NoSuchAlgorithmException{
		Admin admin = new Admin();
		Login login = new Login();
		
		admin.setUserId(userId);
		admin.setAdminPass1(LoginHelper.getHash(adminPass1, adminPass1));
		admin.setAdminPass2(LoginHelper.getHash(adminPass2, adminPass2));
		
		login.setUserId(userId);
		login.setUserPass(LoginHelper.getHash(userPass, userPass));
		
		loginBhv.update(login);
		adminBhv.update(admin);
	}
}
