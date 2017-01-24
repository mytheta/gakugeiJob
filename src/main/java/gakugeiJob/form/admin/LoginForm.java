package gakugeiJob.form.admin;

import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

public class LoginForm {
	
	@Required
	@Maxlength(maxlength = 12)
	public String adminPass1;
	
	@Required
	@Maxlength(maxlength = 12)
	public String adminPass2;
}
