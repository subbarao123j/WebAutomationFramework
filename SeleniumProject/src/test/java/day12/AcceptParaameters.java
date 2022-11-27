package day12;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class AcceptParaameters {
	
	@Parameters({"browser","url","session"})
	@Test
	public void startTest(String browserName, String appURL, String sessionName) 
	
	{
		System.out.println("Running test on " + browserName+ " " + appURL+" "+sessionName);
		
		
	}
	
	
	

}
