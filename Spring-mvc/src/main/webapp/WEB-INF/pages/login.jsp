<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="navbar.css" rel="stylesheet"/>
</head>
<body>
<div class="page">
	<div class="navbar">
		<h1>Mars Returnship</h1>
	</div>
	<div class="content">
		<h2>Login</h2>
		<form action = "<%=request.getContextPath()%>/validate" method = "post">
			<input type = "text" name = "uname" placeholder = "user name"/> <BR><br>
			<input type = "password" name = "pwd" placeholder = "password"/> 
			<input type = "submit"  value = "login here"/>
		</form>
	</div>
	<div class="register">
		<h2>Register</h2>
		<form action = "<%=request.getContextPath()%>/addUser" method = "post">
			<input type = "text" name = "userName" placeholder = "user name"/> <BR><br>
			<input type = "password" name = "password" placeholder = "password"/> 
			<input type = "submit"  value = "Register"/>
		</form>
	</div>
</div>
</body>
</html>