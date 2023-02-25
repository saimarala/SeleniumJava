package day11;

import java.util.Map;
import java.util.TreeMap;

public class MapExamples5 {

	public static void main(String[] args) {
	
		Map<Integer, String>m1=new TreeMap<>();
		m1.put(10,"Sanjay");
		m1.put(15,"Zoya");
		m1.put(1, "Bimlesh");
		m1.put(5, "Aro");
		m1.put(null, "Mukesh");
		m1.put(20,null);
	
		System.out.println("Map using LinkedHashMap"+m1);
		
		
		

	}

}
