package TestCase;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import BowserDriver.BrowserUtils;

public class MakeMyTripFlighBookingTestCase extends BrowserUtils {

	
	@BeforeSuite
	public void LauchThebrowser()
	{
		lauchTheBrowser("Chrome");
	}
	@Test(priority=0)
	public void ToVerifyLogin()
	{
		
		test = extent.createTest("ToVerifyLogin");
		test.log(Status.INFO, "Browser launched sucessfully");
		LaunchtheApplication("https://www.facebook.com/");
		test.log(Status.INFO, "URL Enter sucessfully");
		//CloseBrowser();
		//test.log(Status.INFO, "Browser closed sucessfully");
		test.log(Status.PASS, "test Pass");
	}
	@Test(priority=1)
	public void ToVerifyLogin2()
	{
		test = extent.createTest("ToVerifyLogin2");
		test.log(Status.INFO, "Browser launched sucessfully");
		LaunchtheApplication("https://www.facebook.com/");
		test.log(Status.INFO, "URL Enter sucessfully");
		CloseBrowser();
		test.log(Status.INFO, "Browser closed sucessfully");
		test.log(Status.PASS, "test Pass");
	}
	
	@AfterSuite
	public void Close() {
		ClosetheReport();
	}
}
