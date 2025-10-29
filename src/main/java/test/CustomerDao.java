package test;



import java.sql.*;

import oracle.jdbc.proxy.annotation.Pre;

public class CustomerDao {

    public CustomerBean  validateCustomer(String username, String password) {
    	CustomerBean customer = null;

        try (Connection conn = DBConnection.getConnection()) {
            String sql = "SELECT * FROM customer WHERE name=? AND password=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                customer = new CustomerBean();
                customer.setName(rs.getString("name"));
                customer.setEmail(rs.getString("email"));
                customer.setPhone(rs.getLong("phno"));
                customer.setpWord(rs.getString("password"));
               
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return customer;
    }
	int k=0;
    public int insert(CustomerBean cb) {
    	Connection con = null;
    try{
    	con=DBConnection.getConnection();
    	PreparedStatement ps = con.prepareStatement("insert into Customer values(?,?,?,?)");
    	ps.setString(1, cb.getName());
    	ps.setString(2, cb.getEmail());
    	ps.setLong(3, cb.getPhone());
    	ps.setString(4, cb.getpWord());
    	k = ps.executeUpdate();
    }catch(Exception e) {
    	e.printStackTrace();
    }
    	return k;
    }
}
