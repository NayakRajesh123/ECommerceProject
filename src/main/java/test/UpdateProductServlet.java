package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProductServlet extends HttpServlet
{
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
	Product p=new Product();
	p.setCode(req.getParameter("code"));
	p.setName(req.getParameter("name"));
	p.setPrice(Double.parseDouble(req.getParameter("price")));
	p.setQty(Integer.parseInt(req.getParameter("qty")));
	
	if(ProductDao.updateProduct(p))
	{
		res.sendRedirect("ViewAllProduct.jsp");
	}
	else
	{
		res.getWriter().println("update failed");
	}
}
}
