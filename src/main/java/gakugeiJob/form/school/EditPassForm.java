package gakugeiJob.form.school;

import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

public class EditPassForm {

	@Required
	@Maxlength(maxlength = 12)
	public String userPass;
}