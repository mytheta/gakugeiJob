<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="utf-8">
         <meta http-equiv="X-UA-Compatible" content="IE=edge">
         <meta name="viewport" content="width=device-width, initial-scale=1">
         <title>エラー</title>
        <link href="/gakugeiJob/css/bootstrap.min.css" rel="stylesheet">
        <link href="/gakugeiJob/css/signin.css" rel="stylesheet">
    </head>
    <body>
        <div class="jumbotron text-center" style="background-color:#FFF;color:#000">
             <h1 class="text-center">GakugeiJob!</h1><br>
             <h2 class="text-center">Error!!<br><br>エラーです。前のページに戻ってください。</h2>
         </div>
         <div class="text-center" >
         <c:forEach items="${errorMessages}" var="errorMessage">
             <font size="5"><c:out value="${errorMessage}" /><br></font>
         </c:forEach>
         </div>
        <div class="footer"><p>&nbsp;&nbsp;&nbsp;&copy; by Group1</p></div>
    </body>
</html>