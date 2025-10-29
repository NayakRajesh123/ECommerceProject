<%@page import="test.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>edit</title>
</head>
<body>
<%
Product p=new Product();
%>
<h3>Page Belongs To : r</h3>
<form action="UpdateProductServlet" method="post">
<input type="hidden" name="code" value="<%=p.getCode()%>">
Product Price: <input type="text" name="pprice" value="<%=p.getPrice()%>"><br>
Product Quantity: <input type="text" name="pqty" value="<%=p.getQty() %>"><br>
<input type="submit" value="Update">
</form>
</body>
</html>