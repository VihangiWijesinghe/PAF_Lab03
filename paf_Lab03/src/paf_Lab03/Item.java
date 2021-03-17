package paf_Lab03;

import java.sql.*;

public class Item {
	
	public static Connection connect() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "");
			
			System.out.println("successfully connected");
		} catch ( Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}

}
