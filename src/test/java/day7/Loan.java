package day7;

public class Loan extends Calc 
{
	public Loan()
	{
		System.out.println("Child Class Cons");
	}
	
	public static void main(String[] args) {
		

		Loan l1=new Loan();
		
		l1.calHomeLoan();
		
		l1.calPersonaLoan();
		
		l1.div();
		
		l1.sum();
		
		System.out.println("*******************************");
		
		Calc l2=new Calc();
		
		l2.div();
		
		l2.sum();
		
		System.out.println("*******************************");
		
		Calc l3=new Loan();
		
		l3.div();
		
		l3.sum();
		
		
		
		
		System.out.println("*******************************");
		
		//Loan l4=new Calc();
		
		
		
		
		
		
	}
	
	
	public void calPersonaLoan()
	{
		System.out.println("Personal Loan Calc");
	}
	
	public void calHomeLoan()
	{
		System.out.println("Home Loan Calc");
	}

}
