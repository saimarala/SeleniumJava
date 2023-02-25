package day6;

public class Calc {

	public static void main(String[] args) {
		
		Calc obj1=new Calc();
		
		obj1.sum(12, 15);
		
		obj1.sub(15, 5);
		
		obj1.mul(10, 10);
		
		obj1.div(15, 3);
		
	}
	
	public void sum(int n1,int n2)
	{
		int result=n1+n2;
		
		System.out.println("Sum is "+result);
	}
	
	public void sub(int n1,int n2)
	{
		int result=n1-n2;
		
		System.out.println("Sub is "+result);
	}
	
	public void mul(int n1,int n2)
	{
		int result=n1*n2;
		
		System.out.println("Mul is "+result);
	}
	
	public void div(int n1,int n2)
	{
		int result=n1/n2;
		
		System.out.println("Div is "+result);
	}
	
	
	
}
