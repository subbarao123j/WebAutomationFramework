package day10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstmaveprogram {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"./drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/");
		
		
	}

}
