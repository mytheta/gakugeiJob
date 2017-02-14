package gakugeiJob.action.enterprise;

import javax.annotation.Resource;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.EnterpriseAuth;
import gakugeiJob.db.exentity.Enterprise;
import gakugeiJob.db.exentity.EnterpriseAplicant;
import gakugeiJob.db.exentity.EnterpriseFavo;
import gakugeiJob.db.exentity.EnterpriseOffer;
import gakugeiJob.db.exentity.Student;
import gakugeiJob.dto.EnterpriseDto;
import gakugeiJob.form.enterprise.EnterpriseOfferForm;
import gakugeiJob.service.EnterpriseOfferService;
import gakugeiJob.service.EnterpriseService;
import gakugeiJob.service.StudentService;

public class ViewMyOfferAction {

	@Resource
	@ActionForm
	EnterpriseOfferForm enterpriseOfferForm;

	@Resource
	protected EnterpriseDto enterpriseDto;

	@Resource
	EnterpriseService enterpriseService;

	@Resource
	EnterpriseOfferService enterpriseOfferService;

	@Resource
	StudentService studentService;

	public ListResultBean<EnterpriseOffer> enterpriseOfferList;
	public ListResultBean<Enterprise> enterpriseList;
	public ListResultBean<EnterpriseFavo> enterpriseFavoList;
	public ListResultBean<EnterpriseAplicant> enterpriseAplicantList;
	public ListResultBean<EnterpriseAplicant> studentOfferList;
	public ListResultBean<Student> studentList;
	public Student student;
	public int enterpriseId;
	public int jobOfferId;

	@Execute(validator = false)
	@EnterpriseAuth
	public String index() {

		enterpriseId = enterpriseDto.enterpriseId;
		enterpriseOfferList = enterpriseOfferService.selectAll();
		enterpriseList = enterpriseService.selectAll();
		return "index.jsp";
	}

	@Execute(validator = false)
	@EnterpriseAuth
	public String view() {
		jobOfferId = Integer.parseInt(enterpriseOfferForm.jobOfferId);
		enterpriseOfferList = enterpriseOfferService.selectAll();
		enterpriseList = enterpriseService.selectAll();
		enterpriseFavoList = enterpriseOfferService.selectAllFavo();
		enterpriseAplicantList = enterpriseOfferService.selectAllAplicant();
		return "detail.jsp";
	}

	@Execute(validator = false)
	@EnterpriseAuth
	public String favo() {
		jobOfferId = Integer.parseInt(enterpriseOfferForm.jobOfferId);
		enterpriseFavoList = enterpriseOfferService.selectAllFavo();
		studentList = studentService.selectAll();
		return "favo.jsp";
	}

	@Execute(validator = false)
	@EnterpriseAuth
	public String offer() {
		jobOfferId = Integer.parseInt(enterpriseOfferForm.jobOfferId);
		studentOfferList = enterpriseOfferService.selectAplicant(jobOfferId);
		studentList = studentService.selectAll();
		return "offer.jsp";
	}

	@Execute(validator = false)
	@EnterpriseAuth
	public String delete() {
		enterpriseOfferService.deleteOffer(Integer.parseInt(enterpriseOfferForm.jobOfferId));
		return "delete.jsp";
	}
}
