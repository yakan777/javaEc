<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String ans = request.getParameter("ans");
String path = "yes.png";
String msg = "正解";
if (!ans.equals("634")) {
	path = "no.png";
	msg = "残念…";
}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Quiz</title>
<link rel="stylesheet" href="/5_25/css/main.css">
</head>
<body>
	<div id="container">
		<div id="boxA">
			<p><%=msg%></p>
			<a href="/5_25/index.html">戻る</a>
		</div>
		<div id="boxB">
			<div class="imgBox">
				<img src="/5_25/images/<%=path%>" alt="">
			</div>
		</div>
	</div>
</body>
</html>