
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form name="loginForm" method="post" action="checkAuth.jsp">
    UserID: <input type="text" name="userid"/><br><br>
    Password: <input type="password" name="pass"/><br><br>
        <input type="submit" name="login" value="Log In">    
</form>
<a href="./signup.jsp">New Member...click here to sign up</a>


	

</body>
</html>