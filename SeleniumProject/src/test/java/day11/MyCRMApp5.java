package day11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyCRMApp5 {

	@Test(description="This test is login to app")
	public void loginApp() {

		String str = "Selenium123";

		Assert.assertEquals("Selenium", str, "Tools name is matching");
	}

	@Test(description="This test is marks test")
	public void marksTest() {

		int marks = 80;

		Assert.assertEquals(990, marks, "score are not matching");
	}
	
	@Test(description="This test is tools")
	public void toolName() {

		String toolName = "Selenium";

		Assert.assertTrue(toolName.contains("selenium"));
	}


}
