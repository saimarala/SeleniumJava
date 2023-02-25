package day4;

public class SwitchDemo2 {

	// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
	
	public static void main(String[] args) {
		
		String browser="Mukesh";
		
		switch(browser)
		{
		
		case "Chrome":
			System.out.println("Start Chrome Session");
			break;
		
		case "Firefox":
			System.out.println("Start FF Session");
			break;
			
		
		case "Safari":
			System.out.println("Start Safari Session");
			break;
			
		default:
			System.out.println("Please use Chrome , FF or Safari");
	
		}
		
		

	}

}
