package tw.org.iii.myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Brad91 {
	public static void main(String[] args) {
		
//		String sql = "INSERT INTO cust (cname,tel,birthday) VALUES ('brad3','123','1999-12-13')";
		String sql = "DELETE from cust WHERE id = 2";
//		String sql = "INSERT INTO cust (cname,tel,birthday) VALUES ('brad3','123','1999-12-13')";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
//			Connection conn = DriverManager.getConnection(
//					"jdbc:mysql://localhost/iii?user=root&password=root");
			
//			Connection conn = DriverManager.getConnection(
//					"jdbc:mysql://localhost/iii", "root","root");
			
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/iii", prop);
			
			Statement stmt = conn.createStatement();
			stmt.execute(sql);
			conn.close();
			
			System.out.println("OK");
		}catch(Exception se) {
			System.out.println(se.toString());
		}
		
	}
}
