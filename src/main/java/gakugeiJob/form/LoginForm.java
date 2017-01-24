package gakugeiJob.form;

import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

public class LoginForm {
	
	@Required
	@Maxlength(maxlength = 12)
	public String userId;

	@Required
	@Maxlength(maxlength = 12)
	public String userPass;
}
