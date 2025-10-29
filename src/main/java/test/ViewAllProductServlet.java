package test;

import java.io.IOException;
import java.sql.ResultSet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/viewproducts")
public class ViewAllProductServlet  extends HttpServlet
{
protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
	try
	{
		
		ResultSet result=  DisplayProduct.ViewAllProduct();
		
		//now set in servletcpontext and send to another page as a request
		
		ServletContext context=req.getServletContext();
		context.setAttribute("productlist", result);
		req.getRequestDispatcher("ViewAllProduct.jsp").forward(req, res);
		
		
		
	}
	catch (Exception e)
	{
   e.printStackTrace();
}
}
}
