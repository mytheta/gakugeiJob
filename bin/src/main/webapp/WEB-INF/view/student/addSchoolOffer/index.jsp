<tiles:insert template="/WEB-INF/view/common/student/layout.jsp" flush="true">
	<tiles:put name="title" value="Home" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<h2 class="text-center page-header">学校求人情報</h2>
  
 	 	<div class="panel panel-default">
 	    	<div class="panel-heading">
 	    		勤務先名:<br><br>
 	    		勤務地:
 	    	</div>
  			<div class="panel-body">仕事内容</div>
  			<div class="panel-footer text-right text-muted">登録日:</div>
		</div>
	</tiles:put>
</tiles:insert>