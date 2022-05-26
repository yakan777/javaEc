<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ健康診断</title>
</head>
<body>
<h1>スッキリ健康診断</h1>
<form action="/example/HealthCheck" method="post">
身長:<input type="number" name="height" min="50">(cm)<br>
体重:<input type="number" name="weight" max="500">(kg)<br>
<input type="submit" value="診断">
</form>
</body>
</html>