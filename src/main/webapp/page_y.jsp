<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="true" %>
<%@ page import="p01.Member" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>初めてのJSP</title>
</head>
<body>
<%
String name = (String)session.getAttribute("NAME");
String company = (String)application.getAttribute("COMPANY");
Integer age = (Integer)request.getAttribute("AGE");
Member m = (Member)request.getAttribute("MEMBER");
%>

セッション・スコープ：<%= name %><br>
アプリケーション・スコープ：<%= company %><br>
リクエスト・スコープ：<%= age %><br>
<hr>
ID：<%= m.getId() %><br>
名前：<%= m.getName() %><br>
年齢：<%= m.getAge() %><br>

</body>
</html>