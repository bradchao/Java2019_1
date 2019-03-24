package tw.org.iii.myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Brad92 {
	public static void main(String[] args) {
		
		String sql = "INSERT INTO cust (cname,tel,birthday) VALUES (?,?,?)";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Properties prop = new Properties();
			prop.put("user", "brad");
			prop.put("password", "123456");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://192.168.202.104/iii", prop);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			for (int i=0; i<10; i++) {
				pstmt.setString(1, "brad" + (int)(Math.random()*100));
				pstmt.setString(2, "0912-123456");
				pstmt.setString(3, "1999-02-03");
				pstmt.executeUpdate();
			}
			
			conn.close();
			
			System.out.println("OK");
		}catch(Exception se) {
			System.out.println(se.toString());
		}
		
	}
}
