<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>新規会員登録</title>
</head>
<body>
	<h1>新規会員登録</h1>
	<form action="../userServlet" method="post">
	<p>ユーザID</p><input type="text" name="member_id" required>
	<p>パスワード</p><input type="password" name="login_id" required>
	<p>名前</p>
	<p>姓</p><input type="text" name="last_name" required>
	<p>名</p><input type="text" name="first_name" required>
	<p>性別</p>
	<input type="radio" name="sex" value="M" required>男
	<input type="radio" name="sex" value="F" required>女
	<p>生年月日</p><input type="text" name="birthday" required>
	<p>電話番号</p><input type="text" name="phone_number" required>
	<p>メールアドレス</p><input type="emaill" name="mail_address" required>
	<p>職業</p>
	<select name="job">
	<option value="job1">job1</option>
	<option value="job2">job2</option>
	<option value="job3">job3</option>
	</select><br><br>
	<input type="submit" value="登録">
	</form>
</body>
</html> 