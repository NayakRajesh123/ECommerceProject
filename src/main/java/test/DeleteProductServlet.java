package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/delete")
public class DeleteProductServlet  extends HttpServlet
{
protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
	int delete=new ProductDao().delete(req.getParameter("pCode"));
	if(delete>0)
	{
		req.setAttribute("msg", "Product Deleted Successfully!!!");
		req.getRequestDispatcher("deletesuccess.jsp").forward(req, res);
	}
	else
	{
		
	}
}
}
