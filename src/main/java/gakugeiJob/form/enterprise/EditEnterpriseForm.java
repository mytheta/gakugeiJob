package gakugeiJob.form.enterprise;

import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

public class EditEnterpriseForm {

	@Required
	@Maxlength(maxlength = 12)
	public String userId;
}
