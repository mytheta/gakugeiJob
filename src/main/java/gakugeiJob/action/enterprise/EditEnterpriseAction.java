package gakugeiJob.action.enterprise;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import gakugeiJob.annotation.EnterpriseAuth;
import gakugeiJob.db.exentity.Enterprise;
import gakugeiJob.dto.EnterpriseDto;
import gakugeiJob.form.enterprise.EditEnterpriseForm;
import gakugeiJob.service.EnterpriseService;

public class EditEnterpriseAction {

	@ActionForm
	@Resource
	protected EditEnterpriseForm editEnterpriseForm;

	@Resource
	protected EnterpriseService enterpriseService;

	@Resource
	protected EnterpriseDto enterpriseDto;

	public Enterprise enterprise;
	public ArrayList<String> errorMessages;

	@Execute(validator = false)
	@EnterpriseAuth
	public String index() {
		enterprise = enterpriseService.select(enterpriseDto.enterpriseId);
		return "index.jsp";
	}

	@Execute(validator = false)
	@EnterpriseAuth
	public String edit() throws NumberFormatException, ParseException {

		// エラーチェック変数
		int result = 0;
		errorMessages = new ArrayList<String>();
		// 以下はrequiredチェック
		// ユーザーidに対するエラー遷移
		if (editEnterpriseForm.userId == null || editEnterpriseForm.userId.length() == 0) {
			result = -1;
			errorMessages.add("ユーザーIDは必須入力項目です。");
		}
        //企業名に対するエラー遷移

        if(editEnterpriseForm.name == null || editEnterpriseForm.name.length() == 0){
            result = -1;
            errorMessages.add("企業名は必須入力項目です。");
        }
        //電話番号に対するエラー遷移
        if(editEnterpriseForm.phoneNumber == null || editEnterpriseForm.phoneNumber.length() == 0){
            result = -1;
            errorMessages.add("電話番号は必須入力項目です。");
        }
        //メールアドレスに対するエラー遷移
        if(editEnterpriseForm.mailAddress == null || editEnterpriseForm.mailAddress.length() == 0){
            result = -1;
            errorMessages.add("メールアドレスは必須入力項目です。");
        }
        //以下は形式チェック
        //ユーザーidに対するエラー遷移
        if(!(editEnterpriseForm.userId == null || editEnterpriseForm.userId.length() == 0)){
        if(!(editEnterpriseForm.userId.matches("[0-9a-zA-Z]{1,12}"))){
            result = -1;
            errorMessages.add("そのユーザーIDは正しい形式ではありません。");
        }
        }
        //企業名に対するエラー遷移
        if(!(editEnterpriseForm.name == null || editEnterpriseForm.name.length() == 0)){
            if(!(editEnterpriseForm.name.matches(".{1,50}"))){
                result = -1;
                errorMessages.add("その企業名は正しい形式ではありません。");
            }
        }
        //創業日に対するエラー遷移
        if(!(editEnterpriseForm.foundingDate == null || editEnterpriseForm.foundingDate.length() == 0)){
            if(!(editEnterpriseForm.foundingDate.matches(".{1,20}"))){
                result = -1;
                errorMessages.add("その創業日は正しい形式ではありません。");
            }
        }
        //創設者の氏名に対するエラー遷移
        if(!(editEnterpriseForm.founderName == null || editEnterpriseForm.founderName.length() == 0)){
            if(!(editEnterpriseForm.founderName.matches(".{1,20}"))){
                result = -1;
                errorMessages.add("その創業者の氏名は正しい形式ではありません。");
            }
        }
        //本社の住所に対するエラー遷移
        if(!(editEnterpriseForm.address == null || editEnterpriseForm.address.length() == 0)){
            if(!(editEnterpriseForm.address.matches(".{1,100}"))){
                result = -1;
                errorMessages.add("その本社の住所は正しい形式ではありません。");
            }
        }
        //資本金に対するエラー遷移
        if(!(editEnterpriseForm.capital == null || editEnterpriseForm.capital.length() == 0)){
			if (!(editEnterpriseForm.capital.matches(".{1,20}"))) {
                result = -1;
                errorMessages.add("その資本金は正しい形式ではありません。");
            }
        }
        //代表取締役者氏名に対するエラー遷移
		if (!(editEnterpriseForm.presidentName == null || editEnterpriseForm.presidentName.length() == 0)) {
			if (!(editEnterpriseForm.presidentName.matches(".{1,20}"))) {
                result = -1;
                errorMessages.add("その代表取締役者氏名は正しい形式ではありません。");
            }
        }
        //従業員数に対するエラー遷移
        if(!(editEnterpriseForm.numOfEmployees == null || editEnterpriseForm.numOfEmployees.length() == 0)){
            if(!(editEnterpriseForm.numOfEmployees.matches(".{1,20}"))){  
                result = -1;
                errorMessages.add("その従業員数は正しい形式ではありません。");
            }
        }
        //営業種目に対するエラー遷移
        if(!(editEnterpriseForm.business == null || editEnterpriseForm.business.length() == 0)){
            if(!(editEnterpriseForm.business.matches(".{1,20}"))){
                result = -1;
                errorMessages.add("その企業名は正しい形式ではありません。");
            }
        }
        //電話番号に対するエラー遷移
        if(!(editEnterpriseForm.phoneNumber == null || editEnterpriseForm.phoneNumber.length() == 0)){
            if(!(editEnterpriseForm.phoneNumber.matches("[0-9]{1,12}"))){
                result = -1;
                errorMessages.add("その電話番号は正しい形式ではありません。");
            }
        }
        //企業URLに対するエラー遷移
        if(!(editEnterpriseForm.url == null || editEnterpriseForm.url.length() == 0)){
            if(!(editEnterpriseForm.url.matches("https?://.+"))){
                result = -1;
                errorMessages.add("その企業URLは正しい形式ではありません。");
            }
        }
        //ひとことに対するエラー遷移
        if(!(editEnterpriseForm.oneThing == null || editEnterpriseForm.oneThing.length() == 0)){
            if(!(editEnterpriseForm.oneThing.matches(".{1,100}"))){
                result = -1;
                errorMessages.add("そのひとことは正しい形式ではありません。");
            }
        }
        //メールアドレスに対するエラー遷移
        if(!(editEnterpriseForm.mailAddress == null || editEnterpriseForm.mailAddress.length() == 0)){
            if(!(editEnterpriseForm.mailAddress.matches("[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$"))){
                result = -1;
                errorMessages.add("そのメールアドレスは正しい形式ではありません。");
            }
        }
        //フォームに入力されたものが正しくなかったらエラー遷移
        if(result != 0){
            return "error.jsp";
        }
        
        //ユーザーの登録+エラー遷移
        result = enterpriseService.update(enterpriseDto.enterpriseId, enterpriseDto.userId, editEnterpriseForm.userId,
				editEnterpriseForm.name, editEnterpriseForm.foundingDate, editEnterpriseForm.founderName,
				editEnterpriseForm.address, editEnterpriseForm.capital, editEnterpriseForm.presidentName,
				editEnterpriseForm.numOfEmployees, editEnterpriseForm.business, editEnterpriseForm.phoneNumber,
				editEnterpriseForm.url, editEnterpriseForm.oneThing, editEnterpriseForm.mailAddress);
		enterpriseDto.userId = editEnterpriseForm.userId;
        if(result != 0){
            errorMessages.add("そのユーザーIDはすでに使われています。");
            return "error.jsp";
        }
        return "confirm.jsp";
    }

}
