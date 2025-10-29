package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DisplayProduct {
	public static ResultSet ViewAllProduct()
	{
		Connection con=DBConnection.getConnection();
		ResultSet res=null;
		try 
		{
			PreparedStatement pstmt=con.prepareStatement("select * from product");
			
			res=pstmt.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
		
		
	}

}
