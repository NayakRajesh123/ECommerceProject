package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/add")
public class AddProductServlet extends HttpServlet
{
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
	ProductBean p=new ProductBean();
	p.setpCode(req.getParameter("code"));
	p.setpName(req.getParameter("name"));
	p.setpPrice(Double.parseDouble(req.getParameter("price")));
	p.setpStock(Integer.parseInt(req.getParameter("stock")));
	
	int k=new ProductDao().addProduct(p);
	if(k>0)
	{
		res.sendRedirect("addproductsuccess.jsp");
	}
	else
	{
		res.getWriter().println("Error adding product");
	}
}
}
