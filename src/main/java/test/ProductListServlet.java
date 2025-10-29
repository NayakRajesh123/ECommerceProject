package test;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/productlist")
public class ProductListServlet extends HttpServlet
{
protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
	try
	{
		List<Product> products=ProductDao.getAllProducts();
		req.setAttribute("products", products);
		req.getRequestDispatcher("viewallproducts.jsp").forward(req, res);
	}
	catch (Exception e)
	{
e.printStackTrace();
}
}
}
