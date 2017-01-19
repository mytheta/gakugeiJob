<tiles:insert template="/WEB-INF/view/common/enterprise/layout.jsp" flush="true">
	<tiles:put name="title" value="自社求人" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<h2 class="text-center page-header">自社求人応募情報</h2>
 	 	<c:forEach items="${enterpriseList}" var="enterprise">
 	 	<c:forEach items="${enterpriseOfferList}" var="enterpriseOffer">
 	 	<c:if test="${ (enterprise.enterpriseId == enterpriseOffer.enterpriseId) && (enterprise.enterpriseId == enterpriseId)}">
 	 	<div class="panel panel-default">
 	    	<div class="panel-heading">
 	    		企業名: <c:out value="${enterprise.name}" /><br><br>
 	    		勤務先名: <c:out value="${enterpriseOffer.officeName}" /><br><br>
 	    		勤務地住所: <c:out value="${enterpriseOffer.address}" />
 	    	</div>
 	    	
  			<div class="panel-body" style="word-break: break-word"><c:out value="${enterpriseOffer.description}" /></div>
   			<div class="panel-footer text-right text-muted">キニナル〜数: <c:out value="${enterpriseOffer.favo}" />&nbsp;&nbsp;&nbsp;
  			登録日: <c:out value="${enterpriseOffer.registrationDate}" /></div>
		</div>
		
		<div class="text-right">
			<form name="viewMyOfferActionForm" class="form-horizontal" action="/gakugeiJob/enterprise/viewMyOffer/" method="POST">
				<input type="hidden" value="${enterpriseOffer.jobOfferId}" name="jobOfferId"/>
				<button class="btn btn-lg btn-success" type="submit" name="view" value="View">詳細</button>&nbsp;&nbsp;
				<button class="btn btn-lg btn-primary" type="submit" name="offer" value="Offer">応募者をみる</button>&nbsp;&nbsp;
				<button class="btn btn-lg btn-info" type="submit" name="favo" value="favo">キニナルをみる</button>&nbsp;&nbsp;
				<button class="btn btn-lg btn-warning" type="submit" name="delete" value="Delete">削除</button>
				
			</form>
		</div><br>
		
		</c:if>
		</c:forEach>
		</c:forEach>
	</tiles:put>
</tiles:insert>