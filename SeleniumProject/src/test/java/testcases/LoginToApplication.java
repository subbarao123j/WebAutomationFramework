package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.LogOut;
import pages.Login;

public class LoginToApplication {
	
	@Test
	public void loginToHRM() {
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);

		

		System.out.println(driver.getTitle());
		
		Login login =PageFactory.initElements(driver, Login.class);
		
		
		LogOut logout =PageFactory.initElements(driver, LogOut.class);
		
		//login.validateHomePage();
		
		login.enterUserName();
		login.enterPassword();
		login.clickLoginButton();
		
		
		logout.clickLogout();
		
		
		 
	}

}
