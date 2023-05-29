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
request.setAttribute("age", 23);
%>

<c:if test="${age >= 18}"> <%-- ${age ge 18}でもOK --%>
	成人です。<br>
</c:if>
<c:if test="${age < 18}"> <%-- ${age lt 18}でもOK --%>
	未成年です。<br>
</c:if>
</body>
</html>