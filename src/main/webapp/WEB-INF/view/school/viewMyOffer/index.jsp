<tiles:insert template="/WEB-INF/view/common/school/layout.jsp" flush="true">
	<tiles:put name="title" value="自校求人" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<h2 class="text-center page-header">自校求人応募情報</h2>
 	 	<c:forEach items="${schoolList}" var="school">
 	 	<c:forEach items="${schoolOfferList}" var="schoolOffer">
 	 	<c:if test="${ (school.schoolId == schoolOffer.schoolId) && (school.schoolId == schoolId)}">
 	 	<div class="panel panel-default">
 	    	<div class="panel-heading">
 	    		学校名: <c:out value="${school.name}" /><br><br>
 	    		勤務地住所: <c:out value="${schoolOffer.address}" />
 	    	</div>

 	    	<div class="panel-body" style="word-break: break-word"><c:out value="${schoolOffer.description}" /></div>
   			<div class="panel-footer text-right text-muted">キニナル〜数: <c:out value="${schoolOffer.favo}" />&nbsp;&nbsp;&nbsp;
  			登録日: <c:out value="${schoolOffer.registrationDate}" /></div>
		</div>

		<div class= "text-right">
			<form name="viewMyOfferActionForm" class="form-horizontal" action="/gakugeiJob/school/viewMyOffer/" method="POST"  style="display:inline;">
				<input type="hidden" value="${schoolOffer.schoolOfferId}" name="schoolOfferId"/>
				<button class="btn btn-lg btn-success" type="submit" name="view" value="View">詳細</button>&nbsp;&nbsp;
				<button class="btn btn-lg btn-primary" type="submit" name="offer" value="Offer">応募者をみる</button>&nbsp;&nbsp;
				<button class="btn btn-lg btn-warning" type="submit" name="favo" value="Favo">キニナルをみる</button>&nbsp;&nbsp;
			</form>
			<form name="deleteOfferActionForm" class="form-horizontal" action="/gakugeiJob/school/deleteOffer/" method="POST" style="display:inline;">
				<input type="hidden" value="${schoolOffer.schoolOfferId}" name="schoolOfferId"/>
				<button class="btn btn-lg btn-danger" type="submit" name="delete" value="Delete">削除</button>&nbsp;&nbsp;
			</form>
		</div><br>

		</c:if>
		</c:forEach>
		</c:forEach>
	</tiles:put>
</tiles:insert>