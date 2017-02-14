package gakugeiJob.action.school;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.SchoolAuth;
import gakugeiJob.dto.SchoolDto;
import gakugeiJob.form.student.EditPassForm;
import gakugeiJob.service.SchoolService;

public class EditPassAction {

	@Resource
	@ActionForm
	protected EditPassForm editPassForm;

	@Resource
	protected SchoolService schoolService;

	@Resource
	protected SchoolDto schoolDto;

	public ArrayList<String> errorMessages;

	@Execute(validator = false)
	@SchoolAuth
	public String index(){
		return "index.jsp";
	}

	@Execute(validator=false)
	@SchoolAuth
	public String edit() throws NoSuchAlgorithmException{
		schoolService.updataPass(schoolDto.userId, editPassForm.userPass);
		errorMessages = new ArrayList<String>();

	    //エラーチェック変数
	    int result = 0;
	    errorMessages = new ArrayList<String>();

	    //以下はrequiredチェック
	    //ユーザーパスワードに対するエラー遷移
	    if(editPassForm.userPass == null || editPassForm.userPass.length() == 0){
	    	result = -1;
	    	errorMessages.add("ユーザーパスワードは必須入力項目です。");
	    }

	    	//以下は形式チェック
	    	//ユーザーパスワードに対するエラー遷移
	    	if(!(editPassForm.userPass == null || editPassForm.userPass.length() == 0)){
	    		if(!(editPassForm.userPass.matches("[0-9a-zA-Z]{6,12}"))){
	    			result = -1;
	    			errorMessages.add("そのユーザーパスワードは正しい形式ではありません。");
	    		}
	    	}

	    	//フォームに入力されたものが正しくなかったらエラー遷移
	    	if(result != 0){
	    		return "error.jsp";
	    	}

	return "confirm.jsp";
	}

}