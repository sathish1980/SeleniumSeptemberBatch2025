package TestCase;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import BowserDriver.BrowserUtils;
import Pages.FlightSearchPage;
import Pages.FlightSearchResultPage;
import Utils.ExcelFileRead;
import Utils.PropertyFile;
import WebDriverCommonUtils.CommonUtility;
import junit.framework.Assert;

public class MakeMyTripFlighBookingTestCase extends BrowserUtils {

	private int count=0;
	@BeforeSuite
	public void LauchThebrowser()
	{
		lauchTheBrowser("Chrome");
	}
	
	@BeforeTest
	public void LaunchApplication() throws IOException
	{
		String url = PropertyFile.GetDataFromPropFile().getProperty("url");
		LaunchtheApplication(url);
	}
	@Test(priority=0)
	public void ToVerifyLogin() throws InterruptedException
	{
		/*
		 * Launch the browser and enter the url
		 * Select from location
		 * select to location
		 * select date
		 * Select traveller
		 * click on search
		 * verify the url display the selected from and to location and the selected date
		 */
		test = extent.createTest("To verify flight Search in MakeMy Trip");
		test.log(Status.INFO, "Browser launched sucessfully");
		test.log(Status.INFO, "URL Enter sucessfully");
		FlightSearchPage FS = new FlightSearchPage(Browser);
		FS.ClosePopup();
		Thread.sleep(5000);
		FS.SelectFromDropdown("MAA");
		test.log(Status.INFO, "From Location is Selected");
		FS.SelectToDropdown("PNQ");
		test.log(Status.INFO, "TO Location is Selected");
		FS.SelectDate("24");
		test.log(Status.INFO, "Date is Selected");
		FS.SelectTraveller(3);
		test.log(Status.INFO, "Traverller is Selected with Adults");
		///Thread.sleep(4000);
		FS.clickOnSearchbutton();
		test.log(Status.INFO, "Search buttin is clicked");
		Thread.sleep(4000);
		FlightSearchResultPage FSR = new FlightSearchResultPage(Browser);
		
		String currentUrl = FSR.GetCurrentURL(Browser);
		System.out.println(currentUrl);
		String GetActualFromLocation = FSR.GetDetailsFromURL(currentUrl,"From");
		String GetActualToLocation = FSR.GetDetailsFromURL(currentUrl,"To");
		String GetActualdate = FSR.GetDetailsFromURL(currentUrl,"Date");
		
		Assert.assertEquals(GetActualFromLocation, "MAA");
		Assert.assertEquals(GetActualToLocation, "PNQ");
		Assert.assertEquals(GetActualdate, "24");
		//CloseBrowser();
		//test.log(Status.INFO, "Browser closed sucessfully");
	}
	@Test(priority=1)
	public void ToVerifySameCityError() throws InterruptedException
	{
		test = extent.createTest("To verify Same From and To location in Makemy Trip");
		test.log(Status.INFO, "Browser launched sucessfully");
		Browser.navigate().back();
		FlightSearchPage FS = new FlightSearchPage(Browser);
		FS.SelectFromDropdown("MAA");
		test.log(Status.INFO, "From Location is Selected");
		FS.SelectToDropdown("MAA");
		test.log(Status.INFO, "TO Location is Selected");
		Thread.sleep(1000);
		String GetActualErrormessage= FS.GetSameCityError();
		String ExpectedErrorMessage="From & To airports cannot be the same";
		Assert.assertEquals(GetActualErrormessage, ExpectedErrorMessage);
		//CloseBrowser();
		test.log(Status.INFO, "Browser closed sucessfully");
	}
	
	@Test(priority=2,dataProvider="GetValidSearchTestData",dataProviderClass=DataProviderDetails.class)
	public void ToVerifyFlightSearchWithParameteriation(String from,String to,String date) throws InterruptedException
	{
		/*
		 * Launch the browser and enter the url
		 * Select from location
		 * select to location
		 * select date
		 * Select traveller
		 * click on search
		 * verify the url display the selected from and to location and the selected date
		 */
		test = extent.createTest("ToVerifyFlightSearchWithParameteriation");
		FlightSearchPage FS = new FlightSearchPage(Browser);
		//FS.ClosePopup();
		//Thread.sleep(5000);
		FS.SelectFromDropdown(from);
		test.log(Status.INFO, "From Location is Selected: "+from);
		FS.SelectToDropdown(to);
		test.log(Status.INFO, "TO Location is Selected: "+to);
		FS.SelectDate(date);
		test.log(Status.INFO, "Date is Selected: "+date);
		FS.SelectTraveller(3);
		test.log(Status.INFO, "Traverller is Selected with Adults");
		///Thread.sleep(4000);
		FS.clickOnSearchbutton();
		test.log(Status.INFO, "Search button is clicked");
		Thread.sleep(4000);
		FlightSearchResultPage FSR = new FlightSearchResultPage(Browser);
		String currentUrl = FSR.GetCurrentURL(Browser);
		System.out.println(currentUrl);
		String GetActualFromLocation = FSR.GetDetailsFromURL(currentUrl,"From");
		String GetActualToLocation = FSR.GetDetailsFromURL(currentUrl,"To");
		String GetActualdate = FSR.GetDetailsFromURL(currentUrl,"Date");
		
		Assert.assertEquals(GetActualFromLocation, from);
		Assert.assertEquals(GetActualToLocation, to);
		Assert.assertEquals(GetActualdate, date);
		Browser.navigate().back();
		//CloseBrowser();
		//test.log(Status.INFO, "Browser closed sucessfully");
	}
	
	@Test(priority=3,dataProvider="GetSameCitySearchTestData",dataProviderClass=DataProviderDetails.class)
	public void ToVerifySameCityErrorwithParameterized(String from, String to) throws InterruptedException
	{
		test = extent.createTest("To verify Same From and To location in Makemy Trip with param");
		FlightSearchPage FS = new FlightSearchPage(Browser);
		FS.SelectFromDropdown(from);
		test.log(Status.INFO, "From Location is Selected: "+from);
		FS.SelectToDropdown(to);
		test.log(Status.INFO, "TO Location is Selected: "+to);
		Thread.sleep(1000);
		String GetActualErrormessage= FS.GetSameCityError();
		String ExpectedErrorMessage="From & To airports cannot be the same";
		Assert.assertEquals(GetActualErrormessage, ExpectedErrorMessage);
		
	}
	
	
	
	@AfterSuite
	public void Close() {
		ClosetheReport();
	}
	
	@AfterMethod
	public void WriteInReport(ITestResult result) throws IOException
	{	
		count=count+1;
		CommonUtility WebelementCommons = new CommonUtility();
		if (result.getStatus()==ITestResult.SUCCESS) {
			String filePath = WebelementCommons.GetScreenshot(Browser,result.getName()+count);
		     test.log(Status.INFO,test.addScreenCaptureFromPath(filePath).toString());
            test.log(Status.PASS,"Test Method named as : "+ result.getName()+" is passed");

        }else if(result.getStatus()==ITestResult.FAILURE) {
            test.log(Status.PASS,"Test Method named as : "+ result.getName()+" is FAILED");
            String filePath = WebelementCommons.GetScreenshot(Browser,result.getName()+count);
            test.log(Status.INFO,test.addScreenCaptureFromPath(filePath).toString());
            test.log(Status.FAIL,"Test failure : "+ result.getThrowable());
        }
        else if(result.getStatus()==ITestResult.SKIP) {
            test.log(Status.SKIP,"Test Method named as : "+ result.getName()+" is skipped");
        }
//		/Browser.navigate().back();
	}
	
}
