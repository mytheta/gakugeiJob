package gakugeiJob.form.enterprise;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

public class JobOfferIdForm {

	@IntegerType
	public String jobOfferId;

	@Required
	@IntegerType
	@Maxlength(maxlength = 10)
	public String studentId;
}
