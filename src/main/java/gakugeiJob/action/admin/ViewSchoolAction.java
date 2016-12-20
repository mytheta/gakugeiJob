package gakugeiJob.action.admin;

import javax.annotation.Resource;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.AdminAuth;
import gakugeiJob.db.exentity.Login;
import gakugeiJob.db.exentity.School;
import gakugeiJob.form.admin.LoginListForm;
import gakugeiJob.service.LoginService;
import gakugeiJob.service.SchoolService;

public class ViewSchoolAction {
	
	@ActionForm
	@Resource
	protected LoginListForm loginListForm;
	
	@Resource
	protected SchoolService schoolService;
	@Resource
	protected LoginService loginService;
	
	public ListResultBean<School> schoolList;
	public ListResultBean<Login> loginList;

	@Execute(validator = false)
	@AdminAuth
    public String index(){
		schoolList = schoolService.selectAll();
		loginList = loginService.selectAll();
        return "index.jsp";
    }
	
	@Execute(validator = false)
	@AdminAuth
	public String delete(){
		schoolService.delete(loginListForm.userId);
		return "confirm.jsp";
	}
}
