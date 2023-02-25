package day6;

public class Employee2 {

	public static void main(String[] args) 
	{
		
		Employee2 narayan=new Employee2();
		
		narayan.dev();
		
		Employee2.show();
		
	}
	
	public static void show()
	{
		
	}
	
	
	public void devOpsEngg()
	{
		System.out.println("I am into DevOps Role");
	}
	
	public void automationEngg()
	{
		System.out.println("I can automate test cases");
	}
	
	public void dev()
	{
		System.out.println("I can write code");
		
		devOpsEngg();
		
		automationEngg();
	}

}
