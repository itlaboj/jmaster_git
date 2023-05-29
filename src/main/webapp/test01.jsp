<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>初めてのJSP</title>
</head>
<body>
<%!
private int age = 23;

public int tasu(int x, int y) {
	return x + y;
}
%>

<%--　スクリプトレット --%>
<%
//スクリプトレット（Javaのプログラムを記述する領域）
//doGetとdoPostに対応している
//doGetとdoPostの一部として割り当てられる
String name = "山田太郎";

//out.println(name);
%>

<!-- 式 -->
年齢：<%= age %><br>
加算結果：<%= tasu(10, 20) %><br>

<% for (int i = 0; i < 5; i++) { %>
	名前：<%= name %><br>
<% } %>
</body>
</html>