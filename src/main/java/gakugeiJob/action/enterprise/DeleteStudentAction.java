package gakugeiJob.action.enterprise;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.EnterpriseAuth;
import gakugeiJob.form.enterprise.JobOfferIdForm;
import gakugeiJob.service.EnterpriseOfferService;

public class DeleteStudentAction {

	@ActionForm
	@Resource
	protected JobOfferIdForm jobOfferIdForm;

	@Resource
	EnterpriseOfferService enterpriseOfferService;

	@Execute(input ="/error/?redirect=true")
	@EnterpriseAuth
    public String delete(){
		enterpriseOfferService.deleteAplicant(Integer.parseInt(jobOfferIdForm.jobOfferId),
				Integer.parseInt(jobOfferIdForm.studentId));
        return "index.jsp";
    }
}