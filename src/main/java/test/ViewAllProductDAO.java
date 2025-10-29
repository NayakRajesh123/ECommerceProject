package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewAllProductDAO {
	ArrayList<ProductBean> al = new ArrayList<ProductBean>();
	public ArrayList<ProductBean> getViewAll(){
		try {
			Connection con = DBConnection.getConnection();
			
			ProductBean pb = new ProductBean();
			PreparedStatement ps = con.prepareStatement("select * from product");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				pb.setpCode(rs.getString(1));
				pb.setpName(rs.getString(2));
				pb.setpPrice(rs.getDouble(3));
				pb.setpStock(rs.getInt(4));
				al.add(pb);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return al;
	}
	
}
