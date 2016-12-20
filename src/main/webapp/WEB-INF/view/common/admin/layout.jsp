<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
		<title><tiles:getAsString name="title" /></title>
		<link rel="stylesheet" href="/gakugeiJob/css/bootstrap.min.css">
	</head>
	<body>
	  <div class="container">

      <!-- Static navbar -->
      <nav class="navbar navbar-default">
        <div class="container-fluid">
          <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
              <span class="sr-only">Toggle navigation</span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
              <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/gakugeiJob/admin/home/">GakugeiJob</a>
          </div>
          <div id="navbar" class="navbar-collapse collapse">
            <ul class="nav navbar-nav">
              <li class="active"><a href="/gakugeiJob/admin/home/">Home</a></li>
              <li><a href="/gakugeiJob/admin/addStudent/">学生登録</a></li>
              <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">情報閲覧<span class="caret"></span></a>
                <ul class="dropdown-menu">
                  <li><a href="/gakugeiJob/admin/viewEnterprise/">企業情報閲覧</a></li>
                  <li><a href="/gakugeiJob/admin/viewSchool/">学校情報閲覧</a></li>
                  <li><a href="/gakugeiJob/admin/viewStudent">学生情報閲覧</a></li>
                </ul>
              </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
              <li><a href="/gakugeiJob/admin/editPass/">パスワード変更</a></li>
              <li><a href="/gakugeiJob/admin/logout/">ログアウト</a></li>
            </ul>
          </div><!--/.nav-collapse -->
        </div><!--/.container-fluid -->
      </nav>

		<div class="app">
		  <tiles:insert attribute="content" />
		  <hr>
		  <footer>
		    <p>&copy; by Group1</p>
		  </footer>
		</div>

    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="/gakugeiJob/js/jquery.min.js"></script>
    <script src="/gakugeiJob/js/bootstrap.min.js"></script>
	</body>
</html>