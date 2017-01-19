<!DOCTYPE html>
<html lang="ja">
	<head>
		<meta charset="utf-8">
 	 	<meta http-equiv="X-UA-Compatible" content="IE=edge">
 	 	<meta name="viewport" content="width=device-width, initial-scale=1">
 	 	<title>企業新規登録</title>
 		<link href="/gakugeiJob/css/bootstrap.min.css" rel="stylesheet">
 		<link href="/gakugeiJob/css/signin.css" rel="stylesheet">
	</head>
	<body>
		<div class="jumbotron text-center" style="background-color:#FFF;color:#000">	
 	 		<h1 class="text-center">GakugeiJob!</h1><br>
 	 		<h2 class="text-center">企業新規登録</h2>
 	 	</div>
 	 	
 	 	<div class="container">
 	 	<h1 class="page-header">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<small>登録情報（●印は入力必須項目）<br>入力項目に適していないとき、またユーザーIDが既に使われている場合エラーになります。</small></h1><br>	
        	<form name="enterpriseActionForm" class="form-horizontal" action="/gakugeiJob/addEnterprise/" method="POST">
				<div class="form-group">
				<label class="col-sm-2 control-label">● ユーザーID:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="userId" maxlength="12" required autofocus></div>
				<div class="col-sm-7"><p class="help-block">半角英数字12文字以内で入力してください。</p></div>
				
				</div>
				<div class="form-group">
				<label class="col-sm-2 control-label">● ユーザーパスワード:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="userPass" maxlength="12" required></div>
				<div class="col-sm-7"><p class="help-block">半角英数字12文字以内で入力してください。</p></div>
				</div>     	
				
				<div class="form-group">
				<label class="col-sm-2 control-label">● 企業名:</label>
					<div class="col-sm-10"><input type="text" class="form-control" name="name" maxlength="50" placeholder="50文字以内"required></div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">創業日:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="foundingDate" maxlength="20" placeholder="20文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">創業者の氏名:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="founderName" maxlength="20" placeholder="20文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">本社の住所:</label>
					<div class="col-sm-10"><input type="text" class="form-control" name="address" maxlength="100" placeholder="100文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">資本金:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="capital" maxlength="20" placeholder="20文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">代表取締役者氏名:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="presidentName" maxlength="20" placeholder="20文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">従業員数:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="numOfEmployees" maxlength="20" placeholder="20文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">営業種目:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="business" maxlength="20" placeholder="20文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">● 電話番号:</label>
					<div class="col-sm-3"><input type="text" class="form-control" name="phoneNumber" maxlength="12" placeholder="12文字以内" required> </div>
					<div class="col-sm-7"><p class="help-block">ハイフン無しで入力してください。</p></div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">企業URL:</label>
					<div class="col-sm-10"><input type="text" class="form-control" name="url" maxlength="100" placeholder="100文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">ひとこと:</label>
					<div class="col-sm-10"><input type="text" class="form-control" name="oneThing" maxlength="100" placeholder="100文字以内"> </div>
				</div>
				
				<div class="form-group">
				<label class="col-sm-2 control-label">● メールアドレス:</label>
					<div class="col-sm-10"><input type="text" class="form-control" name="mailAddress" maxlength="100" placeholder="100文字以内" required> </div>
				</div>
				
				<div class="form-group">
				<div class="col-sm-offset-2 col-sm-10 text-right">
	     	    	<button class="btn btn-lg btn-default" type="submit" name="add" value="Add">新規登録</button>
	     	    </div>
	     	    
	     	    </div>
      		</form>
      	</div> <!-- container -->
		
  		<script src="/gakugeiJob/js/all.min.js"></script>
 		<script src="/gakugeiJob/js/bootstrap.min.js"></script>
 		<hr>
 		<div class="footer"><p>&nbsp;&nbsp;&nbsp;&copy; by Group1</p></div>
	</body>
</html>