package test;


import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet 
{
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
	
	
	String name=req.getParameter("aname");
	String password=req.getParameter("pwd");
	
	//LoginDao.login(name,password);
	System.out.println(name +" "+password);
	AdminBean ab = LoginDao.validate(name,password);

	
	
	if(ab!=null)
	{
		//req.setAttribute("msg", "Login Success");
       // res.getWriter().println("Login Success");
		System.out.println("customer login");
		req.setAttribute("msg", "Login Success");
		req.setAttribute("ab", ab);
		RequestDispatcher rd=req.getRequestDispatcher("loginsuccess.jsp");
		rd.forward(req, res);
	}
	else
	{
		//res.sendRedirect("login.html?msg=Login Failed");

		req.setAttribute("msg", "Invalid Username or Password");
		RequestDispatcher rd=req.getRequestDispatcher("login.jsp");
				rd.forward(req, res);
	}
}

}
