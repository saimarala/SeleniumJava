package day11;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExamples4 {

	public static void main(String[] args) {
		
		
		Map<Integer, String>m1=new LinkedHashMap<>();
		m1.put(10,"Sanjay");
		m1.put(15,"Zoya");
		m1.put(1, "Bimlesh");
		m1.put(5, "Aro");
		m1.put(5, "Aro");
	
		System.out.println("Map using LinkedHashMap"+m1);
		
		Map<Integer, String>m2=new TreeMap<>();
		
		m2.put(10,"Sanjay");
		m2.put(15,"Zoya");
		m2.put(1, "Bimlesh");
		m2.put(5, "Aro");
		m2.put(5, "Aro");
	
		System.out.println("Map using TreeMap"+m2);
		

	}

}
