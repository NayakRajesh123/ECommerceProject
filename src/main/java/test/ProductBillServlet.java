package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/productbill")
public class ProductBillServlet extends HttpServlet
{
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
	try
	{
	String code=req.getParameter("code");	
	int qty=Integer.parseInt(req.getParameter("qty"));
	Product p=ProductDao.getProductByCode(code);
	double total=qty*p.getPrice();
	
	req.setAttribute("product", p);
	req.setAttribute("qty", qty);
	req.setAttribute("total", total);
	
	req.getRequestDispatcher("bill.jsp");
	}
	catch (Exception e) 
	{
e.printStackTrace();
}
}
}
