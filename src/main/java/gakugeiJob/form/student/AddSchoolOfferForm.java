package gakugeiJob.form.student;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Maxlength;

public class AddSchoolOfferForm {
	
	@IntegerType
	public String schoolOfferId;
	
	@Maxlength(maxlength = 100)
	public String title;
	
	@Maxlength(maxlength = 400)
	public String content;
}
