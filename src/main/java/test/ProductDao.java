package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

public class ProductDao {

public int addProduct(ProductBean pb)
{
	int k=0;
	try
	{
	Connection con = DBConnection.getConnection();
	PreparedStatement ps=con.prepareStatement("Insert into product values(?, ?, ?, ?)");
	ps.setString(1, pb.getpCode());
	ps.setString(2, pb.getpName());
	ps.setDouble(3, pb.getpPrice());
	ps.setInt(4,pb.getpStock());
	
	 k=ps.executeUpdate();
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
		
	}
	return k;
	
}
public static Product getProductByCode(String code) {
	
	return null;
}
public static void updateQuantity(String code, int i) {
	
	

}
public static List<Product> getAllProducts() {
	return null;
}
public static boolean updateProduct(Product p) {

	return false;
}
public int delete(String parameter) {
	
	return 0;
}
}

