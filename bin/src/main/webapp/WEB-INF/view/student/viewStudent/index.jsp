<tiles:insert template="/WEB-INF/view/common/student/layout.jsp" flush="true">
	<tiles:put name="title" value="MyPage" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
		<h2 class="text-center page-header">プロフィール</h2>
		<div class="container">
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;ユーザーID</p></font>
				<pre><c:out value="${student.userID}" /></pre>
			</div>
		
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;氏名</p></font>
				<pre><c:out value="${student.name}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;誕生日</p></font>
				<pre><c:out value="${birthday}" /></pre>
			</div>
			
			<c:choose>
			<c:when test="${student.sex == 0}" >
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;性別</p>
				<pre>男性</pre></font>
			</div>
			</c:when>
			<c:when test="${student.sex == 1}" >
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;性別</p>
				<pre>女性</pre></font>
			</div>
			</c:when>
			<c:otherwise>
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;性別</p>
				<pre></pre></font>
			</div>
			</c:otherwise>
			</c:choose>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;住所</p></font>
				<pre><c:out value="${student.address}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;メールアドレス</p></font>
				<pre><c:out value="${student.mailAddress}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;電話番号</p></font>
				<pre><c:out value="${student.phoneNumber}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-9 text-right"><br>
	     	    	<a href="/gakugeiJob/student/editStudent/"><button class="btn btn-lg btn-default">編集</button></a>
	     	    </div>
      	</div> <!-- container -->
		
	</tiles:put>
</tiles:insert>