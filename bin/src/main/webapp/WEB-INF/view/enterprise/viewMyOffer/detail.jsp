<tiles:insert template="/WEB-INF/view/common/enterprise/layout.jsp" flush="true">
	<tiles:put name="title" value="企業求人情報" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<h2 class="text-center page-header">企業求人情報</h2>
 	 	
 	<c:forEach items="${enterpriseOfferList}" var="enterpriseOffer">
 	<c:forEach items="${enterpriseList}" var="enterprise">		
 	 	<c:if test="${(enterpriseOffer.jobOfferId == jobOfferId) && (enterprise.enterpriseId == enterpriseOffer.enterpriseId)}">
 	 	<div class="container">	
 	 		<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;勤務先名:</p></font>
				<pre><c:out value="${enterpriseOffer.officeName}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;仕事内容:</p></font>
				<pre><c:out value="${enterpriseOffer.description}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;給与情報:</p></font>
				<pre><c:out value="${enterpriseOffer.salary}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;勤務先住所:</p></font>
				<pre><c:out value="${enterpriseOffer.address}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;最寄駅:</p></font>
				<pre><c:out value="${enterpriseOffer.station}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;勤務地:</p></font>
				<pre><c:out value="${enterpriseOffer.address}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;勤務期間:</p></font>
				<pre><c:out value="${enterpriseOffer.period}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;勤務時間:</p></font>
				<pre><c:out value="${enterpriseOffer.workingTime}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;休日・休暇:</p></font>
				<pre><c:out value="${enterpriseOffer.holiday}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;待遇・福利厚生:</p></font>
				<pre><c:out value="${enterpriseOffer.welfare}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;ひとこと:</p></font>
				<pre><c:out value="${enterpriseOffer.oneThing}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;キニナル〜数:</p></font>
				<pre><c:out value="${enterpriseOffer.favo}" /></pre>
			</div>
 	 	</div>
 	 	<br>	
		
 	 	</c:if>
 	</c:forEach>
 	</c:forEach>
 	</tiles:put>
</tiles:insert>