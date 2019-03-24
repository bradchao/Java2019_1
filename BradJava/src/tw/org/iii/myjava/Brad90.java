package tw.org.iii.myjava;

public class Brad90 {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("OK");
		}catch(Exception e) {
			System.out.println("Driver Not Found");
		}
		
		
	}

}
