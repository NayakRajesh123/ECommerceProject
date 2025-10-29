<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Registration</title>
</head>
<body>
<h2>Register</h2>
<form action="CustomerRegisterServlet" method="post">
Username: <input type="text" name="username" id="username" required="required"><br>
Password: <input type="text" name="password" id="password" required="required"><br>
First Name: <input type="text" name="fname" id="fname" required="required"><br>
Last Name: <input type="text" name="lname" id="lname" required="required"><br>
Gmail Id: <input type="email" name="gmail" id="gmail" required="required"><br>
Phone Number: <input type="text" name="phno" ><br>
<input type="submit" value="Register">
</form>
</body>
</html>