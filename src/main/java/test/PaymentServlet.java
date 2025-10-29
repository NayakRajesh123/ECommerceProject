package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/payment")
public class PaymentServlet extends HttpServlet
{
protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
	try
	{
		String code=req.getParameter("code");
		int qty=Integer.parseInt(req.getParameter("qty"));
		int currentQty=Integer.parseInt(req.getParameter("stock"));
        ProductDao.updateQuantity(code, currentQty - qty);
		req.getRequestDispatcher("confirm.jsp");
	}
	catch (Exception e) {
e.printStackTrace();
	}
}
}
