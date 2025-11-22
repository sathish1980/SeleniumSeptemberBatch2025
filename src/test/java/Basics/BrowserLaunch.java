package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	
	public static WebDriver driver;
	public static void lauchTheBrowser(String url)
	{
		driver = new ChromeDriver(); // open Edge browser
		driver.get(url);
		driver.manage().window().maximize();
	}

}
