package day11;

import org.testng.annotations.Test;

public class MyCRMApp2 {
	@Test(priority=1)
	public void logiinApp() {

		System.out.println("Login Done");

	}

	@Test(priority=2)
	public void createuser() {

		System.out.println("User created");

	}

	@Test(priority=3)
	public void deleteUser() {

		System.out.println("User deleted");

	}
	@Test(priority=4)
	public void logOut() {

		System.out.println("User loggedout from the session");

	}


}
