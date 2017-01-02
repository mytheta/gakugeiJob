<tiles:insert template="/WEB-INF/view/common/admin/layout.jsp" flush="true">
	<tiles:put name="title" value="企業情報" />
	<tiles:put name="content" type="string">
		<div class="jumbotron text-center" style="background-color:#FFE;color:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<br>
 	 	<h2 class="text-center page-header">全企業情報</h2>
		
		<div class="container">
		<form name="viewEnterpriseActionForm" class="form-horizontal" action="/gakugeiJob/admin/viewEnterprise/" method="POST">
			<c:forEach items="${enterpriseList}" var="enterprise">
			<c:forEach items="${loginList}" var="login">
				<c:if test="${enterprise.userId == login.userId}">
					<div class="well col-sm-offset-2 col-sm-7">
						　　　　　　企業ID　：　<c:out value="${enterprise.enterpriseId}" /><br>
						　　　　　　企業名　：　<c:out value="${enterprise.name}" /><br>
					　　　&nbsp;&nbsp;&nbsp;&nbsp;ユーザーID　：　<c:out value="${enterprise.userId}" /><br>
					</div>
					<div class="col-sm-2">
						<input type="hidden" value="${enterprise.userId}" name="userId" />
						<button class="btn btn-warning" type="submit" name="edit" value="Edit">
						<a href="/gakugeiJob/admin/editEnterprise/?userId=<c:out value="${enterprise.userId}" />"  style="color:#FFF">パスワード変更</a>
						</button><br><br>
						<button class="btn btn-danger" type="submit" name="delete" value="Delete">企業削除</button>
					</div>
				</c:if>
			</c:forEach>
			</c:forEach>
		</form>
      	</div> <!-- container -->
	</tiles:put>
</tiles:insert>