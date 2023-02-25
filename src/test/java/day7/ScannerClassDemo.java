package day7;

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Please enter number 1");
		
		int n1=sc.nextInt();
		
		System.out.println("Please enter number 2");
		
		int n2=sc.nextInt();
		
		System.out.println("Please enter number 3");
	
		int n3=sc.nextInt();
		
		int result=n1+n2+n3;
		
		System.out.println("Result is "+result);
		
		sc.close();
	
	}

}
