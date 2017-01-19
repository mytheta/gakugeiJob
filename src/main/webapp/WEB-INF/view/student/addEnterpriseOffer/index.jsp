<tiles:insert template="/WEB-INF/view/common/student/layout.jsp" flush="true">
	<tiles:put name="title" value="Home" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<h2 class="text-center page-header">企業求人情報</h2>
  		<c:forEach items="${enterpriseOfferList}" var="enterpriseOffer">
  		<c:forEach items="${enterpriseList}" var="enterprise">
  		<c:if test="${enterpriseOffer.enterpriseId == enterprise.enterpriseId}">
 	 	<div class="panel panel-default">
 	    	<div class="panel-heading">
 	    		企業名: <c:out value="${enterprise.name}" /><br><br>
 	    		勤務先名: <c:out value="${enterpriseOffer.officeName}" /><br><br>
 	    		勤務地住所: <c:out value="${enterpriseOffer.address}" />
 	    	</div>
  			<div class="panel-body"  style="word-break: break-word"><c:out value="${enterpriseOffer.description}" /></div>
   			<div class="panel-footer text-right text-muted">キニナル〜数: <c:out value="${enterpriseOffer.favo}" />&nbsp;&nbsp;&nbsp;
  			登録日: <c:out value="${enterpriseOffer.registrationDate}" /></div>
		</div>
		<div class="text-right">
			<form name="addSchoolOfferActionForm" class="form-horizontal" action="/gakugeiJob/student/addEnterpriseOffer/" method="POST">
				<input type="hidden" value="${enterpriseOffer.jobOfferId}" name="jobOfferId"/>
				
				<c:set var="checkAplicant" value="true" />
				<c:set var="checkFavo" value="true" />
				<c:forEach items="${enterpriseFavoList}" var="enterpriseFavo">
					<c:if test="${enterpriseFavo.jobOfferId == enterpriseOffer.jobOfferId && enterpriseFavo.studentId == studentId}">
						<c:set var="checkFavo" value="false" />					
					</c:if>
				</c:forEach>
				<c:forEach items="${enterpriseAplicantList}" var="enterpriseAplicant">
					<c:if test="${enterpriseAplicant.jobOfferId == enterpriseOffer.jobOfferId && enterpriseAplicant.studentId == studentId}">
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