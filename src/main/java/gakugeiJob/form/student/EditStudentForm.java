package gakugeiJob.form.student;

import org.seasar.struts.annotation.IntegerType;
import org.seasar.struts.annotation.Mask;
import org.seasar.struts.annotation.Maxlength;
import org.seasar.struts.annotation.Required;

public class EditStudentForm {

	@Required
	@Maxlength(maxlength = 12)
	@Mask(mask = "^[A-Za-z0-9]+$")
	public String userId;
	
	@Required
	@Maxlength(maxlength = 10)
	public String name;
	
	@Required
	public String birthday;
	
	@Required
	@IntegerType
	public String sex;
	
	@Required
	@IntegerType
	public String phoneNumber;
	
	@Required
	@Maxlength(maxlength = 50)
	public String mailAddress;
	
	@Required
	@Maxlength(maxlength = 100)
	public String address;
}
