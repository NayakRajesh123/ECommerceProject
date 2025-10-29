<%@page import="test.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Payment Success</title>
<style type="text/css">
body {
	font-family: Arial;
	text-align: center;
	background: #f2f2f2;
    padding-top: 100px;
    
}

.container {
background: :white;
display: inline-block;
padding: 30px;
border-radius: 10px;
box-shadow: 0 0 10px rgba(0,0,0,0.2);
}

h2 {
font-size: 24px;
margin-bottom: 20px;
}

.highlight {
font-weight: bold;
color: #333;
}

.success {
font-weight: bold;
font-size: 20px;
color: green;
margin-bottom: 30px;
}

.btn {
background-color: #007bff;
color: white;
padding: 10px 20px;
text-decoration: none;
border-radius: 5px;
margin: 10px;
display: inline-block;
}

</style>
</head>
<body>
<%CustomerBean cb = (CustomerBean)session.getAttribute("customer"); %>
<div class="container">
<h2>Welcome: <span class="highlight"><%=cb.getName()%></span></h2>
<div class="success">Payment Successfully Completed</div>
<a href="ProductListServlet">View All Products</a>
<a href="logout.jsp" class="btn">Logout</a>
</div>
</body>
</html>