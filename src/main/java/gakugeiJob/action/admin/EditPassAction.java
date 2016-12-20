package gakugeiJob.action.admin;

import java.security.NoSuchAlgorithmException;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.AdminAuth;
import gakugeiJob.dto.AdminDto;
import gakugeiJob.form.admin.EditPassForm;
import gakugeiJob.service.AdminService;

public class EditPassAction {

	@Resource
	@ActionForm
	protected EditPassForm editPassForm;
	
	@Resource
	protected AdminService adminService;
	
	@Resource
	protected AdminDto adminDto;
	
	@Execute(validator = false)
	@AdminAuth
    public String index(){
        return "index.jsp";
    }
	
	@Execute(input ="/error/?redirect=true")
	@AdminAuth
	public String edit() throws NoSuchAlgorithmException{
		adminService.updateAdminPass(adminDto.userId, editPassForm.userPass, editPassForm.adminPass1, editPassForm.adminPass2);
		return "confirm.jsp";
	}
}
