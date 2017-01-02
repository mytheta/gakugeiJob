<!DOCTYPE html>
<html lang="ja">
	<head>
		<meta charset="utf-8">
 	 	<meta http-equiv="X-UA-Compatible" content="IE=edge">
 	 	<meta name="viewport" content="width=device-width, initial-scale=1">
 	 	<title>認証</title>
 		<link href="/gakugeiJob/css/bootstrap.min.css" rel="stylesheet">
 		<link href="/gakugeiJob/css/signin.css" rel="stylesheet">
	</head>
	<body>
		<div class="jumbotron text-center" style="background-color:#FFF;coror:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1>
 	 	</div>
 	 	<div class="container">
        	<form name="admin_loginActionForm" class="form-signin" action="/gakugeiJob/admin/login/" method="POST">
	        	<h2 class="form-signin-heading text-center">Check Please!</h2>
	       		<input type="password" name="adminPass1" class="form-control" placeholder="adminPass1" maxlength="20" required autofocus>
	      	    <input type="password" name="adminPass2" class="form-control" placeholder="adminPass2" maxlength="20" required>
	     	    <button class="btn btn-lg btn-primary btn-block" type="submit" name="login" value="Login">Check</button>
      		</form>
		</div> <!-- container -->
  		<script src="/gakugeiJob/js/all.min.js"></script>
 		<script src="/gakugeiJob/js/bootstrap.min.js"></script>
 		
 		<hr>
 		<div class="footer"><p>&nbsp;&nbsp;&nbsp;&copy; by Group1</p></div>
	</body>
</html>