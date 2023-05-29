<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>除算処理</title>
</head>
<body>
<h1>除算処理</h1>
<hr>
<form action="/jmaster_git/murasaki" method="get">
	<input type="hidden" name="ACTION" value="waru">
	
	<input type="text" name="DATA1">
	÷
	<input type="text" name="DATA2">
	<br>
	<input type="submit" value="除算結果表示">
</form>
${ERROR_MESSAGE}
</body>
</html>