package gakugeiJob.action.school;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.SchoolAuth;
import gakugeiJob.form.school.DeleteStudentOfferForm;
import gakugeiJob.service.SchoolOfferService;

public class DeleteStudentOfferAction {

	@ActionForm
	@Resource
	protected DeleteStudentOfferForm deleteStudentOfferForm;

	@Resource
	protected SchoolOfferService schoolOfferService;

	@Execute(validator=false)
	@SchoolAuth
    public String delete(){
		schoolOfferService.deleteAplicant(Integer.parseInt(deleteStudentOfferForm.schoolOfferId),Integer.parseInt(deleteStudentOfferForm.studentId) );
        return "index.jsp";
    }
}