package gakugeiJob.action;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.form.EnterpriseForm;
import gakugeiJob.service.EnterpriseService;


public class AddEnterpriseAction {

	@Resource
	@ActionForm
	protected EnterpriseForm enterpriseForm;
	
	@Resource
	protected EnterpriseService enterpriseService;
	
	public ArrayList<String> errorMessages;
	
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
    	if(enterpriseForm.userId == null || enterpriseForm.userId.length() == 0){
    		result = -1;
    		errorMessages.add("ユーザーIDは必須入力項目です。");
    		i++;
    	}
    	//ユーザーパスワードに対するエラー遷移
    	if(enterpriseForm.userPass == null || enterpriseForm.userPass.length() == 0){
    		result = -1;
    		errorMessages.add("ユーザーパスワードは必須入力項目です。");
    		i++;
    	}
    	//企業名に対するエラー遷移
    	if(enterpriseForm.name == null || enterpriseForm.name.length() == 0){
    		result = -1;
    		errorMessages.add("企業名は必須入力項目です。");
    		i++;
    	}
    	//電話番号に対するエラー遷移
    	if(enterpriseForm.phoneNumber == null || enterpriseForm.phoneNumber.length() == 0){
    		result = -1;
    		errorMessages.add("電話番号は必須入力項目です。");
    		i++;
    	}
    	//メールアドレスに対するエラー遷移
    	if(enterpriseForm.mailAddress == null || enterpriseForm.mailAddress.length() == 0){
    		result = -1;
    		errorMessages.add("メールアドレスは必須入力項目です。");
    		i++;
    	}
    	//以下は形式チェック
    	//ユーザーidに対するエラー遷移
    	if(!(enterpriseForm.userId == null || enterpriseForm.userId.length() == 0)){
    	if(!(enterpriseForm.userId.matches("[0-9a-zA-Z]{1,12}"))){
    		result = -1;
    		errorMessages.add("そのユーザーIDは正しい形式ではありません。");
    		i++;
    	}
    	}
    	//ユーザーパスワードに対するエラー遷移
    	if(!(enterpriseForm.userId == null || enterpriseForm.userId.length() == 0)){
    		if(!(enterpriseForm.userPass.matches("[0-9a-zA-Z]{6,12}"))){
    			result = -1;
    			errorMessages.add("そのユーザーパスワードは正しい形式ではありません。");
    			i++;
    		}
    	}
    	//企業名に対するエラー遷移
    	if(!(enterpriseForm.name == null || enterpriseForm.name.length() == 0)){
    		if(!(enterpriseForm.name.matches(".{1,50}"))){
    			result = -1;
    			errorMessages.add("その企業名は正しい形式ではありません。");
    			i++;
    		}
    	}
    	//創業日に対するエラー遷移
    	if(!(enterpriseForm.foundingDate == null || enterpriseForm.foundingDate.length() == 0)){
    		if(!(enterpriseForm.foundingDate.matches(".{1,20}"))){
    			result = -1;
    			errorMessages.add("その創業日は正しい形式ではありません。");
    			i++;		
    		}
    	}
    	//創設者の氏名に対するエラー遷移
    	if(!(enterpriseForm.founderName == null || enterpriseForm.founderName.length() == 0)){
    		if(!(enterpriseForm.founderName.matches(".{1,20}"))){
    			result = -1;
    			errorMessages.add("その創業者の氏名は正しい形式ではありません。");
    			i++;
    		}
    	}
    	//本社の住所に対するエラー遷移
    	if(!(enterpriseForm.address == null || enterpriseForm.address.length() == 0)){
    		if(!(enterpriseForm.address.matches(".{1,100}"))){
    			result = -1;
    			errorMessages.add("その本社の住所は正しい形式ではありません。");
    			i++;
    		}
    	}
    	//資本金に対するエラー遷移
    	if(!(enterpriseForm.capital == null || enterpriseForm.capital.length() == 0)){
    		if(!(enterpriseForm.capital.matches(".{1,20}"))){
    			result = -1;
    			errorMessages.add("その資本金は正しい形式ではありません。");
    			i++;
    		}
    	}
    	//代表取締役者氏名に対するエラー遷移
    	if(!(enterpriseForm.presidentName == null || enterpriseForm.presidentName.length() == 0)){
    		if(!(enterpriseForm.presidentName.matches(".{1,20}"))){
    			result = -1;
    			errorMessages.add("その代表取締役者氏名は正しい形式ではありません。");
    			i++;
    		}
    	}
    	//従業員数に対するエラー遷移
    	if(!(enterpriseForm.numOfEmployees == null || enterpriseForm.numOfEmployees.length() == 0)){
    		if(!(enterpriseForm.numOfEmployees.matches(".{1,20}"))){	
    			result = -1;
    			errorMessages.add("その従業員数は正しい形式ではありません。");
    			i++;
    		}
    	}
    	//営業種目に対するエラー遷移
    	if(!(enterpriseForm.business == null || enterpriseForm.business.length() == 0)){
    		if(!(enterpriseForm.business.matches(".{1,20}"))){
    			result = -1;
    			errorMessages.add("その企業名は正しい形式ではありません。");
    			i++;	
    		}
    	}
    	//電話番号に対するエラー遷移
    	if(!(enterpriseForm.phoneNumber == null || enterpriseForm.phoneNumber.length() == 0)){
    		if(!(enterpriseForm.phoneNumber.matches("[0-9]{1,12}"))){
    			result = -1;
    			errorMessages.add("その電話番号は正しい形式ではありません。");
    			i++;
    		}
    	}
    	//企業URLに対するエラー遷移
    	if(!(enterpriseForm.url == null || enterpriseForm.url.length() == 0)){
    		if(!(enterpriseForm.url.matches("https?://.+"))){
    			result = -1;
    			errorMessages.add("その企業URLは正しい形式ではありません。");
    			i++;
    		}
    	}
    	//ひとことに対するエラー遷移
    	if(!(enterpriseForm.oneThing == null || enterpriseForm.oneThing.length() == 0)){
    		if(!(enterpriseForm.oneThing.matches(".{1,100}"))){
    			result = -1;
    			errorMessages.add("そのひとことは正しい形式ではありません。");
    			i++;
    		}
    	}
    	//メールアドレスに対するエラー遷移
    	if(!(enterpriseForm.mailAddress == null || enterpriseForm.mailAddress.length() == 0)){
    		if(!(enterpriseForm.mailAddress.matches("[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$"))){
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
    	result = enterpriseService.insertEnterprise(enterpriseForm.userId, enterpriseForm.userPass, enterpriseForm.name, enterpriseForm.foundingDate,
    			enterpriseForm.founderName, enterpriseForm.address, enterpriseForm.capital, enterpriseForm.presidentName, enterpriseForm.numOfEmployees,
    			enterpriseForm.business, enterpriseForm.phoneNumber, enterpriseForm.url, enterpriseForm.oneThing, enterpriseForm.mailAddress);
    	if(result != 0){
    		errorMessages.add("そのユーザーIDはすでに使われています。");
    		i++;
    		return "error.jsp";
    	}
    	return "confirm.jsp";
    }
}
