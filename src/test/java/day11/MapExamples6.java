package day11;

import java.util.HashMap;
import java.util.Map;

public class MapExamples6 {

	public static void main(String[] args) {
		
		
		Map<Integer, String>m1=new HashMap<>();
		m1.put(10,"Sanjay");
		m1.put(15,"Zoya");
		m1.put(1, "Bimlesh");
		m1.put(5, "Aro");
	
		System.out.println(m1.keySet());
	
		System.out.println(m1.values());
		
		System.out.println(m1.containsKey(1));
		
		

	}

}
