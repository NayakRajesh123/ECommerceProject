package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class BuyProductServlet extends HttpServlet
{
protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
	try
	{
		String code=req.getParameter("code");
		Product p=ProductDao.getProductByCode(code);
		req.setAttribute("product", p);
		 req.getRequestDispatcher("buy.jsp").forward(req,res);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
}
