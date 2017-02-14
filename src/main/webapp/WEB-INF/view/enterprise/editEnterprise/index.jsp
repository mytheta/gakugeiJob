<tiles:insert template="/WEB-INF/view/common/enterprise/layout.jsp" flush="true">
	<tiles:put name="title" value="MyPage" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
		<h2 class="text-center page-header">プロフィール編集<br>
		<small>入力項目に適していないとき、エラーになります。●がついているところは必須の入力項目です。</small>
		</h2>
		<div class="container">
		<form name="editEnterpriseActionForm" class="form-horizontal" action="/gakugeiJob/enterprise/editEnterprise/" method="POST">
			<div class="form-group">
				<label class="col-sm-2 control-label">ユーザーID:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="userId" maxlength="12" value=<c:out value="${enterprise.userId}"/> required autofocus></div>
				<div class="col-sm-7"><p class="help-block">半角英数字12文字以内で入力してください。</p></div>
			</div>
 
				<div class="form-group">
				<label class="col-sm-2 control-label">● 企業名:</label>
					<div class="col-sm-10"><input type="text" class="form-control" name="name"  maxlength="50" placeholder="50文字以内" required value=<c:out value="${enterprise.name}"/>></div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">創業日:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="foundingDate"  maxlength="20" placeholder="20文字以内" value=<c:out value="${enterprise.foundingDate}"/>> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">創業者の氏名:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="founderName" maxlength="20" placeholder="20文字以内" value=<c:out value="${enterprise.founderName}"/>> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">本社の住所:</label>
					<div class="col-sm-10"><input type="text" class="form-control" name="address" maxlength="100"  placeholder="100文字以内" value=<c:out value="${enterprise.address}"/> > </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">資本金:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="capital"  maxlength="20" placeholder="20文字以内" value=<c:out value="${enterprise.capital}"/>> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">代表取締役者氏名:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="presidentName"  maxlength="20" placeholder="20文字以内" value=<c:out value="${enterprise.presidentName}"/>> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">従業員数:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="numOfEmployees" maxlength="20" placeholder="20文字以内" value=<c:out value="${enterprise.numOfEmployees}"/>> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">営業種目:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="business"  maxlength="20" placeholder="20文字以内" value=<c:out value="${enterprise.business}"/>> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">● 電話番号:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="phoneNumber" value=<c:out value="${enterprise.phoneNumber}"/> maxlength="12" placeholder="12文字以内" required> </div>
					<div class="col-sm-7"><p class="help-block">ハイフン無しで入力してください。</p></div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">企業URL:</label>
					<div class="col-sm-10"><input type="text" class="form-control" name="url" pattern="https?://.+" maxlength="100" maxlength="100" placeholder="100文字以内" value=<c:out value="${enterprise.url}"/>> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">ひとこと:</label>
					<div class="col-sm-10"><input type="text" class="form-control" name="oneThing" maxlength="100" placeholder="100文字以内" value=<c:out value="${enterprise.oneThing}"/>> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">● メールアドレス:</label>
					<div class="col-sm-10"><input type="text" class="form-control" name="mailAddress" value=<c:out value="${enterprise.mailAddress}"/> pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" maxlength="100" placeholder="100文字以内" required> </div>
				</div>
		
			<div class="col-sm-offset-2 col-sm-9 text-right"><br>
	     	    <button type="submit" class="btn btn-lg btn-success" name="edit" value="Edit">編集</button>
	     	</div>
	    </form>
      	</div> <!-- container -->
		
	</tiles:put>
</tiles:insert>