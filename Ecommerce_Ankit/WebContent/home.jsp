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
<button onclick="showData();">click to view all</button>
<table border=1 style="display:none;" id="tabledata">
<tr><th>product id</th><th>product name</th><th>price</th><th>category</th></tr>
<%
try{

	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "seed1234");
	PreparedStatement pm=con.prepareStatement("select * from product");
	ResultSet rs=pm.executeQuery();
	out.println("hogya");
	while(rs.next()){
		%><tr><td><%=rs.getString(1)%></td>
		<td><%= rs.getString(2)%></td>
		<td><%=rs.getString(3)%></td>
		<td><%=rs.getString(4)%></td></tr>
		<%
	}
	
}
catch(Exception ex){
	ex.printStackTrace();
}
%></table>
<script type="text/javascript">

function showData() {
	  var x = document.getElementById("tabledata");
	  if (x.style.display === "none") {
	    x.style.display = "block";
	  } 
	}
</script>
</body>
</html>