package day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReading2 {

	public static void main(String[] args) {
		
		try 
		{
			Properties pro=new Properties();
			
			pro.load(new FileInputStream(new File("./src/test/resources/Config.properties")));
			
			System.out.println(pro.get("url"));
	
			
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
