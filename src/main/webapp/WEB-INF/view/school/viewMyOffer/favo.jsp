<tiles:insert template="/WEB-INF/view/common/school/layout.jsp" flush="true">
	<tiles:put name="title" value="学生情報" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;color:#000">
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<br>
 	 	<h2 class="text-center page-header">学生情報</h2>

		<div class="container">
			<c:forEach items="${schoolFavoList}" var="favo">
 	 		<c:forEach items="${studentList}" var="student">
 	 		<c:if test="${favo.studentId == student.studentId && favo.schoolOfferId == schoolOfferId}">
					<div class="well col-sm-offset-2 col-sm-7">
						　　　　　　　氏名：　<c:out value="${student.name}" /><br>
						<c:if test="${student.sex==0}">
						　　　　　　　性別：　男<br>
						</c:if>
						<c:if test="${student.sex==1}">
						　　　　　　　性別：　女<br>
						</c:if>
						　　　　　　誕生日：　<c:out value="${student.birthday}" /><br>
						　　メールアドレス：　<c:out value="${student.mailAddress}" /><br>
					</div>
			</c:if>
			</c:forEach>
			</c:forEach>
      	</div> <!-- container -->
	</tiles:put>
</tiles:insert>