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
				<div class="col-sm-7"><p class="help-block">12文字以内で入力してください。</p></div>
			</div>
			<br>
		
			<div class="col-sm-offset-2 col-sm-9 text-right"><br>
	     	    <button type="submit" class="btn btn-lg btn-default" name="edit" value="Edit">編集</button>
	     	</div>
	    </form>
      	</div> <!-- container -->
		
	</tiles:put>
</tiles:insert>