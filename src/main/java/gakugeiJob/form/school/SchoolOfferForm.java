package gakugeiJob.form.school;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

public class SchoolOfferForm {

	@Required
	@Maxlength(maxlength = 10)
	public int schoolId;

	@Required
	@Maxlength(maxlength = 100)
	public String description;

	@Required
	@Maxlength(maxlength = 100)
	public String salary;

	@Required
	@Maxlength(maxlength = 100)
	public String workSchedule;

	@Required
	@Maxlength(maxlength = 100)
	public String period;

	@Required
	@Maxlength(maxlength = 100)
	public String address;

	@Required
	@Maxlength(maxlength = 100)
	public String station;

	@Required
	@Maxlength(maxlength = 100)
	public String qualification;

	@Required
	@Maxlength(maxlength = 100)
	public String welfare;

	@Required
	@Maxlength(maxlength = 100)
	public String oneThing;

	@IntegerType
	public String jobOfferId;

}