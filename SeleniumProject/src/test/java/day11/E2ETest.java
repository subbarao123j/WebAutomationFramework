package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class E2ETest {

	WebDriver driver;

	@BeforeClass
	public void setup() {

		System.out.println("=======================Running before Claass=============");

		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println("=======================browser and application is up and running============");

	}

	@AfterClass
	public void tearDown() {

		System.out.println("=============Running after class===============");

		driver.quit();
		System.out.println("===============Closed all instances==============");

	}

	@Test(description = "Login to CRM with admin")
	public void loginApp() throws InterruptedException {

		Assert.assertTrue(driver.getTitle().contains("OrangeHRM"), "Paage Title is not verified");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("admin123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		Thread.sleep(3000);
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "LogiinFailed");
		Thread.sleep(3000);

	}

	@Test(description = "Logout from CRM ", dependsOnMethods = "loginApp")
	public void logoutApp() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(ByXPath.xpath("//img[@class='oxd-userdropdown-img']")).click();

		Thread.sleep(3000);
		driver.findElement(ByXPath.xpath("//a[text()='Logout']")).click();
		Thread.sleep(3000);
		Assert.assertTrue(driver.getTitle().contains("OrangeHRM"), "Paage Title is not verified");

	}

}
