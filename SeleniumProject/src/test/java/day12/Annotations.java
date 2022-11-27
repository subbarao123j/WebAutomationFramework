package day12;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations {

	@BeforeSuite
	public void setupReport() {

		System.out.println("Setup Report");

	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("Flush report");

	}

	@BeforeMethod
	public void setupBrowser() {

		System.out.println("Starting browser");

	}

	@AfterMethod
	public void closeBrowser() {

		System.out.println("Closing browser");

	}

	@Test
	public void login() {

		System.out.println("Login to aapplication");
 
	}
	@Test
	public void login2() {

		System.out.println("Login to aapplication");

	}
	@Test
	public void login3() {

		System.out.println("Login to aapplication");

	}

}
