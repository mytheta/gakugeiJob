<tiles:insert template="/WEB-INF/view/common/enterprise/layout.jsp" flush="true">
	<tiles:put name="title" value="企業求人情報" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<h2 class="text-center page-header">企業求人</h2>
 	 	
 	<c:forEach items="${enterpriseOfferList}" var="enterpriseOffer">
 	<c:forEach items="${enterpriseList}" var="enterprise">		
 	 	<c:if test="${(enterpriseOffer.jobOfferId == jobOfferId) && (enterprise.enterpriseId == enterpriseOffer.enterpriseId)}">
 	 	<h3 class="text-center page-header">企業情報</h3>	
 	 	<div class="container">
 	 		<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;企業名:</p></font>
				<pre><c:out value="${enterprise.name}" /></pre>
			</div>	
 	 		
 	 		<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;創立日:</p></font>
				<pre><c:out value="${enterprise.foundingDate}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;創設者氏名:</p></font>
				<pre><c:out value="${enterprise.founderName}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;企業住所:</p></font>
				<pre><c:out value="${enterprise.address}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;資本金:</p></font>
				<pre><c:out value="${enterprise.capital}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;代表取締役者氏名:</p></font>
				<pre><c:out value="${enterprise.presidentName}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;従業員者数:</p></font>
				<pre><c:out value="${enterprise.numOfEmployees}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;営業種目:</p></font>
				<pre><c:out value="${enterprise.business}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;企業URL:</p></font>
				<pre><c:out value="${enterprise.url}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;電話番号:</p></font>
				<pre><c:out value="${enterprise.phoneNumber}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;メールアドレス:</p></font>
				<pre><c:out value="${enterprise.mailAddress}" /></pre>
			</div>
			
			<div class="col-sm-offset-2 col-sm-8 col-sm-offset-2">
 	 		<font size="4"><p class="text-left">&nbsp;&nbsp;ひとこと:</p></font>
				<pre><c:out value="${enterprise.oneThing}" /></pre>
			</div>
 	 	</div>
 	 	<h3 class="text-center page-header">企業求人情報</h3>
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