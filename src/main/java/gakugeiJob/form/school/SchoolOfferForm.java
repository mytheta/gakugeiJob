package gakugeiJob.form.school;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

public class SchoolOfferForm {

	@Required
	@Maxlength(maxlength = 10)
	public int schoolId;

	@Required
	@Maxlength(maxlength = 1000)
	public String description;

	@Required
	@Maxlength(maxlength = 100)
	public String salary;

	@Maxlength(maxlength = 100)
	public String workSchedule;

	@Maxlength(maxlength = 100)
	public String period;

	@Maxlength(maxlength = 100)
	public String address;

	@Maxlength(maxlength = 100)
	public String station;

	@Maxlength(maxlength = 100)
	public String qualification;

	@Maxlength(maxlength = 100)
	public String welfare;

	@Maxlength(maxlength = 100)
	public String oneThing;

	@IntegerType
	public String schoolOfferId;

}