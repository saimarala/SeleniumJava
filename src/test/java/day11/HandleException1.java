package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleException1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		try 
		{
			System.out.println("Enter number 1");
			int n1=sc.nextInt();

			System.out.println("Enter number 2");
			int n2=sc.nextInt();
			
			int result=n1/n2;
			
			System.out.println("Result is "+result);
			sc.close();
			
			System.out.println("Enter number 3");
			int n3=sc.nextInt();
			
			System.out.println("Number 3 is "+n3);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Hey Buddy please dont give zero - use positive numbers "+e.getMessage());
			e.printStackTrace();
		}
		catch (InputMismatchException e) {
			System.out.println("Hey Buddy its is calc please provide numbers not string");
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong - We are working on it "+e.getMessage());
		}
	
		
		
		System.out.println("Bye");
		
	}

}
