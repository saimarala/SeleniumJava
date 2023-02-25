package day11;

public class HandleException6 {

	public static void main(String[] args) {
		
		
		int age=21;
		
		if(age<18)
		{
			System.out.println("Not allowed");
			throw new ArithmeticException();
		}
		else
		{
			System.out.println("Welcome to the club");
		}
	
	}

}
