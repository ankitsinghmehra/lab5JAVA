<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*"%>
    <%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="post">
enter unique id: <input type="text" name="unid"/>
enter password: <input type="password" name="passw"/>
enter email id: <input type="text" name="email"/>
<input type="submit" value="Sign Up"/>
</form>
<%
if(request.getParameter("unid")!=null){
try{	
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "seed1234");
PreparedStatement pm=con.prepareStatement("insert into userdetails values(?,?,?)");
pm.setString(1, request.getParameter("unid"));
pm.setString(2, request.getParameter("passw"));
pm.setString(3, request.getParameter("email"));
pm.executeUpdate();
out.println("Signed Up");
}
catch(Exception ex){
	ex.printStackTrace();
}
}
%>
</body>
</html>