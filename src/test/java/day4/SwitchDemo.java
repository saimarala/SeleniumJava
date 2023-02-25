package day4;

public class SwitchDemo {

	public static void main(String[] args) {
		
			int day=5;
		
			switch (day) 
			{
			case 1:
				System.out.println("Monday");
				break;
				
			case 2:
				System.out.println("Tuesday");
				break;
				
			case 3:
				System.out.println("Wed");
				break;
				
			case 4:
				System.out.println("Thurs");
				break;
				
			case 5:
				System.out.println("Friday");
				break;
					
			case 6:
				System.out.println("Sat");
				break;
				
			case 7:
				System.out.println("Sun");
				break;
			
			default:
				System.out.println("Please provide num from 1-7");
				//break;
			}

	}

}
