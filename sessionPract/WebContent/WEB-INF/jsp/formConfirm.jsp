<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.User"%>
<%
User registerUser =
(User)session.getAttribute("registerUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>お問い合わせフォーム</title>
</head>
<body>
<p>お問い合わせフォーム</p>
<p>以下の内容でよろしいですか？</p>
<p>
お名前<%=registerUser.getName() %><br>
メールアドレス<%= %><br>
お問い合わせ内容<%= %><br>
</p>
<a href="/sessionPract/RegisterUser">戻る</a>
<a href="/sessionPract/RegisterUser?action=done">登録</a>
</body>
</html>