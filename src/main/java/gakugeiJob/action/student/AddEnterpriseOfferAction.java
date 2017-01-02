package gakugeiJob.action.student;

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
		enterpriseOfferService.insertEnterpriseAplicant(Integer.parseInt(addEnterpriseOfferForm.jobOfferId), studentDto.studentId, addEnterpriseOfferForm.title, addEnterpriseOfferForm.content);
		return "confirm.jsp";
	}
}