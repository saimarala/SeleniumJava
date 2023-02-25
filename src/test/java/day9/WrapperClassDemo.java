package day9;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		int a=10;
		System.out.println(a);
		
		Integer b=100;
		System.out.println(b);
		
		String price1="100";
		
		int a1=Integer.parseInt(price1);
		
		String price2="200";
		
		int b1=Integer.parseInt(price2);
		
		System.out.println(price1+price2);

		System.out.println(a1+b1);
	}

}
