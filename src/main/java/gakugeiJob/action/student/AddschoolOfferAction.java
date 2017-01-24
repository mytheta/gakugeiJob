package gakugeiJob.action.student;

import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.StudentAuth;
import gakugeiJob.db.exentity.School;
import gakugeiJob.db.exentity.SchoolAplicant;
import gakugeiJob.db.exentity.SchoolFavo;
import gakugeiJob.db.exentity.SchoolOffer;
import gakugeiJob.dto.StudentDto;
import gakugeiJob.form.student.AddSchoolOfferForm;
import gakugeiJob.service.SchoolOfferService;
import gakugeiJob.service.SchoolService;

public class AddSchoolOfferAction {

	@Resource
	@ActionForm
	AddSchoolOfferForm addSchoolOfferForm;
	
	@Resource
	SchoolService schoolService;
	
	@Resource
	SchoolOfferService schoolOfferService;
	
	@Resource
	StudentDto studentDto;
	
	public ListResultBean<SchoolAplicant> schoolAplicantList;
	public ListResultBean<SchoolOffer> schoolOfferList;
	public ListResultBean<SchoolFavo> schoolFavoList;
	public ListResultBean<School> schoolList;
	public int schoolOfferId;
	public int studentId;
	
	public ArrayList<String> errorMessages;
	
	@Execute(validator = false)
	@StudentAuth
    public String index(){
		schoolOfferList = schoolOfferService.selectAll();
		studentId = studentDto.studentId;
		schoolList = schoolService.selectAll();
		schoolFavoList = schoolOfferService.selectAllFavo();
		schoolAplicantList = schoolOfferService.selectAllAplicant();
		return "index.jsp";
	}
	
	@Execute(validator = false)
	@StudentAuth
	public String favo(){
		schoolOfferService.insertSchoolFavo(Integer.parseInt(addSchoolOfferForm.schoolOfferId), studentDto.studentId);
		schoolOfferService.updateSchoolFavo(Integer.parseInt(addSchoolOfferForm.schoolOfferId));
		return "favoConfirm.jsp";
	}
	
	@Execute(validator = false)
	@StudentAuth
	public String add(){
		schoolOfferId = Integer.parseInt(addSchoolOfferForm.schoolOfferId);
		return "add.jsp";
	}
	
	@Execute(validator = false)
	@StudentAuth
	public String view(){
		schoolOfferId = Integer.parseInt(addSchoolOfferForm.schoolOfferId);
		studentId = studentDto.studentId;
		schoolOfferList = schoolOfferService.selectAll();
		schoolList = schoolService.selectAll();
		schoolFavoList = schoolOfferService.selectAllFavo();
		schoolAplicantList = schoolOfferService.selectAllAplicant();
		return "view.jsp";
	}
	@Execute(validator = false)
	@StudentAuth
	public String offer(){
		int i = 0;
    	//エラーチェック変数
    	int result = 0;
    	errorMessages = new ArrayList<String>();
    	
    	//以下は形式チェック
    	//タイトルに対するエラー遷移
    	if(!(addSchoolOfferForm.title == null || addSchoolOfferForm.title.length() == 0)){
    		if(!(Pattern.compile(".{1,100}", Pattern.DOTALL).matcher(addSchoolOfferForm.title)).matches()){
    		result = -1;
    		errorMessages.add("そのタイトルは正しい形式ではありません。");
    		i++;
    	}
    	}
    	//コンテンツに対するエラー遷移
    	if(!(addSchoolOfferForm.content == null || addSchoolOfferForm.content.length() == 0)){
    		if(!(Pattern.compile(".{1,400}", Pattern.DOTALL).matcher(addSchoolOfferForm.content)).matches()){
    			result = -1;
    			errorMessages.add("その応募内容は正しい形式ではありません。");
    			i++;
    		}
    	}
    	
    	//フォームに入力されたものが正しくなかったらエラー遷移
    	if(result != 0){
    		return "error.jsp";
    	}
		
		schoolOfferService.insertSchoolAplicant(Integer.parseInt(addSchoolOfferForm.schoolOfferId), studentDto.studentId, addSchoolOfferForm.title, addSchoolOfferForm.content);
		return "confirm.jsp";
	}
}
