<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>問い合わせフォーム</title>
</head>
<body>
<p>お問い合わせフォーム</p>
<form action="/sessionPract/SessionServlet" method="post">
お名前<input type="text" name="name"><br>
メールアドレス<input type="text" name="address"><br>
お問い合わせ内容<textarea name="comment" rows="5" cols="40"></textarea><br>
<input type="submit" value="確認">
</form>
</body>
</html>