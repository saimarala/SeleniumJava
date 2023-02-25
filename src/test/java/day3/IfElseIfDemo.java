package day3;

public class IfElseIfDemo {

	public static void main(String[] args) {
		
		String name="Prashar";
		
		System.out.println(name);

		System.out.println("Shukla ji");
		
		int mark=-5;
		
		if(mark>90)
		{
			System.out.println("A++ Grade");
		
		}
		else if(mark<=90 && mark>=80)
		{
			System.out.println("A Grade");
		}
		else if(mark<80 && mark>=60)
		{
			System.out.println("B Grade");
		}
		else if(mark<60 && mark>=35)
		{
			System.out.println("C Grade");
		}
		else if(mark<35)
		{
			System.out.println("Fail");
		}
		
		
		
	
	}

}
