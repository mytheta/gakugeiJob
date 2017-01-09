<!DOCTYPE html>
<html lang="ja">
	<head>
		<meta charset="utf-8">
 	 	<meta http-equiv="X-UA-Compatible" content="IE=edge">
 	 	<meta name="viewport" content="width=device-width, initial-scale=1">
 	 	<title>GakugeiJob</title>
 		<link href="/gakugeiJob/css/bootstrap.min.css" rel="stylesheet">
 		<link href="/gakugeiJob/css/signin.css" rel="stylesheet">
	</head>
	<body>
		<div class="jumbotron text-center" style="background-color:#FFF;color:#000">
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<div class="container">

        	<form name="indexActionForm" class="form-signin" action="/gakugeiJob/" method="POST">
	        	<h2 class="form-signin-heading text-center">Please sign in</h2>
	       		<input type="text" name="userId" class="form-control" placeholder="User Id" maxlength="20" required autofocus>
	      	    <input type="password" name="userPass" class="form-control" placeholder="Password" maxlength="20" required>
	     	    <button class="btn btn-lg btn-primary btn-block" type="submit" name="login" value="Login">Sign in</button>
      		</form>
		</div> <!-- container -->
		<br><br>
		<div class="container" style="background-color:#FFF">
			<h1 class="text-center">新規登録はこちらから！</h1><br>

			<a href="/gakugeiJob/addEnterprise/" style="color:#FFF"><button type="button" class="btn btn-lg btn-success col-xs-offset-3 col-xs-2">企業の方</button></a>
			<a href="/gakugeiJob/addSchool/" style="color:#FFF"><button type="button" class="btn btn-lg btn-warning col-xs-offset-2 col-xs-2">学校の方</button></a>
			<div class="col-xs-12" style="height:30px">&nbsp;</div>
		</div> <!-- container -->
		<hr>
 		<div class="footer"><p>&nbsp;&nbsp;&nbsp;&copy; by Group1</p></div>

  		<script src="/gakugeiJob/js/all.min.js"></script>
 		<script src="/gakugeiJob/js/bootstrap.min.js"></script>
	</body>
</html>