<%@page import="test.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String msg=(String)request.getAttribute("msg");
CustomerBean cb=(CustomerBean)session.getAttribute("customer");
%>
<h1 style="text-align: center;color: green"><%out.println(msg);%></h1>
<h1 style="text-align: center;color: green">Welcome :<%out.println(cb.getName()); %></h1>
<input type="submit" value="View Products">
</body>
</html>