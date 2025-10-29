<%@page import="test.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Bill</title>
</head>
<body>

<%
Product p=(Product)request.getAttribute("product");
int qty=(Integer)request.getAttribute("qty");
double total=(Double)request.getAttribute("total");
%>
<form action="PaymentServlet" method="post">

Code: <%=p.getCode() %><br>
Name: <%=p.getName() %><br>
Price: <%=p.getPrice() %><br>
Required Quantity: <%=qty %><br>
Total Billing Amount: <%=total %><br>
<input type="hidden" name="code" value="<%=p.getCode()%>"/>
<input type="hidden" name="qty" value="<%=qty %>"/>
<input type="hidden" name="stock" value="<%=p.getQty()%>"/>
<button type="submit">Payment</button>
</form>
<a href="ProductListServlet">Back</a>
</body>
</html>