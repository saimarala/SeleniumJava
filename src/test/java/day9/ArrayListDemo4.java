package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		
		Employee emp1=new Employee(100, "Uma", "uma@gmail.com");
		
		Employee emp2=new Employee(101, "Balaji", "Balaji@gmail.com");
		
		Employee emp3=new Employee(102, "Bimlesh", "Bimlesh@gmail.com");
		
		ArrayList<Employee> myEmpList=new ArrayList<>();
		myEmpList.add(emp1);
		myEmpList.add(emp2);
		myEmpList.add(emp3);
		
		System.out.println(emp3.emailID);
		
		System.out.println(myEmpList.get(2).emailID);
		
		
		List<Employee> l1=Arrays.asList(emp1,emp2,emp3);
		
		

	}

}
