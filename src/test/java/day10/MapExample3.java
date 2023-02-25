package day10;

import java.util.HashMap;
import java.util.Map;

public class MapExample3 {

	public static void main(String[] args) {
		
		Map<String, Object> s1=new HashMap<>();
		s1.put("name", "Mukesh");
		s1.put("status", false);
		s1.put("marks", 50.65);
		
		Map<String, Object> s2=new HashMap<>();

		s2.put("name", "Otwani");
		s2.put("status", true);
		s2.put("marks", 70);
	
		Map<String, Object> s3=new HashMap<>();
		
		s3.put("name", "Sonali");
		s3.put("status", true);
		s3.put("marks", 95.50);
		
		// Create one map which can accept key as integer and value as map
		Map<Integer, Map<String, Object>> allDetails=new HashMap<>();
		allDetails.put(1, s1);
		allDetails.put(2, s2);
		allDetails.put(3, s3);
		
		System.out.println(allDetails.get(2).get("status"));
		
		
		
		
		
		
		
		
		
		
		
	}

}
