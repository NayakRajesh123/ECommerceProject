package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/newcustomer")
public class NewCustomerServlet extends HttpServlet
{
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
	
}
}
