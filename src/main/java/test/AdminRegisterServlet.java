package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/AdminRegisterServlet")
public class AdminRegisterServlet extends HttpServlet
{
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
	AdminBean ab=new AdminBean();
	ab.setName(req.getParameter("name"));
	ab.setEmail(req.getParameter("email"));
	ab.setPhone(req.getParameter("phone"));
	ab.setPassword(req.getParameter("password"));
	
	int k=new AdminDao().register(ab);
	
	if(k>0)
	{
		//res.sendRedirect("login.html?=msg=Registration Success");
		req.setAttribute("msg", "Register Successful");
		req.getRequestDispatcher("login.jsp").forward(req, res);
	}
	else
	{
		res.sendRedirect("register.html?msg=Registration Failed");
	}
}
}
