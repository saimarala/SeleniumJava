package day10;

import java.util.Set;
import java.util.TreeSet;

public class SetExample6 {

	public static void main(String[] args) {
		
		Set<Integer>s1=new TreeSet<>();
		s1.add(200);
		s1.add(10);
		s1.add(18);
		s1.add(100);
		s1.add(300);
		s1.add(500);
		//s1.add(null);
		//s1.add(null);
		
		System.out.println(s1);
		
		Set<String>s2=new TreeSet<>();
		s2.add("zoya");
		s2.add("Akhtar");
		s2.add("salman");
		s2.add("sujata");
		
		System.out.println(s2);
		
	
	}

}
