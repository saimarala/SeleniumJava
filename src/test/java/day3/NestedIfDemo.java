package day3;

public class NestedIfDemo {


	public static void main(String[] args) {
		
		int age=22;
		
		int marks=70;
		
		if(age>21)
		{
				if(marks>=80)
				{
					System.out.println("You are eligible for interview");
				}
				else
				{
					System.out.println("Sorry you are not eligible");
				}
			
		}
		else
		{
			System.out.println("Please apply after sometime- focus of study now");
		}
		
	
	}

}
