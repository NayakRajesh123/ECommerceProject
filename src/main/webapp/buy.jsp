<%@page import="java.awt.Button"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"import="test.Product"
    %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Product p=(Product)request.getAttribute("product");
%>
<form action="ProductBillServlet" method="post">
Code: <%=p.getCode() %>
Name: <%=p.getName() %>
Price: <%=p.getPrice() %>
Stock: <%=p.getQty() %>
Required Qty: <input type="text" name="qty"/><br>
input type="hidden" name="code" value="<%=p.getCode()%>"/>
<button type="submit">Buy Product</button>
</form>
</body>
</html>

