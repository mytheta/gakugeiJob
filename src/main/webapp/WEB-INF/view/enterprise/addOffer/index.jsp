<tiles:insert template="/WEB-INF/view/common/enterprise/layout.jsp" flush="true">
	<tiles:put name="title" value="MyPage" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFF;color:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1><br>
 	 		<h2 class="text-center">新規求人登録</h2>
 	 	</div>
 	 	
 	 	<div class="container">
 	 	<h1 class="page-header">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<small>登録情報（●印は入力必須項目）<br>入力項目に適していないとき、またユーザーIDが既に使われている場合エラーになります。</small></h1><br>	
        	<form name="AddOfferActionForm" class="form-horizontal" action="/gakugeiJob/enterprise/addOffer/" method="POST">
				<div class="form-group">
				<label class="col-sm-2 control-label">● 仕事内容:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="description" maxlength="12" required autofocus></div>
				<div class="col-sm-7"><p class="help-block">1000文字以内で入力してください。</p></div>
				
				</div>
				<div class="form-group">
				<label class="col-sm-2 control-label">● 勤務先名:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="officeName" maxlength="50" required></div>
				<div class="col-sm-7"><p class="help-block">50文字以内で入力してください。</p></div>
				</div>     	
				
				<div class="form-group">
				<label class="col-sm-2 control-label">● 勤務地:</label>
					<div class="col-sm-10"><input type="text" class="form-control" name="address" maxlength="100" placeholder="50文字以内"required></div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">最寄駅:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="station" maxlength="100" placeholder="20文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">勤務期間:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="period" maxlength="100" placeholder="20文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">休日・休暇:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="holiday" maxlength="100" placeholder="20文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">勤務時間:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="workingTime" maxlength="100" placeholder="20文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">給与情報:</label>
					<div class="col-sm-10"><input type="text" class="form-control" name="salary" maxlength="100" placeholder="100文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">経験・資格:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="qualification" maxlength="100" placeholder="20文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">待遇・福利厚生:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="welfare" maxlength="100" placeholder="20文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">ひとこと:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="oneThing" maxlength="100" placeholder="20文字以内"> </div>
				</div>
				
				<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10 text-right">
	     	    	<button class="btn btn-lg btn-default" type="submit" name="add" value="Add">新規登録</button>
	     	    </div>
	     	    
	     	    </div>
      		</form>
      	</div> 
	</tiles:put>
</tiles:insert>
