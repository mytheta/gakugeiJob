<tiles:insert template="/WEB-INF/view/common/student/layout.jsp" flush="true">
	<tiles:put name="title" value="学校求人応募" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<h2 class="text-center page-header">学校求人応募情報</h2>
 	 	<c:forEach items="${schoolAplicantList}" var="schoolAplicant">
 	 	<c:forEach items="${schoolList}" var="school">
 	 	<c:forEach items="${schoolOfferList}" var="schoolOffer">
 	 	<c:if test="${(schoolAplicant.studentId == studentId) && (school.schoolId == schoolOffer.schoolId) && (schoolOffer.schoolOfferId == schoolAplicant.schoolOfferId)}">
 	 	<div class="panel panel-default">
 	    	<div class="panel-heading">
 	    		勤務学校名: <c:out value="${school.name}" /><br><br>
 	    		勤務地住所: <c:out value="${schoolOffer.address}" />
 	    	</div>
  			<div class="panel-body"><c:out value="${schoolOffer.description}" /></div>
   			<div class="panel-footer text-right text-muted">キニナル〜数: <c:out value="${schoolOffer.favo}" />&nbsp;&nbsp;&nbsp;
  			登録日: <c:out value="${schoolOffer.registrationDate}" /></div>
		</div>
		
		<div class="container">
		<div class="col-sm-12">
				<font size="4"><p class="text-left">&nbsp;&nbsp;タイトル</p></font>
				<pre><c:out value="${schoolAplicant.title}" /></pre>
		</div>
		<div class="col-sm-12">
				<font size="4"><p class="text-left">&nbsp;&nbsp;送信内容</p></font>
				<pre><c:out value="${schoolAplicant.content}" /></pre>
		</div>
		</div><br>
		
		<div class="text-right">
		<form name="addSchoolOfferActionForm" class="form-horizontal" action="/gakugeiJob/student/addSchoolOffer/" method="POST" style="display:inline;">
		<input type="hidden" value="${schoolOffer.schoolOfferId}" name="schoolOfferId"/>
 		<button class="btn btn-lg btn-success" type="submit" name="view" value="View">詳細</button>&nbsp;&nbsp;
		</form>
		
		<form name="addSchoolOfferActionForm" class="form-horizontal" action="/gakugeiJob/student/viewSchoolOffer/" method="POST" style="display:inline;">
		<button class="btn btn-lg btn-danger" type="submit" name="delete" value="Delete">応募取り消し</button>&nbsp;&nbsp;
		<input type="hidden" value="${schoolOffer.schoolOfferId}" name="schoolOfferId"/>
		</form>
		</div>
		<br><br>	
		</c:if>
		</c:forEach>
		</c:forEach>
		</c:forEach>
	</tiles:put>
</tiles:insert>