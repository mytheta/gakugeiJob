package gakugeiJob.form.enterprise;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

public class EditOfferForm {

	@Required
	@Maxlength(maxlength = 10)
	public int enterpriseId;

	@Required
	@Maxlength(maxlength = 1000)
	public String description;

	@Required
	@Maxlength(maxlength = 50)
	public String officeName;

	@Required
	@Maxlength(maxlength = 100)
	public String address;

	@Required
	@Maxlength(maxlength = 100)
	public String station;

	@Required
	@Maxlength(maxlength = 100)
	public String period;

	@Required
	@Maxlength(maxlength = 100)
	public String holiday;

	@Required
	@Maxlength(maxlength = 100)
	public String workingTime;

	@Required
	@Maxlength(maxlength = 100)
	public String salary;

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
