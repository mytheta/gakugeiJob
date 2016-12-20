package gakugeiJob.service;

import java.security.NoSuchAlgorithmException;
import java.util.List;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.framework.container.annotation.tiger.Binding;
import org.seasar.framework.container.annotation.tiger.BindingType;

import gakugeiJob.db.cbean.AdminCB;
import gakugeiJob.db.cbean.LoginCB;
import gakugeiJob.db.exbhv.AdminBhv;
import gakugeiJob.db.exbhv.LoginBhv;
import gakugeiJob.db.exentity.Admin;
import gakugeiJob.db.exentity.Login;
import gakugeiJob.helper.LoginHelper;
import gakugeiJob.dto.AdminDto;

public class LoginService {
	@Binding(bindingType = BindingType.MUST)
	protected LoginBhv loginBhv;
	
	@Binding(bindingType = BindingType.MUST)
	protected AdminBhv adminBhv;
	
	public Login selectUserByUserIdUserPassRole(String userId, String password) throws NoSuchAlgorithmException{
		LoginCB loginCB = new LoginCB();
		loginCB.query().setUserId_Equal(userId);
		//ハッシュ化を実装した際
		loginCB.query().setUserPass_Equal(LoginHelper.getHash(password, password));
		//
		/*ハッシュ化を実装する前
		loginCB.query().setUserPass_Equal(password);	  
		*/
		
		for(int i=0; i<4; i++){
			loginCB.query().setRole_Equal(i); 
			Login login = loginBhv.selectEntity(loginCB);
			//ログインテーブルに情報があれば、そのインスタンスを返す
			if(login != null){
				return login;
			}
		}
		//ログインテーブルに情報がなければ、nullを返す
		return null;
	}
	
	public Admin selectAdminByUserIdAdminPass(String adminPass1, String adminPass2) throws NoSuchAlgorithmException{
		AdminCB adminCB = new AdminCB();
		AdminDto adminDto = new AdminDto();
		adminCB.query().setUserId_Equal(adminDto.userId);
		adminCB.query().setAdminPass1_Equal(LoginHelper.getHash(adminPass1, adminPass1));
		adminCB.query().setAdminPass2_Equal(LoginHelper.getHash(adminPass2, adminPass2));
		Admin admin = adminBhv.selectEntity(adminCB);
		if(admin != null)
			return admin;
		return null;
	}
	
	public ListResultBean<Login> selectAll(){
		LoginCB loginCB = new LoginCB();
		return loginBhv.selectList(loginCB);
	}
	
	public void updatePass(String userId, String userPass) throws NoSuchAlgorithmException{
		Login login = new Login();
		login.setUserId(userId);
		login.setUserPass(LoginHelper.getHash(userPass, userPass));
		loginBhv.update(login);
	}
}
