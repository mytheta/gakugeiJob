<tiles:insert template="/WEB-INF/view/common/school/layout.jsp" flush="true">
	<tiles:put name="title" value="学校求人情報" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<h2 class="text-center page-header">学校求人</h2>

 	<c:forEach items="${schoolOfferList}" var="schoolOffer">
 	<c:forEach items="${schoolList}" var="school">
 	 	<c:if test="${(schoolOffer.schoolOfferId == schoolOfferId) && (school.schoolId == schoolOffer.schoolId)}">
		<h3 class="text-center page-header">学校求人情報</h3>
 	 	<div class="container">
 	 		<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;学校名:</p></font>
				<pre><c:out value="${schoolOffer.description}" /></pre>
			</div>

			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;学校名:</p></font>
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
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;経験・資格:</p></font>
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

 	 	</c:if>
 	</c:forEach>
 	</c:forEach>
 	</tiles:put>
</tiles:insert>