<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import=java.util.*%>
<%
request.setCharacterEncoding("UTF-8");
Strig name=request.getParameter("name");
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="送信先" method="get">
名前:<input type="text" name="name"><br>
性別:
男<input type="radio" name="gender" value="0">
女<input type="radio" name="gender" value="1"><br>
趣味:
映画<input type="checkbox" name="hobby" value="movie">
音楽<input type="checkbox" name="hobby" value="music">
スポーツ<input type="checkbox" name="hobby" value="sports"><br>
コメント<textarea name="comment" rows="5" cols="40">コメントを入力してください</textarea>
<input type="submit" value="登録">
</form>

</body>
</html>