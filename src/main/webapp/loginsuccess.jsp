<%@ page import="test.AdminBean" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<style>
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background: linear-gradient(to right, #f8f9fa, #e9ecef);
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    .container {
        background: white;
        padding: 40px;
        border-radius: 20px;
        box-shadow: 0 10px 25px rgba(0,0,0,0.1);
        text-align: center;
        width: 400px;
    }
    h1 {
        color: #343a40;
        margin-bottom: 20px;
    }
    .msg {
        color: #28a745;
        margin-bottom: 20px;
        font-weight: bold;
    }
    button {
        background-color: #007bff;
        color: white;
        border: none;
        padding: 12px 20px;
        margin: 10px 5px;
        border-radius: 8px;
        font-size: 16px;
        cursor: pointer;
        transition: 0.3s ease;
    }
    button:hover {
        background-color: #0056b3;
    }
    a {
        text-decoration: none;
    }
</style>
</head>
<body>
<div class="container">
<%
AdminBean admin=(AdminBean)request.getAttribute("ab");
%>
   <h1>WELCOME: <%= admin != null ? admin.getName() : "" %></h1>

    <%
        String msg = (String) request.getAttribute("msg");
        if (msg != null) {
    %>
        <div class="msg"><%= msg %></div>
    <%
        }
    %>
    <a href="product.html"><button>Add Product</button></a>
    <a href="viewproducts"><button>View All Products</button></a>
    <a href="logout.jsp"><button>Logout</button></a>
</div>
</body>
</html>
