<tiles:insert template="/WEB-INF/view/common/student/layout.jsp" flush="true">
	<tiles:put name="title" value="MyPage" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
		<h2 class="text-center page-header">プロフィール編集<br>
		<small>入力項目に適していないとき、エラーになります。必ず全項目入力のこと。</small>
		</h2>
		<div class="container">
		<form name="editStudentActionForm" class="form-horizontal" action="/gakugeiJob/student/editStudent/" method="POST">
			<div class="form-group">
				<label class="col-sm-2 control-label">ユーザーID:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="userId" maxlength="12" value="${student.userId}" required autofocus></div>
				<div class="col-sm-7"><p class="help-block">12文字以内で入力してください。</p></div>
			</div>
			<br>
		
			<div class="form-group">
				<label class="col-sm-2 control-label">氏名:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="name" maxlength="10" value="${student.name}"></div>
				<div class="col-sm-7"><p class="help-block">10文字以内で入力してください。</p></div>
			</div>
			<br>
			
			<div class="form-group">
				<label class="col-sm-2 control-label">誕生日:</label>
				<div class="col-sm-3">
				<input type="date" name="birthday" class="form-control" value="${birthday}">
				<div class="col-sm-7">&nbsp;</div>
				</div>
			</div>
			
			<c:choose>
			<c:when test="${student.sex == 0}">
			<div class="form-group">
				<label class="col-sm-2 control-label">性別:</label>
				<div class="col-sm-3">
				<font size="4">
				<input type="radio" name="sex" value="0" checked>&nbsp;男
				<input type="radio" name="sex" value="1" >&nbsp;女
				</font>
				</div>
			</div>
			<br>
			</c:when>
			<c:when test="${student.sex == 1}">
			<div class="form-group">
				<label class="col-sm-2 control-label">性別:</label>
				<div class="col-sm-3">
				<font size="4">
				<input type="radio" name="sex" value="0" >&nbsp;男
				<input type="radio" name="sex" value="1" checked>&nbsp;女
				</font>
				</div>
			</div>
			<br>
			</c:when>
			<c:otherwise>
			<div class="form-group">
				<label class="col-sm-2 control-label">性別:</label>
				<div class="col-sm-3">
				<font size="4">
				<input type="radio" name="sex" value="0" >&nbsp;男
				<input type="radio" name="sex" value="1" >&nbsp;女
				</font>
				</div>
			</div>
			<br>
			</c:otherwise>
			</c:choose>
			
			<div class="form-group">
				<label class="col-sm-2 control-label">住所:</label>
					<div class="col-sm-7"><textarea class="form-control" name="address" maxlength="100" style="max-width:650px"><c:out value="${student.address}" /></textarea></div>
				<div class="col-sm-3"><p class="help-block">100文字以内で入力してください。</p></div>
			</div>
			<br>
			
			<div class="form-group">
				<label class="col-sm-2 control-label">メールアドレス:</label>
					<div class="col-sm-6"><input type="text" class="form-control" name="mailAddress" maxlength="50" value="${student.mailAddress}"></div>
				<div class="col-sm-4"><p class="help-block">50文字以内で入力してください。</p></div>
			</div>
			<br>
			
			<div class="form-group">
				<label class="col-sm-2 control-label">電話番号:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="phoneNumber" maxlength="12" value="${student.phoneNumber}"></div>
				<div class="col-sm-7"><p class="help-block">ハイフン無しで入力してください。</p></div>
			</div>
			
			<div class="col-sm-offset-2 col-sm-9 text-right"><br>
	     	    <button type="submit" class="btn btn-lg btn-default" name="edit" value="Edit">編集</button>
	     	</div>
	    </form>
      	</div> <!-- container -->
		
	</tiles:put>
</tiles:insert>