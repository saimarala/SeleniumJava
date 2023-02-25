package day11;

public class HandleException3 {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		try 
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println("Exception in main thread "+e.getMessage());
		}
		
		
		System.out.println("End");
		
	}

}
