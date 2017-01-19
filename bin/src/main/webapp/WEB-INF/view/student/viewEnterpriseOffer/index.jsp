<tiles:insert template="/WEB-INF/view/common/student/layout.jsp" flush="true">
	<tiles:put name="title" value="企業求人応募" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<h2 class="text-center page-header">企業求人応募情報</h2>
 	 	<c:forEach items="${enterpriseAplicantList}" var="enterpriseAplicant">
 	 	<c:forEach items="${enterpriseList}" var="enterprise">
 	 	<c:forEach items="${enterpriseOfferList}" var="enterpriseOffer">
 	 	<c:if test="${(enterpriseAplicant.studentId == studentId) && (enterprise.enterpriseId == enterpriseOffer.enterpriseId) && (enterpriseOffer.jobOfferId == enterpriseAplicant.jobOfferId)}">
 	 	<div class="panel panel-default">
 	    	<div class="panel-heading">
 	    		企業名: <c:out value="${enterprise.name}" /><br><br>
 	    		勤務先名: <c:out value="${enterprise.name}" /><br><br>
 	    		勤務地住所: <c:out value="${enterpriseOffer.address}" />
 	    	</div>
  			<div class="panel-body"><c:out value="${enterpriseOffer.description}" /></div>
   			<div class="panel-footer text-right text-muted">キニナル〜数: <c:out value="${enterpriseOffer.favo}" />&nbsp;&nbsp;&nbsp;
  			登録日: <c:out value="${enterpriseOffer.registrationDate}" /></div>
		</div>
		
		<div class="container">
		<div class="col-sm-12">
				<font size="4"><p class="text-left">&nbsp;&nbsp;タイトル</p></font>
				<pre><c:out value="${enterpriseAplicant.title}" /></pre>
		</div>
		<div class="col-sm-12">
				<font size="4"><p class="text-left">&nbsp;&nbsp;送信内容</p></font>
				<pre><c:out value="${enterpriseAplicant.content}" /></pre>
		</div>
		</div><br>
		
		<div class="text-right">
		<form name="addEnterpriseOfferActionForm" class="form-horizontal" action="/gakugeiJob/student/addEnterpriseOffer/" method="POST" style="display:inline;">
		<input type="hidden" value="${enterpriseOffer.jobOfferId}" name="jobOfferId"/>
 		<button class="btn btn-lg btn-success" type="submit" name="view" value="View">詳細</button>&nbsp;&nbsp;
		</form>
		
		<form name="addEnterpriseOfferActionForm" class="form-horizontal" action="/gakugeiJob/student/viewEnterpriseOffer/" method="POST" style="display:inline;">
		<button class="btn btn-lg btn-danger" type="submit" name="delete" value="Delete">応募取り消し</button>&nbsp;&nbsp;
		<input type="hidden" value="${enterpriseOffer.jobOfferId}" name="jobOfferId"/>
		</form>
		</div>
		<br>	
		</c:if>
		</c:forEach>
		</c:forEach>
		</c:forEach>
	</tiles:put>
</tiles:insert>