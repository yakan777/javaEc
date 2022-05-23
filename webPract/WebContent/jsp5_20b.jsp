<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>九九</title>
</head>
<body>
<table border="1">
<caption>九九</caption>
<tr><%for(int i=1;i<=9;i++){
for(int j =1;j<=9;j++){%>
<th><%=i*j%></th>
<%}%>
</tr>
<%}%>
</table>
</body>
</html>