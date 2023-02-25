package day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReading {

	public static void main(String[] args) {
		
		File myfile=new File("./properties/Config.properties");
		try 
		{
			FileInputStream fis=new FileInputStream(myfile);
			
			Properties pro=new Properties();
			
			pro.load(fis);
			
			System.out.println(pro.get("url"));
			System.out.println(pro.get("student"));
			System.out.println(pro.get("Raja"));
			
		} catch (FileNotFoundException e) 
		{
			System.out.println("Opps file is missing "+e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println("File operation not supported "+e.getMessage());
		}
		
		
		
		
		
		

	}

}
