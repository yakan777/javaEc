<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.util.*,java.text.*"%>
<%
String[] luckArray = { "超スッキリ", "スッキリ", "最悪" };
int index = (int) (Math.random() * 3);
String luck = luckArray[index];

Date date = new Date();
SimpleDateFormat sdf = new SimpleDateFormat("MM月dd日");
String today = sdf.format(date);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ占い</title>
</head>
<body>
	<%--jsp式コメント(ソースからは見られない) --%>
	<%
	for (int i = 0; i < 3; i++) {
	%>
	<p><%=today%>の運勢は「<%=luck%>」です
	</p>
	<%
	}
	%>
	<!-- html式コメント（ソースに残る） -->
</body>
</html>