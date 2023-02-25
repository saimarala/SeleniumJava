package day9;

import java.util.ArrayList;

public class ArraylistDemo2 {

	/*
	 *  Collection will take wrapper classes
	 *  
	 *  int - Integer
	 *  double- Double
	 *  char - Charactor
	 *  float - Float
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		//ArrayList obj1=new ArrayList();
		
		ArrayList<String> automationTools=new ArrayList<>();
		
		automationTools.add("Selenium");
		
		automationTools.add("Java");
		
		automationTools.add("Java");
		
		automationTools.add("Jenkins");
		
		System.out.println(automationTools);
		
		ArrayList<Integer> marks=new ArrayList<>();
		marks.add(10);
		marks.add(20);
		System.out.println("List with Integer "+marks);
		
		ArrayList<Double> marksNew=new ArrayList<>();
		marksNew.add(10.20);
		marksNew.add(15.59);
		System.out.println("List with Double "+marksNew);
		
		
		
		
		
		
		
		
		
		
		

	}

}
