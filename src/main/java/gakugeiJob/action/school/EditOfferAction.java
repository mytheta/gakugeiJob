package gakugeiJob.action.school;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import gakugeiJob.annotation.SchoolAuth;
import gakugeiJob.db.exentity.School;
import gakugeiJob.db.exentity.SchoolOffer;
import gakugeiJob.dto.SchoolDto;
import gakugeiJob.form.school.EditOfferForm;
import gakugeiJob.form.school.SchoolOfferForm;
import gakugeiJob.service.SchoolOfferService;
import gakugeiJob.service.SchoolService;

public class EditOfferAction {

	@Resource
	@ActionForm
	EditOfferForm editOfferForm;

	@Resource
	@ActionForm
	protected SchoolOfferForm schoolOfferForm;

	@Resource
	protected  SchoolDto schoolDto;

	@Resource
	protected SchoolService schoolService;

	@Resource
	SchoolOfferService schoolOfferService;


	public ListResultBean<School> schoolList;
	public ListResultBean<SchoolOffer> schoolOfferList;
	public int schoolId;
	public int schoolOfferId;
	public ArrayList<String> errorMessages;


	@Execute(validator = false)
	@SchoolAuth
	public String index(){

		schoolId = schoolDto.schoolId;
		schoolOfferList = schoolOfferService.selectAll();
		schoolList = schoolService.selectAll();

		return "index.jsp";
	}

	@Execute(validator=false)
	@SchoolAuth
	public String edit() throws NumberFormatException, ParseException{
		errorMessages = new ArrayList<String>();
		// 以下は形式チェック
		// 最寄駅に対するエラー遷移
		// 仕事内容に対するエラー遷移
		if (!(schoolOfferForm.description == null || schoolOfferForm.description.length() == 0)
				&& !(schoolOfferForm.description.matches(".{1,1000}")))
				errorMessages.add("仕事内容は正しい形式ではありません。");
		// 給与情報に対するエラー遷移
		if (!(schoolOfferForm.salary == null || schoolOfferForm.salary.length() == 0)
				&& !(schoolOfferForm.salary.matches(".{1,100}")))
				errorMessages.add("給与情報は正しい形式ではありません");
		// 勤務時間に対するエラー遷移
		if (!(schoolOfferForm.workSchedule == null || schoolOfferForm.workSchedule.length() == 0)
				&& !(schoolOfferForm.workSchedule.matches(".{1,100}")))
			errorMessages.add("勤務時間は正しい形式ではありません");
		// 勤務期間に対するエラー遷移
		if (!(schoolOfferForm.period == null || schoolOfferForm.period.length() == 0)
				&& !(schoolOfferForm.period.matches(".{1,100}")))
				errorMessages.add("勤務期間は正しい形式ではありません");
		// 勤務地に対するエラー遷移
		if (!(schoolOfferForm.address == null || schoolOfferForm.address.length() == 0)
				&& !(schoolOfferForm.address.matches(".{1,100}")))
				errorMessages.add("勤務地は正しい形式ではありません");
		// 最寄駅に対するエラー遷移
		if (!(schoolOfferForm.station == null || schoolOfferForm.station.length() == 0)
				&& !(schoolOfferForm.station.matches(".{1,100}")))
				errorMessages.add("最寄駅は正しい形式ではありません");
		// 経験資格に対するエラー遷移
		if (!(schoolOfferForm.qualification == null || schoolOfferForm.qualification.length() == 0)
				&& !(schoolOfferForm.qualification.matches(".{1,100}")))
				errorMessages.add("経験資格は正しい形式ではありません");
		// 待遇・福利厚生に対するエラー遷移
		if (!(schoolOfferForm.welfare == null || schoolOfferForm.welfare.length() == 0)
				&& !(schoolOfferForm.welfare.matches(".{1,100}")))
				errorMessages.add("待遇・福利厚生は正しい形式ではありません");
		// ひとことに対するエラー遷移
		if (!(schoolOfferForm.oneThing == null || schoolOfferForm.oneThing.length() == 0)
				&& !(schoolOfferForm.oneThing.matches(".{1,100}")))
				errorMessages.add("ひとことは正しい形式ではありません");

		// フォームに入力されたものが正しくなかったらエラー遷移
		if (!(errorMessages.isEmpty())) {
			System.out.print(errorMessages);
			return "error.jsp";
		}

		schoolOfferId = editOfferForm.schoolOfferId;
		schoolOfferService.updateOffer(schoolOfferId, schoolDto.schoolId, editOfferForm.description, editOfferForm.salary,
				editOfferForm.workSchedule, editOfferForm.period, editOfferForm.address,
				editOfferForm.station, editOfferForm.qualification,
			    editOfferForm.welfare, editOfferForm.oneThing);

		return "confirm.jsp";
	}
}
