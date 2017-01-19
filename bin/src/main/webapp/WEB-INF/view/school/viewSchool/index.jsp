<tiles:insert template="/WEB-INF/view/common/school/layout.jsp" flush="true">
	<tiles:put name="title" value="MyPage" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
		<h2 class="text-center page-header">プロフィール</h2>
		<div class="container">
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;ユーザーID</p></font>
				<pre><c:out value="${school.userID}" /></pre>
			</div>

			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;学校名</p></font>
				<pre><c:out value="${school.name}" /></pre>
			</div>

			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;校種</p></font>
				<pre><c:out value="${school.kinds}" /></pre>
			</div>

			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;電話番号</p></font>
				<pre><c:out value="${school.phoneNumber}" /></pre>
			</div>

			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;URL</p></font>
				<pre><c:out value="${school.url}" /></pre>
			</div>

			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;その他</p></font>
				<pre><c:out value="${school.oneThing}" /></pre>
			</div>

			<div class="col-sm-offset-2 col-sm-9 text-right">
				<a href="/gakugeiJob/school/editSchool/"><button class="btn btn-lg btn-success">編集</button></a>
				<a href="/gakugeiJob/school/deleteSchool/"><button class="btn btn-lg btn-warning">退会</button></a>
			</div>
		</div> <!-- container -->

	</tiles:put>
</tiles:insert>