package day6;

public class Calc2 {

	public static void main(String[] args) 
	{	
		
		
		
		Calc2 obj1=new Calc2();
		
		int s1=obj1.sum(12, 15);
		
		int s2=obj1.sub(15, 5);
		
		int s3=obj1.mul(10, 10);
		
		int s4=obj1.div(15, 3);
		
		String name=obj1.getName("Mukesh", "Otwani");
		
		System.out.println("Name is "+name);
		
		System.out.println("Sum is "+s1);
		
		System.out.println("Sub is "+s2);
		
		System.out.println("Mul is "+s3);
		
		System.out.println("Div is "+s4);
	
	}
	
	public String getName(String fname,String lName)
	{
		String result=fname+" "+lName;
		
		return result;
	}
	

	public int sum(int n1,int n2)
	{
		int result=n1+n2;
		
		return result;
	}
	
	public int sub(int n1,int n2)
	{
		int result=n1-n2;
		
		return result;
	}
	
	public int mul(int n1,int n2)
	{
		int result=n1*n2;
		
		return result;
	}
	
	public int div(int n1,int n2)
	{
		int result=n1/n2;
		
		return result;
	}
	
	
	
}
