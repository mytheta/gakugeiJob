package gakugeiJob.action.admin;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.AdminAuth;
import gakugeiJob.form.admin.StudentForm;
import gakugeiJob.service.StudentService;

public class AddStudentAction {

	@Resource
	@ActionForm
	protected StudentForm studentForm;
	
	@Resource
	protected StudentService studentService;
	
	public ArrayList<String> errorMessages;
	
	@Execute(validator = false)
	@AdminAuth
    public String index(){
        return "index.jsp";
    }
	
	@Execute(validator = false)
	@AdminAuth
	public String add() throws NoSuchAlgorithmException{
		int i = 0;
    	//エラーチェック変数
    	int result = 0;
    	errorMessages = new ArrayList<String>();
    	
    	//以下はrequiredチェック
    	//ユーザーidに対するエラー遷移
    	if(studentForm.userId == null || studentForm.userId.length() == 0){
    		result = -1;
    		errorMessages.add("ユーザーIDは必須入力項目です。");
    		i++;
    	}
    	//ユーザーパスワードに対するエラー遷移
    	if(studentForm.userPass == null || studentForm.userPass.length() == 0){
    		result = -1;
    		errorMessages.add("ユーザーパスワードは必須入力項目です。");
    		i++;
    	}
    	
    	//以下は形式チェック
    	//ユーザーidに対するエラー遷移
    	if(!(studentForm.userId == null || studentForm.userId.length() == 0)){
    	if(!(studentForm.userId.matches("[0-9a-zA-Z]{1,12}"))){
    		result = -1;
    		errorMessages.add("そのユーザーIDは正しい形式ではありません。");
    		i++;
    	}
    	}
    	//ユーザーパスワードに対するエラー遷移
    	if(!(studentForm.userId == null || studentForm.userId.length() == 0)){
    		if(!(studentForm.userPass.matches("[0-9a-zA-Z]{6,12}"))){
    			result = -1;
    			errorMessages.add("そのユーザーパスワードは正しい形式ではありません。");
    			i++;
    		}
    	}
    	
    	//フォームに入力されたものが正しくなかったらエラー遷移
    	if(result != 0){
    		return "error.jsp";
    	}
    	
    	result = studentService.insertStudent(studentForm.userId, studentForm.userPass);
    			
    	if(result != 0){
    		errorMessages.add("そのユーザーIDはすでに使われています。");
    		i++;
    		return "error.jsp";
    	}
    	return "confirm.jsp";
    }
}
