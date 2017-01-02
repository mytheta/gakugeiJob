package gakugeiJob.action.school;

import javax.annotation.Resource;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.SchoolAuth;
import gakugeiJob.db.exentity.School;
import gakugeiJob.dto.SchoolDto;
import gakugeiJob.service.SchoolService;

public class HomeAction {

	@Resource
	protected SchoolDto schoolDto;

	@Resource
	protected SchoolService schoolService;

	public ListResultBean<School>schoolList;
	public String userId;

	@Execute(validator = false)
	@SchoolAuth
	public String index(){
		schoolList = schoolService.selectAll();
		userId = schoolDto.userId;
		return "index.jsp";
	}
}
