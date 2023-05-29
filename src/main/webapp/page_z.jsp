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
${LIST1[0]}<br>
${LIST1[1]}<br>
${LIST1[2]}<br>
<hr>
${LIST2[0]}<br>
${LIST2[1]}<br>
${LIST2[2]}<br>
<hr>
${MAP.k1}<br>
${MAP.k2}<br>
${MAP.k3}<br>

</body>
</html>