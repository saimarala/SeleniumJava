package day10;

import java.util.HashMap;

public class MapExample1 {

	public static void main(String[] args) {
		
		HashMap<Integer, String> m1=new HashMap<>();
		m1.put(1, "Parashar");
		m1.put(11, "Aro");
		m1.put(21, "Dapo");
		m1.put(31, "Marko");
		
		System.out.println(m1);
		
		System.out.println(m1.get(11));
		
		System.out.println(m1.get(41));
		
		System.out.println(m1.containsKey(31));
		
		System.out.println(m1.containsKey(51));
		
		System.out.println(m1.containsValue("marko"));
		
		System.out.println(m1.size());
		System.out.println(m1.remove(21));
		System.out.println(m1.size());
		

	}

}
