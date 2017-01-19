<tiles:insert template="/WEB-INF/view/common/school/layout.jsp" flush="true">
	<tiles:put name="title" value="MyPage" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFF;color:#000">
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<h2 class="text-center">求人編集<br>
 	 	<small>入力項目に適していないとき、エラーになります。●がついている項目は入力が必須の項目です。入力されていないとエラーになります。</small>
		</h2>
		<div class="container">
		<form name="editOfferActionForm" class="form-horizontal" action="/gakugeiJob/school/editOffer/" method="POST">
			<div class="form-group">
				<label class="col-sm-2 control-label">●仕事内容:</label>
					<div class="col-sm-7"><textarea class="form-control" name="description" maxlength="1000" required autofocus></textarea></div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">●給与情報:</label>
					<div class="col-sm-7"><input type="text" class="form-control" name="salary" maxlength="100" value="${schoolOffer.salary}" placeholder="100文字以内" required autofocus></div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">勤務形態:</label>
					<div class="col-sm-7"><input type="text" class="form-control" name="workSchedule" maxlength="100" value="${schoolOffer.workSchedule}" placeholder="100文字以内"></div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">勤務期間:</label>
					<div class="col-sm-7"><input type="text" class="form-control" name="period" maxlength="100" value="${schoolOffer.period}" placeholder="100文字以内"></div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">勤務地:</label>
					<div class="col-sm-7"><input type="text" class="form-control" name="address" maxlength="100" value="${schoolOffer.address}" placeholder="100文字以内"></div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">最寄駅:</label>
					<div class="col-sm-7"><input type="text" class="form-control" name="station" maxlength="100" value="${schoolOffer.station}" placeholder="100文字以内"></div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">経験・資格:</label>
					<div class="col-sm-7"><input type="text" class="form-control" name="qualification" maxlength="100" value="${schoolOffer.qualification}" placeholder="100文字以内"></div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">待遇・福利厚生:</label>
					<div class="col-sm-7"><input type="text" class="form-control" name="welfare" maxlength="100" value="${schoolOffer.welfare}" placeholder="100文字以内"></div>
			</div>

			<div class="form-group">
				<label class="col-sm-2 control-label">ひとこと:</label>
					<div class="col-sm-7"><input type="text" class="form-control" name="oneThing" maxlength="100" value="${schoolOffer.oneThing}" placeholder="100文字以内"></div>
			</div>

				<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10 text-right">
	     	    	<button class="btn btn-lg btn-success" type="submit" name="edit" value="Edit">編集</button>
	     	    </div>

	     	    </div>
      		</form>
      	</div>
	</tiles:put>
</tiles:insert>
