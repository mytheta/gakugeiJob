<tiles:insert template="/WEB-INF/view/common/admin/layout.jsp" flush="true">
	<tiles:put name="title" value="パスワード変更" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;color:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<br>
 	 	<h2 class="text-center page-header">パスワード変更</h2>
		
		<div class="container"><br>
        	<form name="editPassActionForm" class="form-horizontal" action="/gakugeiJob/admin/editPass/" method="POST">
        		<div class="form-group">
				<label class="col-sm-4 control-label">ユーザーパスワード:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="userPass" maxlength="12" required autofocus></div>
				<div class="col-sm-5"><p class="help-block">12文字以内で入力してください。</p></div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-4 control-label">管理者パスワード１:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="adminPass1" maxlength="12" required></div>
				<div class="col-sm-5"><p class="help-block">12文字以内で入力してください。</p></div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-4 control-label">管理者パスワード２:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="adminPass2" maxlength="12" required></div>
				<div class="col-sm-5"><p class="help-block">12文字以内で入力してください。</p></div>
				</div>     	

				<div class="col-sm-offset-2 col-sm-10 text-right"><br>
	     	    	<button class="btn btn-lg btn-default" type="submit" name="edit" value="Add">変更</button>
	     	    </div>
      		</form>
      	</div> <!-- container -->
	</tiles:put>
</tiles:insert>