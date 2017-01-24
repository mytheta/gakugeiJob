package gakugeiJob.action.admin;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import javax.annotation.Resource;

import org.apache.poi.hssf.record.formula.functions.False;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.AdminAuth;
import gakugeiJob.form.admin.LoginListForm;
import gakugeiJob.service.LoginService;

public class EditEnterpriseAction {

	@Resource
	@ActionForm
	protected LoginListForm loginListForm;
	
	@Resource
	protected LoginService loginService;

	public ArrayList<String> errorMessages;
	
	@Execute(validator = false)
	@AdminAuth
    public String index(){
		String userId = loginListForm.userId;
		return "index.jsp";
    }

	@Execute(validator = false)
	@AdminAuth
	public String edit() throws NoSuchAlgorithmException{
		int i = 0;
    	//エラーチェック変数
    	int result = 0;
    	errorMessages = new ArrayList<String>();
    	
    	//以下はrequiredチェック
    	//ユーザーパスワードに対するエラー遷移
    	if(loginListForm.userPass == null || loginListForm.userPass.length() == 0){
    		result = -1;
    		errorMessages.add("ユーザーパスワードは必須入力項目です。");
    		i++;
    	}
    	//以下は形式チェック
    	//ユーザーパスワードに対するエラー遷移
    	if(!(loginListForm.userPass == null || loginListForm.userPass.length() == 0)){
    	if(!(loginListForm.userPass.matches("[0-9a-zA-Z]{6,12}"))){
    		result = -1;
    		errorMessages.add("そのユーザーパスワードは正しい形式ではありません。");
    		i++;
    	}
    	}
    	//フォームに入力されたものが正しくなかったらエラー遷移
    	if(result != 0){
    		return "error.jsp";
    	}
		loginService.updatePass(loginListForm.userId, loginListForm.userPass);
		return "confirm.jsp";
	}
}

