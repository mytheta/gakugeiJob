package gakugeiJob.action.enterprise;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.seasar.dbflute.cbean.ListResultBean;
import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import gakugeiJob.annotation.EnterpriseAuth;
import gakugeiJob.db.exentity.Enterprise;
import gakugeiJob.db.exentity.EnterpriseOffer;
import gakugeiJob.dto.EnterpriseDto;
import gakugeiJob.form.enterprise.EditOfferForm;
import gakugeiJob.service.EnterpriseOfferService;
import gakugeiJob.service.EnterpriseService;

public class EditOfferAction {

	private static final int MAX_LENGTH_DESCRIPTION = 1000;
	private static final int MIN_LENGTH_DESCRIPTION = 1;

	@Resource
	@ActionForm
	EditOfferForm editOfferForm;

	@Resource
	protected EnterpriseDto enterpriseDto;

	@Resource
	protected EnterpriseService enterpriseService;

	@Resource
	EnterpriseOfferService enterpriseOfferService;

	public ListResultBean<Enterprise> enterpriseList;
	public ListResultBean<EnterpriseOffer> enterpriseOfferList;
	public int enterpriseId;
	public int enterpriseOfferId;
	public int jobOfferId;
	public ArrayList<String> errorMessages;

	@Execute(validator = false)
	@EnterpriseAuth
	public String index() {
		jobOfferId = Integer.parseInt(editOfferForm.jobOfferId);
		enterpriseOfferList = enterpriseOfferService.selectAll();
		enterpriseList = enterpriseService.selectAll();
		return "index.jsp";
	}

	@Execute(validator = false)
	@EnterpriseAuth
	public String edit() throws NumberFormatException, ParseException {

		errorMessages = new ArrayList<String>();
		// 以下はrequiredチェック
		// 仕事内容に対するエラー遷移
		if (editOfferForm.description == null || editOfferForm.description.length() == 0)
			errorMessages.add("仕事内容は必須入力項目です。");
		// 勤務先名に対するエラー遷移
		if (editOfferForm.officeName == null || editOfferForm.officeName.length() == 0)
			errorMessages.add("勤務先名は必須入力項目です");
		// 給与情報に対するエラー遷移
		if (editOfferForm.salary == null || editOfferForm.salary.length() == 0)
			errorMessages.add("給与情報は必須入力項目です");

		// 以下は形式チェック
		// 仕事内容に対するエラー遷移
		if (!(editOfferForm.description == null || editOfferForm.description.length() == 0)
				&& (editOfferForm.description.length() > MAX_LENGTH_DESCRIPTION
						|| editOfferForm.description.length() < MIN_LENGTH_DESCRIPTION))
			errorMessages.add("仕事内容は正しい形式ではありません。");
		// 勤務先名に対するエラー遷移
		if (!(editOfferForm.officeName == null || editOfferForm.officeName.length() == 0)
				&& !(editOfferForm.officeName.matches(".{1,50}")))
			errorMessages.add("勤務先名は正しい形式ではありません");
		// 勤務地に対するエラー遷移
		if (!(editOfferForm.address == null || editOfferForm.address.length() == 0)
				&& !(editOfferForm.address.matches(".{1,100}")))
			errorMessages.add("勤務地は正しい形式ではありません");
		// 最寄駅に対するエラー遷移
		if (!(editOfferForm.station == null || editOfferForm.station.length() == 0)
				&& !(editOfferForm.station.matches(".{1,100}")))
			errorMessages.add("最寄駅は正しい形式ではありません");
		// 勤務期間に対するエラー遷移
		if (!(editOfferForm.period == null || editOfferForm.period.length() == 0)
				&& !(editOfferForm.period.matches(".{1,100}")))
			errorMessages.add("勤務期間は正しい形式ではありません");
		// 休日・休暇に対するエラー遷移
		if (!(editOfferForm.holiday == null || editOfferForm.holiday.length() == 0)
				&& !(editOfferForm.holiday.matches(".{1,100}")))
			errorMessages.add("休日・休暇は正しい形式ではありません");
		// 勤務時間に対するエラー遷移
		if (!(editOfferForm.workingTime == null || editOfferForm.workingTime.length() == 0)
				&& !(editOfferForm.workingTime.matches(".{1,100}")))
			errorMessages.add("勤務時間は正しい形式ではありません");
		// 給与情報に対するエラー遷移
		if (!(editOfferForm.salary == null || editOfferForm.salary.length() == 0)
				&& !(editOfferForm.salary.matches(".{1,100}")))
			errorMessages.add("給与情報は正しい形式ではありません");
		// 経験資格に対するエラー遷移
		if (!(editOfferForm.qualification == null || editOfferForm.qualification.length() == 0)
				&& !(editOfferForm.qualification.matches(".{1,100}")))
			errorMessages.add("経験資格は正しい形式ではありません");
		// 待遇・福利厚生に対するエラー遷移
		if (!(editOfferForm.welfare == null || editOfferForm.welfare.length() == 0)
				&& !(editOfferForm.welfare.matches(".{1,100}")))
			errorMessages.add("待遇・福利厚生は正しい形式ではありません");
		// ひとことに対するエラー遷移
		if (!(editOfferForm.oneThing == null || editOfferForm.oneThing.length() == 0)
				&& !(editOfferForm.oneThing.matches(".{1,100}")))
			errorMessages.add("ひとことは正しい形式ではありません");

		// フォームに入力されたものが正しくなかったらエラー遷移
		if (!(errorMessages.isEmpty())) {
			return "error.jsp";
		}

		jobOfferId = Integer.parseInt(editOfferForm.jobOfferId);
		enterpriseOfferService.updateOffer(enterpriseDto.enterpriseId, editOfferForm.description,
				editOfferForm.officeName, editOfferForm.address, editOfferForm.station, editOfferForm.period,
				editOfferForm.holiday, editOfferForm.workingTime, editOfferForm.salary, editOfferForm.qualification,
				editOfferForm.welfare, editOfferForm.oneThing, jobOfferId);
		return "confirm.jsp";
	}
}
