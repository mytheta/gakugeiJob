package gakugeiJob.action.student;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.StudentAuth;
import gakugeiJob.dto.StudentDto;
import gakugeiJob.form.student.EditPassForm;
import gakugeiJob.service.StudentService;

public class EditPassAction {

	@Resource
	@ActionForm
	protected EditPassForm editPassForm;
	
	@Resource
	protected StudentService studentService;
	
	@Resource
	protected StudentDto studentDto;
	
	public ArrayList<String> errorMessages;
	
	@Execute(validator = false)
	@StudentAuth
    public String index(){
        return "index.jsp";
    }
	
	@Execute(validator = false)
	@StudentAuth
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
    	
    	//以下は形式チェック
    	//ユーザーパスワードに対するエラー遷移
    	if(!(editPassForm.userPass == null || editPassForm.userPass.length() == 0)){
    	if(!(editPassForm.userPass.matches("[0-9a-zA-Z]{6,12}"))){
    		result = -1;
    		errorMessages.add("そのユーザーパスワードは正しい形式ではありません。");
    		i++;
    	}
    	}
    	
    	//フォームに入力されたものが正しくなかったらエラー遷移
    	if(result != 0){
    		return "error.jsp";
    	}
    	
		studentService.updatePass(studentDto.userId, editPassForm.userPass);
		return "confirm.jsp";
	}
}
