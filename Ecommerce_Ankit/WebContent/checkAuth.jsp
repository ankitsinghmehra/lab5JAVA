<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.lang.ProcessBuilder.Redirect"%>
    <%@page import="java.sql.*"%>
    <%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%


String uid="";
String pass="";
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "seed1234");
	PreparedStatement pm=con.prepareStatement("select userid, pass from userdetails where userid=?");
	pm.setString(1,request.getParameter("userid"));
	//pm.setString(2,request.getParameter("pass"));
	ResultSet rs=pm.executeQuery();
	if(rs.next())
		response.sendRedirect("./home.jsp");
	else
		response.sendRedirect("./error.jsp");
	/*while(rs.next()){
	 uid=rs.getString(1);
	pass=rs.getString(2);
	}
	if(uid.equals(request.getParameter("userid")) && pass.equals(request.getParameter("pass"))){
		response.sendRedirect("./home.jsp");
	}
	else
		response.sendRedirect("./error.jsp");*/
}
catch(Exception ex){
	ex.printStackTrace();
}

%>

</body>
</html>