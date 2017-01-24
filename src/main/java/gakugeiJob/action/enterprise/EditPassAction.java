package gakugeiJob.action.enterprise;

import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.EnterpriseAuth;
import gakugeiJob.dto.EnterpriseDto;
import gakugeiJob.form.student.EditPassForm;
import gakugeiJob.service.EnterpriseService;

public class EditPassAction {

	@Resource
	@ActionForm
	protected EditPassForm editPassForm;

	@Resource
	protected EnterpriseService enterpriseService;

	@Resource
	protected EnterpriseDto enterpriseDto;

	@Execute(validator = false)
	@EnterpriseAuth
	public String index() {
		return "index.jsp";
	}

	@Execute(validator = false)
	@EnterpriseAuth
	public String edit() throws NoSuchAlgorithmException {
		enterpriseService.updatePass(enterpriseDto.userId, editPassForm.userPass);
		return "confirm.jsp";
	}
}
