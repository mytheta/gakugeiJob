package gakugeiJob.action.school;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import gakugeiJob.annotation.SchoolAuth;
import gakugeiJob.db.exentity.School;
import gakugeiJob.dto.SchoolDto;
import gakugeiJob.form.school.EditSchoolForm;
import gakugeiJob.service.SchoolService;

public class EditSchoolAction {

	@Resource
	@ActionForm
	EditSchoolForm editSchoolForm;

	@Resource
	SchoolService schoolService;

	@Resource
	SchoolDto schoolDto;

	public School school;
	public ArrayList<String> errorMessages;

	@Execute(validator = false)
	@SchoolAuth
	public String index(){
		school = schoolService.selectBySchoolId(schoolDto.schoolId);
		return "index.jsp";
	}

	@Execute(validator=false)
	@SchoolAuth
	public String edit() throws NumberFormatException, ParseException{

		// エラーチェック変数
		int result = 0;
		errorMessages = new ArrayList<String>();
		// 以下はrequiredチェック
		// ユーザーidに対するエラー遷移
		if (editSchoolForm.userId == null || editSchoolForm.userId.length() == 0) {
			result = -1;
			errorMessages.add("ユーザーIDは必須入力項目です。");
		}
        //企業名に対するエラー遷移

        if(editSchoolForm.name == null || editSchoolForm.name.length() == 0){
            result = -1;
            errorMessages.add("学校名は必須入力項目です。");
        }
        //電話番号に対するエラー遷移
        if(editSchoolForm.phoneNumber == null || editSchoolForm.phoneNumber.length() == 0){
            result = -1;
            errorMessages.add("電話番号は必須入力項目です。");
        }
        //メールアドレスに対するエラー遷移
        if(editSchoolForm.mailAddress == null || editSchoolForm.mailAddress.length() == 0){
            result = -1;
            errorMessages.add("メールアドレスは必須入力項目です。");
        }
        //以下は形式チェック
        //ユーザーidに対するエラー遷移
        if(!(editSchoolForm.userId == null || editSchoolForm.userId.length() == 0)){
        if(!(editSchoolForm.userId.matches("[0-9a-zA-Z]{1,12}"))){
            result = -1;
            errorMessages.add("そのユーザーIDは正しい形式ではありません。");
        }
        }
        //学校名に対するエラー遷移
        if(!(editSchoolForm.name == null || editSchoolForm.name.length() == 0)){
            if(!(editSchoolForm.name.matches(".{1,50}"))){
                result = -1;
                errorMessages.add("その学校名は正しい形式ではありません。");
            }
        }
        //校種に対するエラー遷移
        if(!(editSchoolForm.kinds == null || editSchoolForm.kinds.length() == 0)){
            if(!(editSchoolForm.kinds.matches(".{1,20}"))){
                result = -1;
                errorMessages.add("その校種は正しい形式ではありません。");
            }
        }
        //電話番号に対するエラー遷移
        if(!(editSchoolForm.phoneNumber == null || editSchoolForm.phoneNumber.length() == 0)){
            if(!(editSchoolForm.phoneNumber.matches("[0-9]{1,12}"))){
                result = -1;
                errorMessages.add("その電話番号は正しい形式ではありません。");
            }
        }
        //学校URLに対するエラー遷移
        if(!(editSchoolForm.url == null || editSchoolForm.url.length() == 0)){
            if(!(editSchoolForm.url.matches("https?://.+"))){
                result = -1;
                errorMessages.add("その学校URLは正しい形式ではありません。");
            }
        }
        //ひとことに対するエラー遷移
        if(!(editSchoolForm.oneThing == null || editSchoolForm.oneThing.length() == 0)){
            if(!(editSchoolForm.oneThing.matches(".{1,100}"))){
                result = -1;
                errorMessages.add("そのひとことは正しい形式ではありません。");
            }
        }
        //メールアドレスに対するエラー遷移
        if(!(editSchoolForm.mailAddress == null || editSchoolForm.mailAddress.length() == 0)){
            if(!(editSchoolForm.mailAddress.matches("[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$"))){
                result = -1;
                errorMessages.add("そのメールアドレスは正しい形式ではありません。");
            }
        }
        //フォームに入力されたものが正しくなかったらエラー遷移
        if(result != 0){
            System.out.print(errorMessages);
            return "error.jsp";
        }

		result = schoolService.update(schoolDto.schoolId, schoolDto.userId, editSchoolForm.userId, editSchoolForm.name, editSchoolForm.kinds,
				editSchoolForm.phoneNumber, editSchoolForm.mailAddress, editSchoolForm.url, editSchoolForm.oneThing);
		schoolDto.userId = editSchoolForm.userId;
		 if(result != 0){
	            errorMessages.add("そのユーザーIDはすでに使われています。");
	            return "error.jsp";
	        }
		return "confirm.jsp";
	}
}
