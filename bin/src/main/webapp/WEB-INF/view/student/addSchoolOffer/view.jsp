<tiles:insert template="/WEB-INF/view/common/student/layout.jsp" flush="true">
	<tiles:put name="title" value="学校求人情報" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<h2 class="text-center page-header">学校求人</h2>
 	 	
 	<c:forEach items="${schoolOfferList}" var="schoolOffer">
 	<c:forEach items="${schoolList}" var="school">		
 	 	<c:if test="${(schoolOffer.schoolOfferId == schoolOfferId) && (school.schoolId == schoolOffer.schoolId)}">
 	 	<h3 class="text-center page-header">学校情報</h3>	
 	 	<div class="container">
 	 		<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;学校名:</p></font>
				<pre><c:out value="${school.name}" /></pre>
			</div>	
 	 		
 	 		<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;学校種:</p></font>
				<pre><c:out value="${school.kinds}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;電話番号:</p></font>
				<pre><c:out value="${school.phoneNumber}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;メールアドレス:</p></font>
				<pre><c:out value="${school.mailAddress}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;学校URL:</p></font>
				<pre><c:out value="${school.url}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;ひとこと:</p></font>
				<pre><c:out value="${school.oneThing}" /></pre>
			</div>
 	 	</div>
 	 	<h3 class="text-center page-header">学校求人情報</h3>
 	 	<div class="container">	
 	 		<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;仕事内容:</p></font>
				<pre><c:out value="${schoolOffer.description}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;給与情報:</p></font>
				<pre><c:out value="${schoolOffer.salary}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;勤務形態:</p></font>
				<pre><c:out value="${schoolOffer.workSchedule}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;勤務期間:</p></font>
				<pre><c:out value="${schoolOffer.period}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;勤務地:</p></font>
				<pre><c:out value="${schoolOffer.address}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;最寄駅:</p></font>
				<pre><c:out value="${schoolOffer.station}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;応募資格</p></font>
				<pre><c:out value="${schoolOffer.qualification}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;待遇・福利厚生:</p></font>
				<pre><c:out value="${schoolOffer.welfare}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;ひとこと:</p></font>
				<pre><c:out value="${schoolOffer.oneThing}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;キニナル〜数:</p></font>
				<pre><c:out value="${schoolOffer.favo}" /></pre>
			</div>
 	 	</div>
 	 	<br>	
 	 	<div class="text-right">
			<form name="addSchoolOfferActionForm" class="form-horizontal" action="/gakugeiJob/student/addSchoolOffer/" method="POST">
				<input type="hidden" value="${schoolOfferId}" name="schoolOfferId"/>
				
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
		</div>
 	 	</c:if>
 	</c:forEach>
 	</c:forEach>
 	</tiles:put>
</tiles:insert>
 	 