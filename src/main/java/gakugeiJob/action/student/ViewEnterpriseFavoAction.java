package gakugeiJob.action.student;

import javax.annotation.Resource;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.StudentAuth;
import gakugeiJob.db.exentity.Enterprise;
import gakugeiJob.db.exentity.EnterpriseFavo;
import gakugeiJob.db.exentity.EnterpriseOffer;
import gakugeiJob.dto.StudentDto;
import gakugeiJob.form.student.AddEnterpriseOfferForm;
import gakugeiJob.service.EnterpriseOfferService;
import gakugeiJob.service.EnterpriseService;

public class ViewEnterpriseFavoAction {

	@Resource
	@ActionForm
	AddEnterpriseOfferForm addEnterpriseOfferForm;
	
	@Resource
	EnterpriseService enterpriseService;
	
	@Resource
	EnterpriseOfferService enterpriseOfferService;
	
	@Resource
	StudentDto studentDto;
	
	public ListResultBean<EnterpriseOffer> enterpriseOfferList;
	public ListResultBean<EnterpriseFavo> enterpriseFavoList;
	public ListResultBean<Enterprise> enterpriseList;
	public int enterpriseOfferId;
	public int studentId;
	
	@Execute(validator = false)
	@StudentAuth
    public String index(){
		enterpriseOfferList = enterpriseOfferService.selectAll();
		studentId = studentDto.studentId;
		enterpriseList = enterpriseService.selectAll();
		enterpriseFavoList = enterpriseOfferService.selectAllFavo();
		return "index.jsp";
	}
	
	@Execute(validator = false)
	@StudentAuth
	public String delete(){
		enterpriseOfferService.deleteFavo(Integer.parseInt(addEnterpriseOfferForm.jobOfferId), studentDto.studentId);
		return "delete.jsp";
	}
}
