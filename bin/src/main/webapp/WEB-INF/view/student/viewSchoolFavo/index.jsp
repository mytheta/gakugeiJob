<tiles:insert template="/WEB-INF/view/common/student/layout.jsp" flush="true">
	<tiles:put name="title" value="学校求人キニナル〜" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<h2 class="text-center page-header">学校求人キニナル〜</h2>
 	 	<c:forEach items="${schoolFavoList}" var="schoolFavo">
 	 	<c:forEach items="${schoolList}" var="school">
 	 	<c:forEach items="${schoolOfferList}" var="schoolOffer">
 	 	<c:if test="${(schoolFavo.studentId == studentId) && (school.schoolId == schoolOffer.schoolId) && (schoolOffer.schoolOfferId == schoolFavo.schoolOfferId)}">
 	 	<div class="panel panel-default">
 	    	<div class="panel-heading">
 	    		勤務学校名: <c:out value="${school.name}" /><br><br>
 	    		勤務地住所: <c:out value="${schoolOffer.address}" />
 	    	</div>
  			<div class="panel-body"><c:out value="${schoolOffer.description}" /></div>
   			<div class="panel-footer text-right text-muted">キニナル〜数: <c:out value="${schoolOffer.favo}" />&nbsp;&nbsp;&nbsp;
  			登録日: <c:out value="${schoolOffer.registrationDate}" /></div>
		</div>
		
		<div class="text-right">
		<form name="addSchoolOfferActionForm" class="form-horizontal" action="/gakugeiJob/student/addSchoolOffer/" method="POST" style="display:inline;">
		<input type="hidden" value="${schoolOffer.schoolOfferId}" name="schoolOfferId"/>
 		<button class="btn btn-lg btn-success" type="submit" name="view" value="View">詳細</button>&nbsp;&nbsp;
		</form>
		
		<form name="addSchoolOfferActionForm" class="form-horizontal" action="/gakugeiJob/student/viewSchoolFavo/" method="POST" style="display:inline;">
		<button class="btn btn-lg btn-danger" type="submit" name="delete" value="Favo">キニナル削除</button>&nbsp;&nbsp;
		<input type="hidden" value="${schoolOffer.schoolOfferId}" name="schoolOfferId"/>
		</form>
		</div>
		<br>	
		</c:if>
		</c:forEach>
		</c:forEach>
		</c:forEach>
	</tiles:put>
</tiles:insert>