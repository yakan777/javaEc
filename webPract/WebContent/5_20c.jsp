<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>カレンダー</title>
</head>
<body>
<table border="1">
<caption>7月</caption>
<tr><%for(int i=1;i<=31;i++){%>
<th><%=i%></th><%if(i%7==0)%></tr>
<%}%>
</table>
</body>
</html>