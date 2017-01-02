package gakugeiJob.form.student;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Maxlength;

public class AddEnterpriseOfferForm {
	
	@IntegerType
	public String jobOfferId;
	
	@Maxlength(maxlength = 100)
	public String title;
	
	@Maxlength(maxlength = 400)
	public String content;
}

