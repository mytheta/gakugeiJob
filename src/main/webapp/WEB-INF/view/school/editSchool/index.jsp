<tiles:insert template="/WEB-INF/view/common/school/layout.jsp" flush="true">
	<tiles:put name="title" value="MyPage" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
		<h2 class="text-center page-header">プロフィール編集<br>
		<small>入力項目に適していないとき、エラーになります。●がついているところは必須の入力項目です。</small>
		</h2>
		<div class="container">
		<form name="editSchoolActionForm" class="form-horizontal" action="/gakugeiJob/school/editSchool/" method="POST">
			<div class="form-group">
				<label class="col-sm-2 control-label">●ユーザーID:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="userId" maxlength="12" value="${school.userId}" required autofocus></div>
				<div class="col-sm-7"><p class="help-block">半角英数字12文字以内で入力してください。</p></div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">●学校名:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="name" maxlength="50" value="${school.name}" placeholder="50文字以内" required autofocus></div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">学校種:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="kinds" maxlength="20" value="${school.kinds}" placeholder="20文字以内"></div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">●電話番号:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="phoneNumber" maxlength="20" value="${school.phoneNumber}" placeholder="20文字以内" required autofocus></div>
				<div class="col-sm-7"><p class="help-block">ハイフン無しで入力してください。</p></div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">●メールアドレス:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="mailAddress" maxlength="100" value="${school.mailAddress}" placeholder="100文字以内" required autofocus></div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">学校URL:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="url" maxlength="100" value="${school.url}" placeholder="100文字以内"></div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">ひとこと:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="oneThing" maxlength="100" value="${school.oneThing}" placeholder="100文字以内"></div>
			</div>
		    <div class="col-sm-offset-2 col-sm-9 text-right"><br>
	     	    <button type="submit" class="btn btn-lg btn-success" name="edit" value="Edit">編集</button>
	     	</div>
	    </form>
      	</div> <!-- container -->

	</tiles:put>
</tiles:insert>