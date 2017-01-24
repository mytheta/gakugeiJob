package gakugeiJob.action.admin;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.AdminAuth;
import gakugeiJob.dto.AdminDto;
import gakugeiJob.form.admin.EditPassForm;
import gakugeiJob.service.AdminService;

public class EditPassAction {

	@Resource
	@ActionForm
	protected EditPassForm editPassForm;
	
	@Resource
	protected AdminService adminService;
	
	@Resource
	protected AdminDto adminDto;
	
	public ArrayList<String> errorMessages;
	
	@Execute(validator = false)
	@AdminAuth
    public String index(){
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
    	if(editPassForm.userPass == null || editPassForm.userPass.length() == 0){
    		result = -1;
    		errorMessages.add("ユーザーパスワードは必須入力項目です。");
    		i++;
    	}
    	//管理者パスワード1に対するエラー遷移
    	if(editPassForm.adminPass1 == null || editPassForm.adminPass1.length() == 0){
    		result = -1;
    		errorMessages.add("管理者パスワード1は必須入力項目です。");
    		i++;
    	}
    	//管理者パスワード2に対するエラー遷移
    	if(editPassForm.adminPass2 == null || editPassForm.adminPass2.length() == 0){
    		result = -1;
    		errorMessages.add("管理者パスワード2は必須入力項目です。");
    		i++;
    	}	
    	
    	//以下は形式チェック
    	//ユーザーパスワードに対するエラー遷移
    	if(!(editPassForm.userPass == null || editPassForm.userPass.length() == 0)){
    	if(!(editPassForm.userPass.matches("[0-9a-zA-Z]{6,12}"))){
    		result = -1;
    		errorMessages.add("そのユーザーパスワードは正しい形式ではありません。");
    		i++;
    	}
    	}
    	//管理者パスワード1に対するエラー遷移
    	if(!(editPassForm.adminPass1 == null || editPassForm.adminPass1.length() == 0)){
    	if(!(editPassForm.adminPass1.matches("[0-9a-zA-Z]{6,12}"))){
    		result = -1;
    		errorMessages.add("その管理者パスワード1は正しい形式ではありません。");
    		i++;
    	}
    	}
    	//管理者パスワード2に対するエラー遷移
    	if(!(editPassForm.adminPass2 == null || editPassForm.adminPass2.length() == 0)){
    	if(!(editPassForm.adminPass2.matches("[0-9a-zA-Z]{6,12}"))){
    		result = -1;
    		errorMessages.add("その管理者パスワード2は正しい形式ではありません。");
    		i++;
    	}
    	}
    	//フォームに入力されたものが正しくなかったらエラー遷移
    	if(result != 0){
    		return "error.jsp";
    	}
    	
		adminService.updateAdminPass(adminDto.userId, editPassForm.userPass, editPassForm.adminPass1, editPassForm.adminPass2);
		return "confirm.jsp";
	}
}
