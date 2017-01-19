package gakugeiJob.action.school;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.SchoolAuth;
import gakugeiJob.form.school.SchoolOfferIdForm;
import gakugeiJob.service.SchoolOfferService;

public class DeleteOfferAction {

	@ActionForm
	@Resource
	protected SchoolOfferIdForm schoolOfferIdForm;

	@Resource
	protected SchoolOfferService schoolOfferService;

	@Execute(input ="/error/?redirect=true")
	@SchoolAuth
    public String delete(){
		schoolOfferService.deleteOffer(Integer.parseInt(schoolOfferIdForm.schoolOfferId));
        return "index.jsp";
    }
}
