package test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class AdminDao 
{
public int register(AdminBean ab)
{
	int k=0;

try
{
Connection con=DBConnection.getConnection();
PreparedStatement ps=con.prepareStatement("INSERT INTO ADMIN VALUES(?, ?, ?, ?)");
ps.setString(1, ab.getName());
ps.setString(2, ab.getEmail());
ps.setString(3, ab .getPhone());
ps.setString(4, ab.getPassword());

k=ps.executeUpdate();

}
catch(Exception e)
{
	e.printStackTrace();
}
return k;
}
}
