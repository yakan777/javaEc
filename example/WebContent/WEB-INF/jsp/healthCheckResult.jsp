<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="model.Health" %>
<%
  Health health =(Health) request.getAttribute("health");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>スッキリ健康診断</title>
</head>
<body>
<h1>スッキリ健康診断の結果</h1>
<%if(health.getHeight() == 0 || health.getWeight() == 0){%>
<p>正しい値を入力してください</p>>
<%}else{ %>
<p>
身長:<%= health.getHeight() %><br>
体重:<%= health.getWeight() %><br>
BMI:<%= health.getBmi() %><br>
体型:<%= health.getBodyType() %><br>
</p>
<%if(health.getBodyType().equals("肥満")){%>
<img src="/example/images/pig.png" alt="">
<%}%>
<%} %>>
<a href="/example/HealthCheck">戻る</a>
</body>
</html>