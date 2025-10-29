package test;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/clogin")
public class CustomerLoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        CustomerBean customer = new CustomerDao().validateCustomer(username, password);
        System.out.println(customer);
        if (customer != null) {
        	System.out.println("login success");
        	request.setAttribute("msg", "Customer Login Successfull");
            HttpSession session = request.getSession();
            session.setAttribute("customer", customer);
           request.getRequestDispatcher("customer_login_success.jsp").forward(request, response);
            
        } else {
        	System.out.println("login failed");
            response.sendRedirect("customer_login.jsp");
        }
    }
}
