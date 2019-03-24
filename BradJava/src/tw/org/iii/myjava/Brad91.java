package tw.org.iii.myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Brad91 {
	public static void main(String[] args) {
		
//		String sql = "INSERT INTO cust VALUES (8,'brad3','123','1999-12-13')";
//		String sql = "INSERT INTO cust (cname,tel,birthday) VALUES ('brad3','123','1999-12-13')";
//		String sql = "DELETE from cust WHERE id = 2";
//		String sql = "UPDATE cust SET tel='789',birthday='1998-01-02' WHERE id=4";
		String sql = "SELECT * FROM cust";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
//			Connection conn = DriverManager.getConnection(
//					"jdbc:mysql://localhost/iii?user=root&password=root");
			
//			Connection conn = DriverManager.getConnection(
//					"jdbc:mysql://localhost/iii", "root","root");
			
			Properties prop = new Properties();
			prop.put("user", "brad");
			prop.put("password", "123456");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.202.104/iii", prop);
			
			Statement stmt = conn.createStatement();
			//stmt.execute(sql);
			
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				String id = rs.getString("id");
				String cname = rs.getString("cname");
				String tel = rs.getString("tel");
				String birthday = rs.getString("birthday");
				System.out.println(id + ":" + cname + ":" + tel + ":" + birthday);
			}
			
			
			conn.close();
			
			System.out.println("OK");
		}catch(Exception se) {
			System.out.println(se.toString());
		}
		
	}
}
