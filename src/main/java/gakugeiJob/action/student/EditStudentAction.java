package gakugeiJob.action.student;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.StudentAuth;
import gakugeiJob.db.exentity.Login;
import gakugeiJob.db.exentity.Student;
import gakugeiJob.dto.StudentDto;
import gakugeiJob.form.student.EditStudentForm;
import gakugeiJob.helper.DateHelper;
import gakugeiJob.service.LoginService;
import gakugeiJob.service.StudentService;
import sun.util.logging.resources.logging;

public class EditStudentAction {

	@Resource
	@ActionForm
	EditStudentForm editStudentForm;

	@Resource
	StudentService studentService;
	
	@Resource
	LoginService loginService;

	@Resource
	StudentDto studentDto;

	public ArrayList<String> errorMessages;
	public Student student;
	public String birthday;
	public ListResultBean<Login> users;

	@Execute(validator = false)
	@StudentAuth
    public String index(){
		student = studentService.selectByStudentId(studentDto.studentId);
		if(student.getBirthday() != null)
		birthday = DateHelper.formatYMD2(student.getBirthday());

        return "index.jsp";
	}

	@Execute(validator = false)
	@StudentAuth
	public String edit() throws NumberFormatException, ParseException{
		int i = 0;
    	//エラーチェック変数
    	int result = 0;
    	errorMessages = new ArrayList<String>();
    
    	//以下はrequiredチェック
    	//ユーザーidに対するエラー遷移
    	if(editStudentForm.userId == null || editStudentForm.userId.length() == 0){
    		result = -1;
    		errorMessages.add("ユーザーIDは必須入力項目です。");
    		i++;
    	}
    	//氏名に対するエラー遷移
    	if(editStudentForm.name == null || editStudentForm.name.length() == 0){
    		result = -1;
    		errorMessages.add("氏名は必須入力項目です。");
    		i++;
    	}
    	//誕生日に対するエラー遷移
    	if(editStudentForm.birthday == null || editStudentForm.birthday.length() == 0){
    		result = -1;
    		errorMessages.add("誕生日は必須入力項目です。");
    		i++;
    	}
    	//性別に対するエラー遷移
    	if(editStudentForm.sex == null || editStudentForm.sex.length() == 0){
    		result = -1;
    		errorMessages.add("性別は必須入力項目です。");
    		i++;
    	}
    	//住所に対するエラー遷移
    	if(editStudentForm.address == null || editStudentForm.address.length() == 0){
    		result = -1;
    		errorMessages.add("住所は必須入力項目です。");
    		i++;
    	}
    	//メールアドレスに対するエラー遷移
    	if(editStudentForm.mailAddress == null || editStudentForm.mailAddress.length() == 0){
    		result = -1;
    		errorMessages.add("メールアドレスは必須入力項目です。");
    		i++;
    	}
    	//電話番号に対するエラー遷移
    	if(editStudentForm.phoneNumber == null || editStudentForm.phoneNumber.length() == 0){
    		result = -1;
    		errorMessages.add("電話番号は必須入力項目です。");
    		i++;
    	}
    	
    	//以下は形式チェック
    	//ユーザーidに対するエラー遷移
    	if(!(editStudentForm.userId == null || editStudentForm.userId.length() == 0)){
    	if(!(editStudentForm.userId.matches("[0-9a-zA-Z]{1,12}"))){
    		result = -1;
    		errorMessages.add("そのユーザーIDは正しい形式ではありません。");
    		i++;
    	}
    	}
    	//氏名に対するエラー遷移
    	if(!(editStudentForm.name == null || editStudentForm.name.length() == 0)){
    	if(!(editStudentForm.name.matches(".{1,10}"))){
    		result = -1;
    		errorMessages.add("その氏名は正しい形式ではありません。");
    		i++;
    	}
    	}
    	//誕生日に対するエラー遷移
    	if(!(editStudentForm.birthday == null || editStudentForm.birthday.length() == 0)){
    	if(!(editStudentForm.birthday.matches("^(\\d{4})-(0[1-9]|1[0-2])-(0[1-9]|[12][0-9]|3[01])$"))){
    		result = -1;
    		errorMessages.add("その誕生日は正しい形式ではありません。(2017年01月01日という表記でお願いします。)");
    		i++;
    	}
    	}
    	//性別に対するエラー遷移
    	if(!(editStudentForm.sex == null || editStudentForm.sex.length() == 0)){
    	if(!(editStudentForm.sex.matches("[01]"))){
    		result = -1;
    		errorMessages.add("その性別は正しい形式ではありません。");
    		i++;
    	}
    	}
    	//住所に対するエラー遷移
    	
    	if(!(editStudentForm.address == null || editStudentForm.address.length() == 0)){
    	if(!(Pattern.compile(".{1,100}", Pattern.DOTALL).matcher(editStudentForm.address)).matches()){
    		result = -1;
    		errorMessages.add("その住所は正しい形式ではありません。");
    		i++;
    	}
    	}
    	//メールアドレスに対するエラー遷移
    	if(!(editStudentForm.mailAddress == null || editStudentForm.mailAddress.length() == 0)){
    	if(!(editStudentForm.mailAddress.matches("[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$"))){
    		result = -1;
    		errorMessages.add("そのメールアドレスは正しい形式ではありません。");
    		i++;
    	}
    	}
    	//電話番号に対するエラー遷移
    	if(!(editStudentForm.phoneNumber == null || editStudentForm.phoneNumber.length() == 0)){
    	if(!(editStudentForm.phoneNumber.matches("[0-9]{1,12}"))){
    		result = -1;
    		errorMessages.add("その電話番号は正しい形式ではありません。");
    		i++;
    	}
    	}
    	
    	//userIdが使われているものなのかをチェック
    	//全てのuserIdを取得
    	users = loginService.selectAll();
    	for(Login user : users){
    		if(user.getUserId().equals(editStudentForm.userId)){
    			//すでに使われているが、自分のものと同じものならcontinue;
    			if(user.getUserId().equals(studentDto.userId)){
    				continue;
    			}
    			result = -1;
    			errorMessages.add("そのユーザーIDはすでに使われています。");
    			i++;
    		}
    	}
    	//フォームに入力されたものが正しくなかったらエラー遷移
    	if(result != 0){
    		System.out.println(editStudentForm.birthday);
    		return "error.jsp";
    	}
		
		studentService.update(studentDto.studentId, studentDto.userId, editStudentForm.userId, editStudentForm.name, DateHelper.parse(editStudentForm.birthday),
				Integer.parseInt(editStudentForm.sex), editStudentForm.phoneNumber, editStudentForm.mailAddress, editStudentForm.address);
		studentDto.userId = editStudentForm.userId;
		return "confirm.jsp";
	}
}
