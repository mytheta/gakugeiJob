<tiles:insert template="/WEB-INF/view/common/enterprise/layout.jsp" flush="true">
	<tiles:put name="title" value="MyPage" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<center>
		<h2 class="text-center page-header">退会確認</h2>
 
		<div class="container">
			<div class="col-sm-offset-2 col-sm-8">
				<font size="4">&nbsp;&nbsp;"退会"を押すと学校を削除してログイン画面に戻ります。</font>
			</div>
			<form name="deleteEnterpriseActionForm" class="form-horizontal" action="/gakugeiJob/enterprise/deleteEnterprise/" method="POST">
				<div class = "col-sm-offset-5 col-sm-2"><br>
	     		    <button type="submit" class="btn btn-lg btn-warning center-block" name="delete" value="Delete">退会</button>
	     		</div>
	    	</form>
      	</div> <!-- container -->
 		</center>
	</tiles:put>
</tiles:insert>