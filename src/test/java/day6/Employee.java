package day6;

public class Employee {

	public static void main(String[] args) 
	{
		
		Employee narayan=new Employee();
		
		narayan.dev();
		
		narayan.automationEngg();
		
		narayan.devOpsEngg();

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
	}

}
