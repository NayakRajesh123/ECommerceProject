package test;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@SuppressWarnings("serial")
@WebServlet("/product")
public class ProductServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductBean pb=new ProductBean();
		pb.setpCode(request.getParameter("pcode"));
		pb.setpName(request.getParameter("pname"));
		pb.setpPrice(Double.parseDouble(request.getParameter("pprice")));
		pb.setpStock(Integer.parseInt(request.getParameter("pstock")));

		int k = new ProductDao().addProduct(pb);
		if(k>0)
		{
			request.setAttribute("msg", "Add Product SuccessFully!!!");
			request.getRequestDispatcher("addproductsuccess.jsp").forward(request, response);
		}
		else {
			response.getWriter().println("Product not added successfully!!!!");
		}
	}

}
