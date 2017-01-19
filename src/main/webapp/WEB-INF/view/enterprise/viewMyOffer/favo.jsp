<tiles:insert template="/WEB-INF/view/common/enterprise/layout.jsp" flush="true">
	<tiles:put name="title" value="学生情報" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;color:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<br>
 	 	<h2 class="text-center page-header">学生情報</h2>
		<div class="container">
			<c:forEach items="${enterpriseFavoList}" var="favo">
 	 	<c:forEach items="${studentList}" var="student">
 	 	<c:if test="${favo.studentId == student.studentId && favo.jobOfferId == jobOfferId}">
					<div class="well col-sm-offset-2 col-sm-7">
                        氏名：　<c:out value="${student.name}" /><br>
                       <c:choose>
			<c:when test="${student.sex == 0}" >
						性別：　男性<br>
			</c:when>
			<c:when test="${student.sex == 1}" >
						性別：　女性<br>
			</c:when>
			<c:otherwise>
			            性別：　<br>
			</c:otherwise>
			</c:choose> 
						誕生日      ：　<c:out value="${birthday}" /><br>
						メールアドレス：　<c:out value="${student.mailAddress}" /><br>
					</div>
					
				</c:if>
			</c:forEach>
			</c:forEach>
      	</div> <!-- container -->
	</tiles:put>
</tiles:insert>