package tw.org.iii.myjava;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.JSONArray;
import org.json.JSONObject;

public class Brad81 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelFood.aspx");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			String line; StringBuffer sb = new StringBuffer();
			while ( (line = reader.readLine()) != null) {
				sb.append(line);
			}
			reader.close();

			//System.out.println(sb.toString());
			
			parseJSON(sb.toString());
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	
	static void parseJSON(String json) {
		try {
			JSONArray root = new JSONArray(json);
			System.out.println(root.length());
			for (int i=0; i<root.length(); i++) {
				JSONObject row = root.getJSONObject(i);
				String id = row.getString("ID");
				String name = row.getString("Name");
				System.out.println(id + ":" + name);
			}
			
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}
	

}
