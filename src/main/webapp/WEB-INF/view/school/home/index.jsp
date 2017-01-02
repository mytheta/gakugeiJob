<tiles:insert template="/WEB-INF/view/common/school/layout.jsp" flush="true">
	<tiles:put name="title" value="Home" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;coror:#000">
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	    <c:forEach items="${schoolList}" var="school">
 	 	<c:if test="${school.userId == userId}">
 	 		<h2 class="text-center">ようこそ、<c:out value="${school.name}" />　さん</h2><br>
 	 	</c:if>
 	 	</c:forEach>
 	 	<pre class="text-center">東京学芸大学A、E、J類情報科のための求人情報サイト「GakugeiJob！」</pre>
	</tiles:put>
</tiles:insert>