package day11;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyCRMApp3 {
	@Test(priority=0)
	public void loginApp() {

		System.out.println("Login Done");
		Assert.assertEquals("Subbarao", "Subbarao");

	}
	@Test(dependsOnMethods = "loginApp")
	public void createUser() {
		
		System.out.println("User created");
	}

	@Test(dependsOnMethods = {"createUser","loginApp"})
	public void logOut() {

		System.out.println("User loggedout from the session");

	}


}
