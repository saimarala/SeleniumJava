package day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetExample3 {

	public static void main(String[] args) {
		
		HashSet<String> s1=new HashSet<>();
		s1.add("Prachi");
		s1.add("Shalini");
		s1.add("Priya");
		s1.add("Ritika");
		
		// I want to access all set values in index manner, is this possible then how?
		List<String> l1=new ArrayList<>(s1);
		System.out.println(l1);
		System.out.println(l1.get(2));
		
		
		
		
		
	}

}
