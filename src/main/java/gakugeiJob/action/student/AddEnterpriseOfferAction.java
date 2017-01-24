package gakugeiJob.action.student;

import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.StudentAuth;
import gakugeiJob.db.exentity.Enterprise;
import gakugeiJob.db.exentity.EnterpriseAplicant;
import gakugeiJob.db.exentity.EnterpriseFavo;
import gakugeiJob.db.exentity.EnterpriseOffer;
import gakugeiJob.dto.StudentDto;
import gakugeiJob.form.student.AddEnterpriseOfferForm;
import gakugeiJob.service.EnterpriseOfferService;
import gakugeiJob.service.EnterpriseService;

public class AddEnterpriseOfferAction {
	@Resource
	@ActionForm
	AddEnterpriseOfferForm addEnterpriseOfferForm;
	
	@Resource
	EnterpriseService enterpriseService;
	
	@Resource
	EnterpriseOfferService enterpriseOfferService;
	
	@Resource
	StudentDto studentDto;
	
	public ArrayList<String> errorMessages;
	
	public ListResultBean<EnterpriseAplicant> enterpriseAplicantList;
	public ListResultBean<EnterpriseOffer> enterpriseOfferList;
	public ListResultBean<EnterpriseFavo> enterpriseFavoList;
	public ListResultBean<Enterprise> enterpriseList;
	public int jobOfferId;
	public int studentId;
	
	@Execute(validator = false)
	@StudentAuth
    public String index(){
		enterpriseOfferList = enterpriseOfferService.selectAll();
		studentId = studentDto.studentId;
		enterpriseList = enterpriseService.selectAll();
		enterpriseFavoList = enterpriseOfferService.selectAllFavo();
		enterpriseAplicantList = enterpriseOfferService.selectAllAplicant();
		return "index.jsp";
	}
	
	@Execute(validator = false)
	@StudentAuth
	public String favo(){
		enterpriseOfferService.insertEnterpriseFavo(Integer.parseInt(addEnterpriseOfferForm.jobOfferId), studentDto.studentId);
		enterpriseOfferService.updateEnterpriseFavo(Integer.parseInt(addEnterpriseOfferForm.jobOfferId));
		return "favoConfirm.jsp";
	}
	
	@Execute(validator = false)
	@StudentAuth
	public String add(){
		jobOfferId = Integer.parseInt(addEnterpriseOfferForm.jobOfferId);
		return "add.jsp";
	}
	
	@Execute(validator = false)
	@StudentAuth
	public String view(){
		jobOfferId = Integer.parseInt(addEnterpriseOfferForm.jobOfferId);
		studentId = studentDto.studentId;
		enterpriseOfferList = enterpriseOfferService.selectAll();
		enterpriseList = enterpriseService.selectAll();
		enterpriseFavoList = enterpriseOfferService.selectAllFavo();
		enterpriseAplicantList = enterpriseOfferService.selectAllAplicant();
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
    	if(!(addEnterpriseOfferForm.title == null || addEnterpriseOfferForm.title.length() == 0)){
    		if(!(Pattern.compile(".{1,100}", Pattern.DOTALL).matcher(addEnterpriseOfferForm.title)).matches()){
    		result = -1;
    		errorMessages.add("そのタイトルは正しい形式ではありません。");
    		i++;
    	}
    	}
    	//コンテンツに対するエラー遷移
    	if(!(addEnterpriseOfferForm.content == null || addEnterpriseOfferForm.content.length() == 0)){
    		if(!(Pattern.compile(".{1,400}", Pattern.DOTALL).matcher(addEnterpriseOfferForm.content)).matches()){
    			result = -1;
    			errorMessages.add("その応募内容は正しい形式ではありません。");
    			i++;
    		}
    	}
    	
    	//フォームに入力されたものが正しくなかったらエラー遷移
    	if(result != 0){
    		return "error.jsp";
    	}
		
		enterpriseOfferService.insertEnterpriseAplicant(Integer.parseInt(addEnterpriseOfferForm.jobOfferId), studentDto.studentId, addEnterpriseOfferForm.title, addEnterpriseOfferForm.content);
		return "confirm.jsp";
	}
}