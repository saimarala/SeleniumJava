package day8;

import java.util.ArrayList;

public class CollectionsDemo {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		ArrayList list1=new ArrayList();
		
		list1.add(12);
		list1.add(12);
		list1.add(12.56);
		list1.add("Manali");
		list1.add("Sanjay");
		list1.add('a');
		list1.add(false);
		
		System.out.println(list1);
		
		System.out.println(list1.get(2));
		
		System.out.println("End");
		
		ArrayList list2=new ArrayList();
		list2.add("Selenium");
		list2.add("Java");
		list2.add("TestNG");
		
		list1.addAll(list2);
		
		System.out.println(list1);
		
		list1.remove(3);
		
		System.out.println(list1);
		

	}

}
