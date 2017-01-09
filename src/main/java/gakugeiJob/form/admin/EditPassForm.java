package gakugeiJob.form.admin;

import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

public class EditPassForm {

	@Required
	@Maxlength(maxlength = 12)
	@Mask(mask = "^[A-Za-z0-9]+$")
	public String userPass;
	
	@Required
	@Maxlength(maxlength = 12)
	@Mask(mask = "^[A-Za-z0-9]+$")
	public String adminPass1;
	
	@Required
	@Maxlength(maxlength = 12)
	@Mask(mask = "^[A-Za-z0-9]+$")
	public String adminPass2;	
}
