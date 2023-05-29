<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>初めてのJSP</title>
</head>
<body>
0で割れません！<br>
<%= exception.getMessage() %>
</body>
</html>