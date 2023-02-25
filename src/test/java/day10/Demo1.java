package day10;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo1  {

	 static void printDups(String str)
	    {
		 LinkedHashMap<Character, Integer> count = new LinkedHashMap<>();
	        /*Store duplicates present
	        in the passed string */
	        for (int i = 0; i < str.length(); i++) {
	            if (!count.containsKey(str.charAt(i)))
	                count.put(str.charAt(i), 1);
	            else
	                count.put(str.charAt(i),
	                          count.get(str.charAt(i)) + 1);
	        }
	 
	        System.out.println(count);
	        
	    }
	    // Driver code
	    public static void main(String[] args)
	    {
	        String str = "test string";
	        printDups(str);
	    }
	
}
