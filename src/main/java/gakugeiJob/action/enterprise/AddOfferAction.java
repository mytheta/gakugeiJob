package gakugeiJob.action.enterprise;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.seasar.struts.annotation.ActionForm;
import org.seasar.struts.annotation.Execute;

import gakugeiJob.annotation.EnterpriseAuth;
import gakugeiJob.dto.EnterpriseDto;
import gakugeiJob.form.enterprise.EnterpriseOfferForm;
import gakugeiJob.service.EnterpriseService;

public class AddOfferAction {

	private static final int MAX_LENGTH_DESCRIPTION = 1000;
	private static final int MIN_LENGTH_DESCRIPTION = 1;

	@Resource
	@ActionForm
	protected EnterpriseOfferForm enterpriseOfferForm;

	@Resource
	protected EnterpriseService enterpriseService;

	@Resource
	protected EnterpriseDto enterpriseDto;

	public Integer enterpriseId;
	public ArrayList<String> errorMessages;

	@Execute(validator = false)
	@EnterpriseAuth
	public String index() {
		return "index.jsp";
	}

	@Execute(validator = false)
	@EnterpriseAuth

	public String add() {
		errorMessages = new ArrayList<String>();
		// 以下はrequiredチェック
		// 仕事内容に対するエラー遷移
		if (enterpriseOfferForm.description == null || enterpriseOfferForm.description.length() == 0)
			errorMessages.add("仕事内容は必須入力項目です。");
		// 勤務先名に対するエラー遷移
		if (enterpriseOfferForm.officeName == null || enterpriseOfferForm.officeName.length() == 0)
			errorMessages.add("勤務先名は必須入力項目です");
		// 給与情報に対するエラー遷移
		if (enterpriseOfferForm.salary == null || enterpriseOfferForm.salary.length() == 0)
			errorMessages.add("給与情報は必須項目です");
		// 以下は形式チェック
		// 仕事内容に対するエラー遷移
		if (!(enterpriseOfferForm.description == null || enterpriseOfferForm.description.length() == 0)
				&& (enterpriseOfferForm.description.length() > MAX_LENGTH_DESCRIPTION
						|| enterpriseOfferForm.description.length() < MIN_LENGTH_DESCRIPTION))
			errorMessages.add("仕事内容は正しい形式ではありません");
		//勤務先名に対するエラー遷移
		if (!(enterpriseOfferForm.officeName == null || enterpriseOfferForm.officeName.length() == 0)
				&& !(enterpriseOfferForm.officeName.matches(".{1,50}")))
			errorMessages.add("勤務先名は正しい形式ではありません");
		// 勤務地に対するエラー遷移
		if (!(enterpriseOfferForm.address == null || enterpriseOfferForm.address.length() == 0)
				&& !(enterpriseOfferForm.address.matches(".{1,100}")))
			errorMessages.add("勤務地は正しい形式ではありません");
		// 最寄駅に対するエラー遷移
		if (!(enterpriseOfferForm.station == null || enterpriseOfferForm.station.length() == 0)
				&& !(enterpriseOfferForm.station.matches(".{1,100}")))
			errorMessages.add("最寄駅は正しい形式ではありません");
		// 勤務期間に対するエラー遷移
		if (!(enterpriseOfferForm.period == null || enterpriseOfferForm.period.length() == 0)
				&& !(enterpriseOfferForm.period.matches(".{1,100}")))
			errorMessages.add("勤務期間は正しい形式ではありません");
		// 休日・休暇に対するエラー遷移
		if (!(enterpriseOfferForm.holiday == null || enterpriseOfferForm.holiday.length() == 0)
				&& !(enterpriseOfferForm.holiday.matches(".{1,100}")))
			errorMessages.add("休日・休暇は正しい形式ではありません");
		// 勤務時間に対するエラー遷移
		if (!(enterpriseOfferForm.workingTime == null || enterpriseOfferForm.workingTime.length() == 0)
				&& !(enterpriseOfferForm.workingTime.matches(".{1,100}")))
			errorMessages.add("勤務時間は正しい形式ではありません");
		// 給与情報に対するエラー遷移
		if (!(enterpriseOfferForm.salary == null || enterpriseOfferForm.salary.length() == 0)
				&& !(enterpriseOfferForm.salary.matches(".{1,100}")))
			errorMessages.add("給与情報は正しい形式ではありません");
		// 経験資格に対するエラー遷移
		if (!(enterpriseOfferForm.qualification == null || enterpriseOfferForm.qualification.length() == 0)
				&& !(enterpriseOfferForm.qualification.matches(".{1,100}")))
			errorMessages.add("経験資格は正しい形式ではありません");
		// 待遇・福利厚生に対するエラー遷移
		if (!(enterpriseOfferForm.welfare == null || enterpriseOfferForm.welfare.length() == 0)
				&& !(enterpriseOfferForm.welfare.matches(".{1,100}")))
			errorMessages.add("待遇・福利厚生は正しい形式ではありません");
		// ひとことに対するエラー遷移
		if (!(enterpriseOfferForm.oneThing == null || enterpriseOfferForm.oneThing.length() == 0)
				&& !(enterpriseOfferForm.oneThing.matches(".{1,100}")))
			errorMessages.add("ひとことは正しい形式ではありません");

		// フォームに入力されたものが正しくなかったらエラー遷移
		if (!(errorMessages.isEmpty())) {
			return "error.jsp";
		}

		enterpriseService.insertOffer(enterpriseDto.enterpriseId, enterpriseOfferForm.description,
				enterpriseOfferForm.officeName, enterpriseOfferForm.address, enterpriseOfferForm.station,
				enterpriseOfferForm.period, enterpriseOfferForm.holiday, enterpriseOfferForm.workingTime,
				enterpriseOfferForm.salary, enterpriseOfferForm.qualification, enterpriseOfferForm.welfare,
				enterpriseOfferForm.oneThing);

		return "confirm.jsp";
	}
}
