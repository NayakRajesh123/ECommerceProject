package test;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/editproduct")
public class EditProductServlet extends HttpServlet
{

protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException,IOException
{
	try
	{
		Connection con=DBConnection.getConnection();
		String pCode = req.getParameter("code");
		PreparedStatement ps=con.prepareStatement("select * from product where code=?");
		ps.setString(1, pCode);
		ResultSet rs=ps.executeQuery();
		
		if(rs.next())
		{
			req.setAttribute("code", rs.getString("code"));
			req.setAttribute("name", rs.getString("name"));
			req.setAttribute("price", rs.getDouble("price"));
			req.setAttribute("qty", rs.getInt("quantity"));
					RequestDispatcher rd=req.getRequestDispatcher("editproduct.jsp");
					rd.forward(req, res);
		}
		else
		{
			res.getWriter().println("product not found");
		}
	}
	catch (Exception e) {
e.printStackTrace();
}
}
}
