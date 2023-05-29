<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="test03.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>初めてのJSP</title>
</head>
<body>
<%
request.setAttribute("age", 23);
request.setAttribute("name", "山田太郎");
request.setAttribute("name2", "");
%>
${empty name}<br>
${not empty name}<br>
${empty name2}<br>
${not empty name2}<br>
<hr>
${age + 10}<br>
${age == 23}<br>
${age eq 23}<br>
${age >= 20}<br>
${age ge 20}<br>
${age < 20}<br>
${age lt 20}<br>
</body>
</html>