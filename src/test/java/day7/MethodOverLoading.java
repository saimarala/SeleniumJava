package day7;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading obj1=new MethodOverLoading();

		obj1.add();
		
		obj1.add(15, 89);
		
		obj1.add(15, 7.5);
		
	}
	
	public void add()
	{
		System.out.println("I am in add method");
	}
	
	public void add(int x,int y)
	{
		int result=x+y;
		System.out.println(result);
	
	}
	
	public void add(double x,double y)
	{
		double result=x+y;
		System.out.println(result);
	
	}
	
	public void add(int x,double y)
	{
		double result=x+y;
		System.out.println(result);
	
	}
	
	public void add(double x,int y)
	{
		double result=x+y;
		System.out.println(result);
	
	}
	
}
