<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Mars Learning</h1>
<h3>Login...</h3>
<%-- <a href = ${pageContext.request.contextPath}/home_1>Click here</a>
<br>
<%=request.getContextPath() %>
<a href = <%=request.getContextPath()%>/home>Click here</a>

<br>
<%=request.getContextPath() %> with Quotes
<a href = "<%=request.getContextPath()%>/home">Click here</a>
<H2>Login Page:</H2> --%>

<form action = "<%=request.getContextPath()%>/home_1" method = "post">
<input type = "text" name = "uname" placeholder = "user name"/> <BR><br>
<input type = "password" name = "pwd" placeholder = "password"/> 
<input type = "submit"  value = "login here"/>
</form>
</body>

</html>