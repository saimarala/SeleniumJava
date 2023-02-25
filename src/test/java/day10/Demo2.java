package day10;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		
		List<Integer> l1=new ArrayList<>();
		l1.add(10);
		l1.add(100);
		l1.add(1000);
		l1.add(10000);
		
		l1.remove(new Integer(10));
		
		System.out.println(l1);

	}

}
