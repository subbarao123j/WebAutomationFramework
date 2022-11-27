package day11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyCRMApp4 {
	
	@Test
	public void loginApp() {

	String str="Jenkins";
	
	if(str.contains("Jenkins")) {
		
		System.out.println("passed");
	}else {
		
		System.out.println("failed");
	}

	}
	


}
