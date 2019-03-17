package tw.org.iii.myjava;

import java.util.HashMap;

public class Brad86 {

	public static void main(String[] args) {
		HashMap<String, Object> data = new HashMap<>();
		data.put("name", "Brad");
		data.put("gender", false);
		data.put("sound", true);
		data.put("stage", 4);
		
		System.out.println(data.get("name"));
		
		
	}

}
