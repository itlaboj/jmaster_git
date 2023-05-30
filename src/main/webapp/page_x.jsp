<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%@ page import="p01.Member" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>初めてのJSP</title>
</head>
<body>
<%
//String name = (String)session.getAttribute("NAME");
//String company = (String)application.getAttribute("COMPANY");
//Integer age = (Integer)request.getAttribute("AGE");
//Member m = (Member)request.getAttribute("MEMBER");
%>

セッション・スコープ：${sessionScope.NAME}<br>
アプリケーション・スコープ：${applicationScope.NAME}<br>
リクエスト・スコープ：${AGE}<br>
<hr>
ID：${MEMBER.id}<br>
名前：${MEMBER.name}<br>
年齢：${MEMBER.age}<br>
<hr>
<c:forEach var="data" items="${LIST1}" varStatus="xxx">
	${xxx.index}　${data}<br>
</c:forEach>
<hr>
<c:forEach var="data" items="${LIST2}" varStatus="xxx">
	${xxx.count}　${data}<br>
</c:forEach>
<hr>
<c:forEach var="data" items="${MAP}">
	${data.key}　${data.value}<br>
</c:forEach>

</body>
</html>