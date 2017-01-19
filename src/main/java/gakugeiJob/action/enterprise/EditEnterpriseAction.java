package gakugeiJob.action.enterprise;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import gakugeiJob.annotation.EnterpriseAuth;
import gakugeiJob.db.exentity.Enterprise;
import gakugeiJob.dto.EnterpriseDto;
import gakugeiJob.form.enterprise.EditEnterpriseForm;
import gakugeiJob.service.EnterpriseService;

public class EditEnterpriseAction {

	@ActionForm
	@Resource
	protected EditEnterpriseForm editEnterpriseForm;

	@Resource
	protected EnterpriseService enterpriseService;

	@Resource
	protected EnterpriseDto enterpriseDto;

	public Enterprise enterprise;

	@Execute(validator = false)
	@EnterpriseAuth
	public String index() {
		enterprise = enterpriseService.select(enterpriseDto.enterpriseId);
		return "index.jsp";
	}

	@Execute(input = "/error/?redirect=true")
	@EnterpriseAuth
	public String edit() throws NumberFormatException, ParseException {
		enterpriseService.update(enterpriseDto.enterpriseId, enterpriseDto.userId, editEnterpriseForm.userId,
				editEnterpriseForm.name, editEnterpriseForm.foundingDate, editEnterpriseForm.founderName,
				editEnterpriseForm.address, editEnterpriseForm.capital, editEnterpriseForm.presidentName,
				editEnterpriseForm.numOfEmployees, editEnterpriseForm.business, editEnterpriseForm.phoneNumber,
				editEnterpriseForm.url, editEnterpriseForm.oneThing, editEnterpriseForm.mailAddress);
		enterpriseDto.userId = editEnterpriseForm.userId;
		return "confirm.jsp";
	}
}
