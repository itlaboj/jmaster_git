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
<%--　スクリプトレット --%>
<%
out.println(10 / 0);
%>
</body>
</html>