package day7;

public class Students {
	
	
	public Students()
	{
		System.out.println("I am in default cons");
	}
	
	public Students(String name,int id,long phone)
	{
		System.out.println("Details are "+name +" "+id+" "+phone);
	}
	
	public Students(String name,int id)
	{
		System.out.println("Details are "+name +" "+id);
	}
	
	public Students(int id,String name)
	{
		System.out.println("Details are "+name +" "+id);
	}
	

	public static void main(String[] args) {
		
		Students s1=new Students(45,"Marko");
				
		//Student saranya=new Students("Java","Selenium");
	}
	

}
