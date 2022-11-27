package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Login {

	WebDriver driver;
	
	public Login(WebDriver ldriver) {
		
		this.driver=ldriver;
	}
	

	@FindBy(name ="username") 	WebElement username;
	
	@FindBy(name = "password")	WebElement password;
	
	@FindBy(xpath =  "//button[@type='submit']") WebElement login;
	
	
	public void validateHomePage() {

		Assert.assertTrue(driver.getCurrentUrl().contains("facebook"), "Home page doesnot appear");

	}

	public void enterUserName() {

		System.out.println("Log Info usernaame entered");

		username.sendKeys("subba1234j");

	}

	public void enterPassword() {

		System.out.println("Log Info Password entered");

		password.sendKeys("Srivani@1516");

	}

	public void clickLoginButton() {

		System.out.println("Log Info login entered");

		login.click();

	}

}
