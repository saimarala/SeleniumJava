package day9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo7 {

	public static void main(String[] args) {
		
		 //List<String> mentors=Arrays.asList("Mukesh","Hitesh","Amresh","Navin Reddy");
		
		 //List<Integer> ids=Arrays.asList(10,50,89,100);
		
		 
		 List<String> mentorsName=new ArrayList<>();
		 mentorsName.add("Mukesh");
		 mentorsName.add("Hitesh");
		 mentorsName.add("Amresh");
		 mentorsName.add("Navin Reddy");
		 
		 // 1-for loop
		/* for(int i=0;i<mentorsName.size();i++)
		 {
			 System.out.println(mentorsName.get(i));
		 }
		*/
		 
		//2- forEach
		/* for(String names:mentorsName)
		 {
			 System.out.println(names);
		 }
		 */
		 
		 //3- iterator
		 Iterator<String> itr=mentorsName.iterator();
		 
		 while(itr.hasNext())
		 {
			 String names=itr.next();
			 
			 System.out.println(names);
			 
			 
			 
		 }
		 
	}

}
