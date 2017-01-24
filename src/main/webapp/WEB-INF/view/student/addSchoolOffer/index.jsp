<tiles:insert template="/WEB-INF/view/common/student/layout.jsp" flush="true">
	<tiles:put name="title" value="学校求人情報" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<h2 class="text-center page-header">学校求人情報</h2>
  		<c:forEach items="${schoolOfferList}" var="schoolOffer">
  		<c:forEach items="${schoolList}" var="school">
  		<c:if test="${schoolOffer.schoolId == school.schoolId}">
 	 	<div class="panel panel-default">
 	    	<div class="panel-heading">
 	    		<pre style="background-color:#f5f5f5; border:0;">勤務学校名: <c:out value="${school.name}" /></pre>
 	    		<pre style="background-color:#f5f5f5; border:0;">勤務地住所: <c:out value="${schoolOffer.address}" /></pre>
 	    	</div>
  			<div class="panel-body"  style="word-break: break-word"><pre style="background-color:#FFF; border:0;"><c:out value="${schoolOffer.description}" /></pre></div>
   			<div class="panel-footer text-right text-muted">キニナル〜数: <c:out value="${schoolOffer.favo}" />&nbsp;&nbsp;&nbsp;
  			登録日: <c:out value="${schoolOffer.registrationDate}" /></div>
		</div>
		<div class="text-right">
			<form name="addSchoolOfferActionForm" class="form-horizontal" action="/gakugeiJob/student/addSchoolOffer/" method="POST">
				<input type="hidden" value="${schoolOffer.schoolOfferId}" name="schoolOfferId"/>
				
				<c:set var="checkAplicant" value="true" />
				<c:set var="checkFavo" value="true" />
				<c:forEach items="${schoolFavoList}" var="schoolFavo">
					<c:if test="${schoolFavo.schoolOfferId == schoolOffer.schoolOfferId && schoolFavo.studentId == studentId}">
						<c:set var="checkFavo" value="false" />					
					</c:if>
				</c:forEach>
				<c:forEach items="${schoolAplicantList}" var="schoolAplicant">
					<c:if test="${schoolAplicant.schoolOfferId == schoolOffer.schoolOfferId && schoolAplicant.studentId == studentId}">
						<c:set var="checkAplicant" value="false" />
					</c:if>
				</c:forEach>
				
				<button class="btn btn-lg btn-success" type="submit" name="view" value="View">詳細</button>&nbsp;&nbsp;
				
				<c:if test="${checkFavo == false}">
				<button class="btn btn-default" disabled="disabled" >キニナル〜済み</button>&nbsp;&nbsp;
				</c:if>
				<c:if test="${checkFavo == true}">
				<button class="btn btn-lg btn-warning" type="submit" name="favo" value="Favo">キニナル〜</button>&nbsp;&nbsp;
				</c:if>
				
				<c:if test="${checkAplicant == false}">
				<button class="btn btn-default" disabled="disabled">応募済み</button>
				</c:if>
				<c:if test="${checkAplicant == true}">
				<button class="btn btn-lg btn-primary" type="submit" name="add" value="Add">応募</button>
				</c:if>
			</form>
		</div><br>
		</c:if>
		</c:forEach>		
		</c:forEach>
	</tiles:put>
</tiles:insert>