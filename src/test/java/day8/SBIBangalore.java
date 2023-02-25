package day8;

public class SBIBangalore implements SBI{

	public static void main(String[] args) {
		
		RBI obj1=new SBIBangalore();
		
		obj1.deposit();
		
		obj1.withdraw();
		
		System.out.println("**********************");
		
		SBI obj2=new SBIBangalore();
		
		obj2.deposit();
		
		obj2.loan();
		
		obj2.withdraw();
		
		System.out.println("**********************");
		
		SBIBangalore obj3=new SBIBangalore();
		
		obj3.deposit();
		
		obj3.goldLoan();
		
		obj3.withdraw();
		
		
		
		
	}

	public void loan()
	{
		System.out.println("SBI Bangalore Provides Loans");
	}
	
	public void deposit() {
		System.out.println("SBI also provides deposit fac");
	}

	public void withdraw() {
		
		System.out.println("SBI also provides With fac");
	}

	public void goldLoan()
	{
		System.out.println("SBI Provides gold loan");
	}

}
