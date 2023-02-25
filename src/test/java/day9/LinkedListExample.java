package day9;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> myList=new LinkedList<>();
		
		myList.add("Aro");
		myList.add("Aro");
		myList.add("Marko");
		myList.add("Dopa");
		myList.add("Jim");

		System.out.println(myList);
		
		myList.addFirst("Avishek");
		
		System.out.println(myList);
		
		myList.addLast("Raveesh");
		
		System.out.println(myList);
		
		myList.removeFirst();
		
		System.out.println(myList);
		
		
		
		
	}

}
