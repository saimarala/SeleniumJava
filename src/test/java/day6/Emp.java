package day6;

public class Emp {

		String name;
		
		int empID;
		
		String email;
		
		
	public Emp(String empName,int employeeID,String emailID) 
	{
		System.out.println("Cons Called");
		
		name=empName;
		
		empID=employeeID;
		
		email=emailID;
	}
		
	
	public static void main(String[] args) 
	{	
		Emp emp1=new Emp("Manali",11,"manali@gmail.com");
		
		Emp emp2=new Emp("Rakesh",22,"rakesh@yahoo.com");
		
		Emp emp3=new Emp("Krupakar",33,"krupakar@rediffmail.com");
		
		//emp3.displayEmpInformation();
		
		System.out.println(emp1.empID);
		
		System.out.println(emp2.email);
		
		System.out.println(emp3.name);
		
		
		
		
	}
	
	public void displayEmpInformation()
	{
		System.out.println("Name is "+name);
		
		System.out.println("EmpID is "+empID);
	}
	
	
	public void login() 
	{
		System.out.println("Emp has to login");
	}
	
	public void logOut() 
	{
		System.out.println("Emp has to logout");
	}
	

}
