<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Product List</h2>

<%
 ResultSet res=(ResultSet)application.getAttribute("productlist");
while(res.next())
{
	out.println(res.getString(1)+" "+res.getString(2)+" "+res.getLong(3)+" "+res.getString(4)+"<br>");
}

%>

</body>
</html>