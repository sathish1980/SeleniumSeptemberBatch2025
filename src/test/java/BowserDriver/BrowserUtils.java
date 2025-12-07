package BowserDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BrowserUtils {

	public static WebDriver driver;
	public static ExtentSparkReporter htmlReporter;
	public static ExtentReports extent;
	//helps to generate the logs in test report.
	public static ExtentTest test;
	
	public static String Reportpath= System.getProperty("user.dir")+"\\Reports\\SeleniumSeptember2025.html";
	
	public static void lauchTheBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
		driver = new ChromeDriver(); // open Edge browser
		}
		else if(browserName.equalsIgnoreCase("Edge"))
		{
		driver = new EdgeDriver(); // open Edge browser
		}
		else
		{
			throw new ArithmeticException("Not  a valid browser");
		}
		OpenTheReport();
	}
	
	public static void OpenTheReport()
	{
		htmlReporter= new ExtentSparkReporter(Reportpath);
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	
	public void ClosetheReport()
	{
		extent.flush();
	}
	
	public void LaunchtheApplication(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void CloseBrowser() {
		//ClosetheReport();
		driver.quit();
	}
}
