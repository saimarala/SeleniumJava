package day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetExample2 {

	public static void main(String[] args) {
		
		List<String> studentNames=new ArrayList<>();
		studentNames.add("Narendra");
		studentNames.add("Narendra");
		studentNames.add("Sonali");
		studentNames.add("Jagadeesh");
		studentNames.add("Uma");
		studentNames.add("Uma");
		
		// 1st way
		HashSet<String> s1=new HashSet<>(studentNames);
		//System.out.println(s1);
		
		// Second way
		HashSet<String>s2=new HashSet<>();
		s2.addAll(s1);
		s2.add("Bimlesh");
		s2.add("Saurabh");
		System.out.println(s2);
		
	
		
		
		
		
		
		
	}

}
