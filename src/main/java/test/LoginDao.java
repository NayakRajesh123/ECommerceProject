package test;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
public static AdminBean validate(String name,String password)
{
	AdminBean ab=null;
	
	try {
		Connection con=DBConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from admin where name=? and password=?");
		ps.setString(1, name);
		ps.setString(2, password);
		
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
		ab=new AdminBean();
		ab.setName(rs.getString(1));
		ab.setEmail(rs.getString(2));
		ab.setPhone(rs.getString(3));
		ab.setPassword(rs.getString(4));
		}
		
	
	} 
	catch (Exception e) {
		e.printStackTrace();
	}
	return ab;
}

public static void login(String name, String password)
{
	
}
}
