package gakugeiJob.form.student;

import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Minlength;
import org.seasar.struts.annotation.Required;

public class EditPassForm {

	@Required
	@Maxlength(maxlength = 12)
	@Minlength(minlength = 6)
	@Mask(mask = "^[A-Za-z0-9]+$")
	public String userPass;
}
