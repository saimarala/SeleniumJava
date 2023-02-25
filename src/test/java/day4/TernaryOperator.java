package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TernaryOperator {

	public static void main(String[] args) {
	
		int marks=36;
		
		String result=marks>35 ? "Pass":"Fail";
		
		System.out.println(result);
		Thread.currentThread().getId();
		

	}

}
