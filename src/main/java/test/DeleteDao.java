package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteDao {
public int delete(String code)
{
	int k=0;
	try
	{
		Connection con=DBConnection.getConnection();
		PreparedStatement ps=con.prepareStatement("delete from product where pcode=?");
		ps.setInt(1, Integer.parseInt(code));
		k=ps.executeUpdate();
	}
	catch (Exception e)
	{
e.printStackTrace();
}
	return k;
	
}
}
