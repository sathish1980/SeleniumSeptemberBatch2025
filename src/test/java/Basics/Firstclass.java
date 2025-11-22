package Basics;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firstclass {
	WebDriver driver; // open Edge browser
	
	public void launch()
	{
		driver = new ChromeDriver(); // open Edge browser
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.get("https://www.makemytrip.com/");
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//driver.close();
		//driver.quit();
		
		// locators
		
		
	}
	
	public void launchFB() throws InterruptedException
	{
		driver = new ChromeDriver(); // open Edge browser
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("sathish kumar");
		Thread.sleep(1000);
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));
		
		//fluent wait
		
		username.clear();
		driver.findElement(By.name("email")).sendKeys("after clear");
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.partialLinkText("password?")).click();
		driver.findElement(By.cssSelector("input#email")).sendKeys("test");
		//driver.findElement(By.cssSelector("div._6lux")).sendKeys("test1");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("test2");
		//driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy[name=\"email\"]")).sendKeys("wont work");
		//driver.findElement(By.cssSelector("")).sendKeys("nexttype");
		
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("BasicXpath");
		
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("BasicXpath");
		driver.findElement(By.xpath("//input[contains(@class,'_55r1') and @name='email']")).sendKeys("contains and AND");
		driver.findElement(By.xpath("//input[starts-with(@class,'in') and @name='email']")).sendKeys("starts-with");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		//driver.findElement(By.tagName("input")).sendKeys("after clear");
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("after clear CLASS");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Firstclass F = new Firstclass();
		F.launchFB();
	}

}
