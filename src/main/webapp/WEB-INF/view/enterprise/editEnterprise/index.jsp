<tiles:insert template="/WEB-INF/view/common/enterprise/layout.jsp" flush="true">
	<tiles:put name="title" value="MyPage" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
		<h2 class="text-center page-header">プロフィール編集<br>
		<small>入力項目に適していないとき、エラーになります。必ず全項目入力のこと。</small>
		</h2>
		<div class="container">
		<form name="editEnterpriseActionForm" class="form-horizontal" action="/gakugeiJob/enterprise/editEnterprise/" method="POST">
			<div class="form-group">
				<label class="col-sm-2 control-label">ユーザーID:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="userId" maxlength="12" value="${enterprise.userId}" required autofocus></div>
				<div class="col-sm-7"><p class="help-block">半角英数字12文字以内で入力してください。</p></div>
			</div>

				<div class="form-group">
				<label class="col-sm-2 control-label">● 企業名:</label>
					<div class="col-sm-10"><input type="text" class="form-control" name="name" value="${enterprise.name}" maxlength="50" placeholder="50文字以内"required></div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">創業日:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="foundingDate" value="${enterprise.foundingDate}" maxlength="20" placeholder="20文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">創業者の氏名:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="founderName" value="${enterprise.founderName}" maxlength="20" placeholder="20文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">本社の住所:</label>
					<div class="col-sm-10"><input type="text" class="form-control" name="address" value="${enterprise.address}" maxlength="100"  placeholder="100文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">資本金:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="capital" value="${enterprise.capital}" maxlength="20" placeholder="20文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">代表取締役者氏名:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="presidentName" value="${enterprise.presidentName}" maxlength="20" placeholder="20文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">従業員数:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="numOfEmployees" value="${enterprise.numOfEmployees}" maxlength="20" placeholder="20文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">営業種目:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="business" value="${enterprise.business}" maxlength="20" placeholder="20文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">● 電話番号:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="phoneNumber" value="${enterprise.phoneNumber}" maxlength="20" placeholder="20文字以内" required> </div>
					<div class="col-sm-7"><p class="help-block">ハイフン無しで入力してください。</p></div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">企業URL:</label>
					<div class="col-sm-10"><input type="text" class="form-control" name="url" value="${enterprise.url}" maxlength="100" placeholder="100文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">ひとこと:</label>
					<div class="col-sm-10"><input type="text" class="form-control" name="oneThing" value="${enterprise.oneThing}" maxlength="100" placeholder="100文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">● メールアドレス:</label>
					<div class="col-sm-10"><input type="text" class="form-control" name="mailAddress" value="${enterprise.mailAddress}" maxlength="100" placeholder="100文字以内" required> </div>
				</div>
		
			<div class="col-sm-offset-2 col-sm-9 text-right"><br>
	     	    <button type="submit" class="btn btn-lg btn-default" name="edit" value="Edit">編集</button>
	     	</div>
	    </form>
      	</div> <!-- container -->
		
	</tiles:put>
</tiles:insert>