<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="test03.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>初めてのJSP</title>
</head>
<body>
<c:forEach var="i" begin="1" end="10" step="2">
	${i}<br>
</c:forEach>
</body>
</html>