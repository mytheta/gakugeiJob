<tiles:insert template="/WEB-INF/view/common/admin/layout.jsp" flush="true">
	<tiles:put name="title" value="学生登録" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<br>
 	 	<h2 class="text-center">学生情報登録</h2>
		
		<div class="container">
 	 	<h1 class="page-header">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<small>入力項目に適していないとき、またユーザーIDが既に使われている場合エラーになります。</small></h1><br>	
        	<form name="addStudentActionForm" class="form-horizontal" action="/gakugeiJob/admin/addStudent/" method="POST">
				<div class="form-group">
				<label class="col-sm-2 control-label">ユーザーID:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="userId" maxlength="12" required autofocus></div>
				<div class="col-sm-7"><p class="help-block">12文字以内で入力してください。(学籍番号推奨)</p></div>
				
				</div>
				<div class="form-group">
				<label class="col-sm-2 control-label">ユーザーパスワード:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="userPass" maxlength="12" required></div>
				<div class="col-sm-7"><p class="help-block">12文字以内で入力してください。("root推奨")</p></div>
				</div>     	

				<div class="col-sm-offset-2 col-sm-10 text-right"><br>
	     	    	<button class="btn btn-lg btn-default" type="submit" name="add" value="Add">新規登録</button>
	     	    </div>
      		</form>
      	</div> <!-- container -->
	</tiles:put>
</tiles:insert>
	