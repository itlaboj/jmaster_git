<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="test03.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>初めてのJSP</title>
</head>
<body>
<%
request.setAttribute("data", 1);
%>

<c:choose>
	<c:when test="${data == 1}">１です</c:when>
	<c:when test="${data eq 2}">２です</c:when>
	<c:when test="${data == 3}">３です</c:when>
	<c:otherwise>１～３以外です。</c:otherwise>
</c:choose>
</body>
</html>