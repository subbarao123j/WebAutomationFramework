package day12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfigFiile {
	
	@Test	
	public void reaadConfig()  {
		
		File src = new File("./Config/env.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			
			Properties pro = new Properties();
			
			pro.load(fis);
			
			
			
			System.out.println(pro.get("username"));
			System.out.println(pro.get("tool"));
			System.out.println(pro.get("trainer"));
			System.out.println(pro.get("sfdfd"));
			
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File could not locate"+e.getMessage());
		}
		
		catch (IOException e) {
			System.out.println("File could not locate"+e.getMessage());
		}
		
		
	}

}
