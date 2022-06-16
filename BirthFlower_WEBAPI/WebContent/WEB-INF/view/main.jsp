<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.BirthFlower,java.util.*"%>
<%
BirthFlower birthFlower=(BirthFlower)request.getAttribute("birthFlower");
String flowerName=birthFlower==null?"":birthFlower.getFlowerName()+"";
String flowerLangage=birthFlower==null?"":birthFlower.getFlowerName()+"";
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>誕生花&花言葉APP</title>
</head>
<body>
<div id="container">
<p>誕生月を選択してください</p>
<form action="/BirthFlower_WEBAPI/Main" method="post">
month:
<select name="month" >
<%for(int i=1;i<=12;i++){ %>
<option value="<%=i%>" <%=birthFlower !=null && birthFlower.getMonth().equals(i+"")? "selected":"" %>><%=i%>月</option>
<%} %>
</select>
	<input type="submit" value="送信">

</form>
<%if(birthFlower !=null){ %>
<p>
誕生花:<%=birthFlower.getFlowerName() %><br>
花言葉:<%=birthFlower.getFlowerLangage() %><br>
</p>
<img src="<%=birthFlower.getFlowerImgPath() %>" width="600">
<%} %>
</div>
</body>
</html>