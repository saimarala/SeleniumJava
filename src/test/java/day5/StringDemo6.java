package day5;

public class StringDemo6 {

	public static void main(String[] args) 
	{
		
		String msg="The Price is 12500 INR";
		
		//Explore 5 more method of String class
	
		String arr[]=msg.split(" ");
		
		System.out.println(arr.length);
		
		System.out.println(arr[arr.length-2]);
		
		System.out.println(arr[3]);
	
		int price=Integer.parseInt(arr[3]);
		
		if(price==12500)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		
	}

}
