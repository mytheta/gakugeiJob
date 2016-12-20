package gakugeiJob.form.admin;

import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

public class StudentForm {

	@Required
	@Maxlength(maxlength = 12)
	public String userId;
	
	@Required
	@Maxlength(maxlength = 12)
	public String userPass;
}
