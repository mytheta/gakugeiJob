<tiles:insert template="/WEB-INF/view/common/admin/layout.jsp" flush="true">
	<tiles:put name="title" value="学生情報" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;color:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<br>
 	 	<h2 class="text-center page-header">全学生情報</h2>
		
		<div class="container">
			<c:forEach items="${studentList}" var="student">
			<c:forEach items="${loginList}" var="login">
				<c:if test="${student.userId == login.userId}">
					<div class="well col-sm-offset-2 col-sm-7">
						　　　　　　学生ID　：　<c:out value="${student.studentId}" /><br>
						　　　　　　&nbsp;&nbsp;&nbsp;氏名　：　<c:out value="${student.name}" /><br>
					　　　&nbsp;&nbsp;&nbsp;&nbsp;ユーザーID　：　<c:out value="${student.userId}" /><br>
					</div>
					<div class="col-sm-2">
						<form name="viewEnterpriseActionForm" class="form-horizontal" action="/gakugeiJob/admin/editStudent/" method="POST">
							<input type="hidden" value="${student.userId}" name="userId" />
						<button class="btn btn-warning" type="submit" name="index" value="Edit">パスワード変更</button>
						<br><br>
						</form>
						
						<form name="viewEnterpriseActionForm" class="form-horizontal" action="/gakugeiJob/admin/viewStudent/" method="POST">
							<input type="hidden" value="${student.userId}" name="userId" />
							<button class="btn btn-danger" type="submit" name="delete" value="Delete">学生削除</button>
						</form>
					</div>
				</c:if>
			</c:forEach>
			</c:forEach>
      	</div> <!-- container -->
	</tiles:put>
</tiles:insert>