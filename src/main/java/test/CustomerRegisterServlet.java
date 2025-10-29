package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/CustomerRegisterServlet")
public class CustomerRegisterServlet extends HttpServlet
{
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
	String username=req.getParameter("username");
	String password=req.getParameter("password");
	String fastname=req.getParameter("fname");
	String lastname=req.getParameter("lname");
	String gmail=req.getParameter("gmail");
	Long phno= Long.parseLong(req.getParameter("phno"));
	
	CustomerBean cb = new CustomerBean();
	cb.setName(username);
	cb.setcPassWord(password);
	cb.setName(lastname);
	cb.setEmail(gmail);
	cb.setPhone(phno);
	
	int k = new CustomerDao().insert(cb);
	if(k>0) {
		res.getWriter().println("Inserted successfully");
	}else {
		res.getWriter().println("Failed to register...");
	}
	}
}
