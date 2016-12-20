package gakugeiJob.form.admin;

import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

public class EditPassForm {

	@Required
	@Maxlength(maxlength = 12)
	public String userPass;
	
	@Required
	@Maxlength(maxlength = 12)
	public String adminPass1;
	
	@Required
	@Maxlength(maxlength = 12)
	public String adminPass2;	
}
