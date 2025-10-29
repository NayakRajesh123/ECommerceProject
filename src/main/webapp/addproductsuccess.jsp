<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    String msg=(String) request.getAttribute("msg");
    out.println(msg);
    
    %>

<h2>Welcome: <%="" %></h2>
<a href="viewproducts.jsp">View All Products</a>
<a href="logout.jsp">Logout</a>
</html>