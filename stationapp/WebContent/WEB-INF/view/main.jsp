<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,model.*"%>
<%
List<String> area=(List<String>)request.getAttribute("area");
List<Station> list=(List<Station>)request.getAttribute("list");


%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>駅検索</title>
</head>
<body>
<p>路線を選んでください</p>
<form action="/stationapp/Main" method="post">
<select name="area">
<%for(String s:area) {%>
<option value="<%=s%>"><%=s%></option>
<%} %>
</select>
<input type="submit" value="送信">
</form>
<%if(list !=null && list.size()>0){ %>
<table border="1">
<tr><th>駅名</th><th>都道府県</th></tr>
<%for(Station s:list){ %>
<tr>
<td><%=s.getName() %></td><td><%=s.getPrefecture() %></td>
</tr>
<%} %>
</table>
<%} %>
</body>
</html>