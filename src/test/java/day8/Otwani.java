package day8;

public class Otwani extends Krishna{

	public static void main(String[] args) {
		
		Otwani o1=new Otwani();
		
		o1.hello();
		
		Krishna o2=new Krishna();
		
		o2.hello();
		
		Krishna o3=new Otwani();
		
		o3.hello();

	}
	
	public void hello()
	{
		System.out.println("Hello from Mukesh");
	}


}
