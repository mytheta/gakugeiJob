<tiles:insert template="/WEB-INF/view/common/admin/layout.jsp" flush="true">
	<tiles:put name="title" value="学校パスワード変更" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<br>
 	 	<h2 class="text-center page-header">パスワード変更<br>
		<small>ユーザーID : <c:out value="${userId}" />　のユーザーパスワードを変更します。</small>
 	 	</h2>
		
		<div class="container"><br>
        	<form name="editPassActionForm" class="form-horizontal" action="/gakugeiJob/admin/editSchool/" method="POST">
        		<div class="form-group">
				<label class="col-sm-4 control-label">ユーザーパスワード:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="userPass" maxlength="12" required autofocus></div>
				<div class="col-sm-5"><p class="help-block">半角英数字12文字以内で入力してください。</p></div>
				</div>
				<input type="hidden" name="userId" value="<c:out value="${userId}" />" />
				<div class="col-sm-offset-2 col-sm-10 text-right"><br>
	     	    	<button class="btn btn-lg btn-default" type="submit" name="edit" value="Edit">変更</button>
	     	    </div>
      		</form>
      	</div> <!-- container -->
	</tiles:put>
</tiles:insert>