<tiles:insert template="/WEB-INF/view/common/enterprise/layout.jsp" flush="true">
	<tiles:put name="title" value="求人編集" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
		<h2 class="text-center page-header">求人編集<br>
		<small>入力項目に適していないとき、エラーになります。必ず全項目入力のこと。</small>
		</h2>
		
		<c:forEach items="${enterpriseOfferList}" var="enterpriseOffer">
 	<c:forEach items="${enterpriseList}" var="enterprise">		
 	 	<c:if test="${(enterpriseOffer.jobOfferId == jobOfferId) && (enterprise.enterpriseId == enterpriseOffer.enterpriseId)}">
		<div class="container">
		<form name="editOfferActionForm" class="form-horizontal" action="/gakugeiJob/enterprise/editOffer/" method="POST">
			<div class="form-group">
				<label class="col-sm-2 control-label">●勤務先名:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="officeName" maxlength="50" value="${enterpriseOffer.officeName}" required autofocus></div>
				<div class="col-sm-7"><p class="help-block">50文字以内で入力してください。</p></div>
			</div>
			
			<div class="form-group">
				<label class="col-sm-2 control-label">●仕事内容:</label>
				<div class="col-sm-7"><p class="help-block">1000文字以内で入力してください。</p></div>
				<div class="col-xs-offset-2"><textarea class="form-control" name="description" maxlength="1000" required autofocus>${enterpriseOffer.description}</textarea></div>
				</div>

				<div class="form-group">
				<label class="col-sm-2 control-label">●給与情報:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="salary" value="${enterpriseOffer.salary}" maxlength="100" placeholder="100文字以内" required> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">経験資格:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="qualification" value="${enterpriseOffer.qualification}" maxlength="100" placeholder="100文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">勤務先住所:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="address" value="${enterpriseOffer.address}" maxlength="100" placeholder="100文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">最寄駅:</label>
					<div class="col-sm-10"><input type="text" class="form-control" name="station" value="${enterpriseOffer.station}" maxlength="100"  placeholder="100文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">勤務地:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="address" value="${enterpriseOffer.address}" maxlength="100" placeholder="100文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">勤務期間:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="period" value="${enterpriseOffer.period}" maxlength="100" placeholder="100文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">勤務時間:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="workingTime" value="${enterpriseOffer.workingTime}" maxlength="100" placeholder="100文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">休日・休暇:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="holiday" value="${enterpriseOffer.holiday}" maxlength="100" placeholder="100文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">待遇・福利厚生:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="welfare" value="${enterpriseOffer.welfare}" maxlength="100" placeholder="100文字以内" > </div>
				</div>
				
				
				<div class="form-group">
				<label class="col-sm-2 control-label">ひとこと:</label>
					<div class="col-sm-10"><input type="text" class="form-control" name="oneThing" value="${enterpriseOffer.oneThing}" maxlength="100" placeholder="100文字以内"> </div>
				</div>
				
			<div class="col-sm-offset-2 col-sm-9 text-right"><br>
			<input type="hidden" value="${enterpriseOffer.jobOfferId}" name="jobOfferId"/>
	     	    <button type="submit" class="btn btn-lg btn-default" name="edit" value="Edit">編集</button>
	     	</div>
	    </form>
      	</div> <!-- container -->
			</c:if>
 	</c:forEach>
 	</c:forEach>
	</tiles:put>
</tiles:insert>