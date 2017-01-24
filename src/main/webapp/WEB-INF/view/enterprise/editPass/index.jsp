<tiles:insert template="/WEB-INF/view/common/enterprise/layout.jsp" flush="true">
	<tiles:put name="title" value="パスワード変更" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;color:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<br>
 	 	<h2 class="text-center page-header">パスワード変更</h2>
		
		<div class="container"><br>
        	<form name="editPassActionForm" class="form-horizontal" action="/gakugeiJob/enterprise/editPass/" method="POST">
        		<div class="form-group">
				<label class="col-sm-4 control-label">ユーザーパスワード:</label>
					<div class="col-sm-4"><input type="text" class="form-control" name="userPass" minlength="6" maxlength="12" required autofocus></div>
				<div class="col-sm-4"><p class="help-block">半角英数字12文字以内で入力してください。</p></div>
				</div>
				
				<div class="col-sm-offset-2 col-sm-10 text-right"><br>
	     	    	<button class="btn btn-lg btn-default" type="submit" name="edit" value="Add">変更</button>
	     	    </div>
      		</form>
      	</div> <!-- container -->
	</tiles:put>
</tiles:insert>