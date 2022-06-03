<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.*,java.util.*"%>
<%
User loginUser =(User) session.getAttribute("loginUser");

List<Mutter> mutterList=
(List<Mutter>) request.getAttribute("mutterList");

String errorMsg = (String) request.getAttribute("errorMsg");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>どこつぶ</title>
</head>
<body>
<h1>どこつぶメイン</h1>
<p>
<%= loginUser.getName() %>さん、ログイン中
<a href="/docoTsubuDB/Logout">ログアウト</a>
</p>
<p><a href="/docoTsubuDB/Main">更新</a></p>
<form action="/docoTsubuDB/Main" method="post">
<input type="text" name="text">
<input type="submit" value="つぶやく">
</form>
<%if(errorMsg !=null){ %>
<p><%= errorMsg %></p>
<%} %>
<%if(mutterList !=null && mutterList.size()>0){ %>
<% for(Mutter mutter : mutterList) {%>
<p><%=mutter.getUserName() %>:<%=mutter.getText() %></p>
<%} %>
<%} %>
</body>
</html>