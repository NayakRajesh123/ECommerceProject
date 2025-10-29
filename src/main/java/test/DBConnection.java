package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	public static  Connection con=null;
	static {
		try {
			Class.forName(DbInfo.DB_CLASSNAME);
			con=DriverManager.getConnection(DbInfo.DB_URL,DbInfo.DB_USER_NAME,DbInfo.DB_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return con;
	}

}
