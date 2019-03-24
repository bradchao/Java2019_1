package tw.org.iii.myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Brad91 {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost/iii?user=root&password=root");
			
			Statement stmt = conn.createStatement();
			stmt.execute("INSERT INTO cust (cname,tel,birthday) VALUES ('brad','123','1999-12-13')");
			conn.close();
			
			System.out.println("OK");
		}catch(Exception se) {
			System.out.println(se.toString());
		}
		
	}
}
