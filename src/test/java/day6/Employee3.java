package day6;

public class Employee3 {

	public static void main(String[] args) 
	{
		Employee3 narayan=new Employee3();
		
		narayan.dev();
		
		Employee3 jagadeesh=new Employee3();
		
		jagadeesh.automationEngg();
		
		Employee3 shalini=new Employee3();
		
		shalini.devOpsEngg();
	
		Employee3 uma=new Employee3();
		
		uma.projectManager();
		
	}
		
	public void projectManager()
	{
		System.out.println("I am into PM ROle");
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
