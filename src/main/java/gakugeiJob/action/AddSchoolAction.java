package gakugeiJob.action;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.form.SchoolForm;
import gakugeiJob.service.SchoolService;

public class AddSchoolAction {

	@Resource
	@ActionForm
	protected SchoolForm schoolForm;
	
	public ArrayList<String> errorMessages;
	
	@Resource
	protected SchoolService schoolService;
	
    @Execute(validator = false)
    public String index(){
        return "index.jsp";
    }
    
    @Execute(validator = false)
    public String add() throws NoSuchAlgorithmException{
    	int i = 0;
    	//エラーチェック変数
    	int result = 0;
    	errorMessages = new ArrayList<String>();
    
    	//以下はrequiredチェック
    	//ユーザーidに対するエラー遷移
    	if(schoolForm.userId == null || schoolForm.userId.length() == 0){
    		result = -1;
    		errorMessages.add("ユーザーIDは必須入力項目です。");
    		i++;
    	}
    	//ユーザーパスワードに対するエラー遷移
    	if(schoolForm.userPass == null || schoolForm.userPass.length() == 0){
    		result = -1;
    		errorMessages.add("ユーザーパスワードは必須入力項目です。");
    		i++;
    	}
    	//学校名に対するエラー遷移
    	if(schoolForm.name == null || schoolForm.name.length() == 0){
    		result = -1;
    		errorMessages.add("学校名は必須入力項目です。");
    		i++;
    	}
    	//電話番号に対するエラー遷移
    	if(schoolForm.phoneNumber == null || schoolForm.phoneNumber.length() == 0){
    		result = -1;
    		errorMessages.add("電話番号は必須入力項目です。");
    		i++;
    	}
    	//メールアドレスに対するエラー遷移
    	if(schoolForm.mailAddress == null || schoolForm.mailAddress.length() == 0){
    		result = -1;
    		errorMessages.add("メールアドレスは必須入力項目です。");
    		i++;
    	}
    	//以下は形式チェック
    	//ユーザーidに対するエラー遷移
    	if(!(schoolForm.userId == null || schoolForm.userId.length() == 0)){
    	if(!(schoolForm.userId.matches("[0-9a-zA-Z]{1,12}"))){
    		result = -1;
    		errorMessages.add("そのユーザーIDは正しい形式ではありません。");
    		i++;
    	}
    	}
    	//ユーザーパスワードに対するエラー遷移
    	if(!(schoolForm.userId == null || schoolForm.userId.length() == 0)){
    		if(!(schoolForm.userPass.matches("[0-9a-zA-Z]{6,12}"))){
    			result = -1;
    			errorMessages.add("そのユーザーパスワードは正しい形式ではありません。");
    			i++;
    		}
    	}
    	//学校名に対するエラー遷移
    	if(!(schoolForm.name == null || schoolForm.name.length() == 0)){
    		if(!(schoolForm.name.matches(".{1,50}"))){
    			result = -1;
    			errorMessages.add("その学校名は正しい形式ではありません。");
    			i++;
    		}
    	}
    	//学校種に対するエラー遷移
    	if(!(schoolForm.kinds == null || schoolForm.kinds.length() == 0)){
    		if(!(schoolForm.kinds.matches(".{1,20}"))){
    			result = -1;
    			errorMessages.add("その校種は正しい形式ではありません。");
    			i++;		
    		}
    	}
    	
    	//電話番号に対するエラー遷移
    	if(!(schoolForm.phoneNumber == null || schoolForm.phoneNumber.length() == 0)){
    		if(!(schoolForm.phoneNumber.matches("[0-9]{1,12}"))){
    			result = -1;
    			errorMessages.add("その電話番号は正しい形式ではありません。");
    			i++;
    		}
    	}
    	//学校URLに対するエラー遷移
    	if(!(schoolForm.url == null || schoolForm.url.length() == 0)){
    		if(!(schoolForm.url.matches("https?://.+"))){
    			result = -1;
    			errorMessages.add("その学校URLは正しい形式ではありません。");
    			i++;
    		}
    	}
    	//ひとことに対するエラー遷移
    	if(!(schoolForm.oneThing == null || schoolForm.oneThing.length() == 0)){
    		if(!(schoolForm.oneThing.matches(".{1,100}"))){
    			result = -1;
    			errorMessages.add("そのひとことは正しい形式ではありません。");
    			i++;
    		}
    	}
    	//メールアドレスに対するエラー遷移
    	if(!(schoolForm.mailAddress == null || schoolForm.mailAddress.length() == 0)){
    		if(!(schoolForm.mailAddress.matches("[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$"))){
    			result = -1;
    			errorMessages.add("そのメールアドレスは正しい形式ではありません。");
    			i++;
    		}
    	}
    	//フォームに入力されたものが正しくなかったらエラー遷移
    	if(result != 0){
    		return "error.jsp";
    	}
    	
    	//ユーザーの登録+エラー遷移
    	result = schoolService.insertSchool(schoolForm.userId, schoolForm.userPass, schoolForm.name, schoolForm.kinds,
    			 schoolForm.phoneNumber,  schoolForm.mailAddress, schoolForm.url, schoolForm.oneThing);
    	if(result != 0){
    		errorMessages.add("そのユーザーIDはすでに使われています。");
    		i++;
    		return "error.jsp";
    	}
    	return "confirm.jsp";
    }
}
