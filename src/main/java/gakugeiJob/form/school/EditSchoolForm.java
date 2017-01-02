package gakugeiJob.form.school;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

public class EditSchoolForm {

	@Required
	@Maxlength(maxlength = 12)
	public String userId;

	@Required
	@Maxlength(maxlength = 50)
	public String name;

	@Required
	@Maxlength(maxlength = 20)
	public String kinds;

	@Required
	@IntegerType
	public String phoneNumber;

	@Required
	@Maxlength(maxlength = 100)
	public String mailAddress;

	@Required
	@Maxlength(maxlength = 100)
	public String url;

	@Required
	@Maxlength(maxlength = 100)
	public String oneThing;

}
