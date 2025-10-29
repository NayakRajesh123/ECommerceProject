<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: linear-gradient(to right, #43cea2, #185a9d);
            display: flex;
            justify-content:center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .login-box {
            background-color: rgba(255, 255, 255, 0.95);
            padding: 40px;
            border-radius: 15px;
            box-shadow: 0 0 15px rgba(0,0,0,0.3);
            width: 300px;
            text-align: left;
        }

        h2 {
            margin-bottom: 25px;
        }

        input[type="text"],
        input[type="password"] {
            width: 90%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 6px;
        }

        input[type="submit"] {
            background-color: #185a9d;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 6px;
            cursor: pointer;
            margin-top: 15px;
        }

        input[type="submit"]:hover {
            background-color: #0f3e6b;
        }

        a {
            display: block;
            margin-top: 20px;
            color: #185a9d;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }

        .error {
            color: red;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>

<div class="login-box">
    <h2>Customer Login</h2>
    <% String msg = request.getParameter("msg"); 
       if (msg != null) { %>
        <div class="error"><%= msg %></div>
    <% } %>
    <form action="clogin" method="post">
    <label for="username">Username: </label><br>
        <input type="text" name="username" id="username" placeholder="Username" required><br>
        
        <label for="password" >Password</label>
        <input type="password" name="password" id="password" placeholder="Password" required><br>
        
        <input type="submit" value="Login">
       
    </form>
    <a href="customer_register.jsp"><button>New Customer</button></a>
</div>

</body>
</html>
