package day8;

public abstract class LoanCalc implements Calc{

	public static void main(String[] args) 
	{
		//System.out.println(Calc.a);
		//LoanCalc obj1=new LoanCalc();		
	}
	
	public void add() {
		
		System.out.println("User can add");
	}

	
	public void sub() {
		System.out.println("User can sub");
		
	}

	
	public void div() {
		
		System.out.println("User can divide");
	}

	public abstract void mul();
	

}
