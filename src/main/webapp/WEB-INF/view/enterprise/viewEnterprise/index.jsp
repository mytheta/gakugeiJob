<tiles:insert template="/WEB-INF/view/common/enterprise/layout.jsp" flush="true">
	<tiles:put name="title" value="MyPage" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
		<h2 class="text-center page-header">プロフィール</h2>
		<div class="container">
		
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;ユーザーID</p></font>
				<pre><c:out value="${enterprise.userID}" /></pre>
			</div>
			
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;企業名</p></font>
				<pre><c:out value="${enterprise.name}" /></pre>
			</div>
			
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;創業日</p></font>
				<pre><c:out value="${enterprise.foundingDate}" /></pre>
			</div>
			
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;創設者の氏名</p></font>
				<pre><c:out value="${enterprise.founderName}" /></pre>
			</div>
			
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;本社の住所</p></font>
				<pre><c:out value="${enterprise.address}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;資本金</p></font>
				<pre><c:out value="${enterprise.capital}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;代表取締役氏名</p></font>
				<pre><c:out value="${enterprise.presidentName}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;従業員数</p></font>
				<pre><c:out value="${enterprise.NumOfEmployees}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;営業種目</p></font>
				<pre><c:out value="${enterprise.business}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;電話番号</p></font>
				<pre><c:out value="${enterprise.phoneNumber}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;会社URL</p></font>
				<pre><c:out value="${enterprise.url}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;ひとこと</p></font>
				<pre><c:out value="${enterprise.oneThing}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
				<font size="4"><p class="text-left">&nbsp;&nbsp;メールアドレス</p></font>
				<pre><c:out value="${enterprise.mailAddress}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-9 text-right"><br>
	     	    	<a href="/gakugeiJob/enterprise/editEnterprise/"><button class="btn btn-lg btn-default">編集</button></a>
	     	 </div>
      	</div> <!-- container -->
		
	</tiles:put>
</tiles:insert>