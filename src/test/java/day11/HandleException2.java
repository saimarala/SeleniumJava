package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleException2 {

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
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Hey Buddy please dont give zero - use positive numbers "+e.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Hey Buddy its is calc please provide numbers not string");
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong - We are working on it "+e.getMessage());
		}
		finally 
		{
			System.out.println("Closing the connection..........");
			sc.close();
			System.out.println("Connection closed");
			System.out.println("Bye");
		}
		
		
		
		
	}

}
