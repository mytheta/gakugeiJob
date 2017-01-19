<tiles:insert template="/WEB-INF/view/common/student/layout.jsp" flush="true">
	<tiles:put name="title" value="学校求人応募" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<h2 class="text-center page-header">学校求人応募</h2>
 	 	<form name="addSchoolOfferActionForm" class="form-horizontal" action="/gakugeiJob/student/addSchoolOffer/" method="POST">
 	 		<div class="form-group">
				<label class="col-sm-2 control-label">タイトル:</label>
					<div class="col-sm-7"><textarea class="form-control" name="title" maxlength="100" style="max-width:650px"></textarea></div>
				<div class="col-sm-3"><p class="help-block">100文字以内で入力してください。</p></div>
			</div>
			
			<div class="form-group">
				<label class="col-sm-2 control-label">内容:</label>
					<div class="col-sm-7"><textarea class="form-control" name="content" maxlength="400" style="max-width:650px"></textarea></div>
				<div class="col-sm-3"><p class="help-block">400文字以内で入力してください。</p></div>
			</div>
			
			<input type="hidden" name="schoolOfferId" value="${schoolOfferId}" />
				
			<div class="col-sm-offset-3 col-sm-9 text-right"><br>
	     	    <button type="submit" class="btn btn-lg btn-default" name="offer" value="Add">応募</button>
	     	</div>	
 	 	</form>
 	 	<br><br>
	</tiles:put>
</tiles:insert>