<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Mars Returnship</h1>
<h2>Login</h2>
<form action = "<%=request.getContextPath()%>/validate" method = "get">
<input type = "text" name = "uname" placeholder = "user name"/> <BR><br>
<input type = "password" name = "pwd" placeholder = "password"/> 
<input type = "submit"  value = "login here"/>
</form>
</body>
</html>