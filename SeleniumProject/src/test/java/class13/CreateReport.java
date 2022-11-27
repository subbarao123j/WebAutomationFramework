package class13;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class CreateReport {
	
	@Test
	public void createReport() throws IOException {
		
		//File location
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("selennium2.html");
		//Report object
		ExtentReports report = new ExtentReports();
		report.attachReporter(reporter);
		
		ExtentTest test1 = report.createTest("Search product");
		test1.pass("Product search is done");
		report.flush();
		
		
		ExtentTest test2 = report.createTest("Add to Cart ");
		test2.info("Cart added");
		test2.pass("Add to Cart is done");
		report.flush();
		
		ExtentTest test3 = report.createTest("Paaayment vaalidiation");
		test3.info("Cart details added");
	
		test3.fail("Card not valiid", MediaEntityBuilder.createScreenCaptureFromPath("C:\\ammavaru.jpg").build());
		report.flush();
		
	}

}
