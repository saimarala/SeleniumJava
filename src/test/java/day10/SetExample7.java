package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetExample7 {

	public static void main(String[] args) {
		
		List<List<Integer>> allList=new ArrayList<>();
		
		List<Integer> l1=Arrays.asList(10,20,30);
		
		List<Integer> l2=Arrays.asList(45,55,65);
		
		List<Integer> l3=Arrays.asList(49,59,79);
		
		allList.add(l1);
		
		allList.add(l2);
		
		allList.add(l3);
		
		//sSystem.out.println(allList);
		
		System.out.println(allList.get(1).get(2));
		
		
		
	
	}

}
