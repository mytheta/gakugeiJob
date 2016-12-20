package gakugeiJob.action.admin;

import javax.annotation.Resource;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.AdminAuth;
import gakugeiJob.db.exentity.Enterprise;
import gakugeiJob.db.exentity.Login;
import gakugeiJob.form.admin.LoginListForm;
import gakugeiJob.service.EnterpriseService;
import gakugeiJob.service.LoginService;

public class ViewEnterpriseAction {
	
	@Resource
	@ActionForm
	LoginListForm loginListForm;
	
	@Resource
	EnterpriseService enterpriseService;
	
	@Resource
	LoginService loginService;
	
	public ListResultBean<Enterprise> enterpriseList;
	public ListResultBean<Login> loginList;
	
	@Execute(validator = false)
	@AdminAuth
    public String index(){
		enterpriseList = enterpriseService.selectAll();
		loginList = loginService.selectAll();
		
        return "index.jsp";
    }
	
	@Execute(validator = false)
	@AdminAuth
	public String delete(){
		enterpriseService.delete(loginListForm.userId);
		return "confirm.jsp";
	}
}
