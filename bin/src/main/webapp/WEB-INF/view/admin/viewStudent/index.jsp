<tiles:insert template="/WEB-INF/view/common/admin/layout.jsp" flush="true">
	<tiles:put name="title" value="学生情報" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;color:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<br>
 	 	<h2 class="text-center page-header">全学生情報</h2>
		
		<div class="container">
		<form name="viewStudentActionForm" class="form-horizontal" action="/gakugeiJob/admin/viewStudent/" method="POST">
			<c:forEach items="${studentList}" var="student">
			<c:forEach items="${loginList}" var="login">
				<c:if test="${student.userId == login.userId}">
					<div class="well col-sm-offset-2 col-sm-7">
						　　　　　　学生ID　：　<c:out value="${student.studentId}" /><br>
						　　　　　　　氏名　：　<c:out value="${student.name}" /><br>
					　　　&nbsp;&nbsp;&nbsp;&nbsp;ユーザーID　：　<c:out value="${student.userId}" /><br>
					</div>
					<div class="col-sm-2">
						<input type="hidden" value="${student.userId}" name="userId" />
						<button class="btn btn-warning" type="submit" name="edit" value="Edit">
						<a href="/gakugeiJob/admin/editStudent/?userId=<c:out value="${student.userId}" />"  style="color:#FFF">パスワード変更</a>
						</button><br><br>
						<button class="btn btn-danger" type="submit" name="delete" value="Delete">学生削除</button>
					</div>
				</c:if>
			</c:forEach>
			</c:forEach>
		</form>
      	</div> <!-- container -->
	</tiles:put>
</tiles:insert>