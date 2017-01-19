package gakugeiJob.form.school;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

public class DeleteStudentOfferForm {

	@Required
	@IntegerType
	@Maxlength(maxlength = 10)
	public String schoolOfferId;

	@Required
	@IntegerType
	@Maxlength(maxlength = 10)
	public String studentId;
}
