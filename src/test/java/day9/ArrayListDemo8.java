package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo8 {

	public static void main(String[] args) {
	
		 
		 List<String> mentorsName=new ArrayList<>();
		 
		 mentorsName.add("Mukesh");
		 mentorsName.add("Hitesh");
		 mentorsName.add("Amresh");
		 mentorsName.add("Navin Reddy");
		 
		 System.out.println(mentorsName);
		 
		 System.out.println(mentorsName.remove(2));
		 
		 System.out.println(mentorsName);
		 
		 System.out.println(mentorsName.remove("Mukesh"));
		 
		 System.out.println(mentorsName);
		 
		 System.out.println(mentorsName.contains("Hitesh"));
		 
		 System.out.println(mentorsName.isEmpty());
		 
		 mentorsName.clear();
		
		 System.out.println(mentorsName);
		 
		 List<String> fewMoreMentors=Arrays.asList("Adarsh","Shilpa","Pranav","Kritika");
		 
		 // how to add new mentors in old list
		 
		 mentorsName.addAll(fewMoreMentors);
		 
		 //mentorsName.add(fewMoreMentors);
		 
		 
		 System.out.println(mentorsName);
		 
		 // Use for loop, foreach or use iterator pick values one by one from fewMoreMentors and add one by one in
		 // mentorsName list
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		

	}

}
