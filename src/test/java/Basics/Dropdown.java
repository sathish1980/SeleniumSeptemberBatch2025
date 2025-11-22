package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown {
	
	WebDriver driver;
	
	public void launchFB() throws InterruptedException
	{
		driver = new ChromeDriver(); // open Edge browser
		driver.get("https://www.facebook.com/");
		WebElement createAccount = driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
		createAccount.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='day']")));
		
		// Dropodown
		Select dayDropdown = new Select(driver.findElement(By.xpath("//*[@id='day']")));
		dayDropdown.selectByValue("5");
		Thread.sleep(1000);
		dayDropdown.selectByVisibleText("7");
		Thread.sleep(1000);
		dayDropdown.selectByIndex(9);
		System.out.println(dayDropdown.isMultiple());
		Select monthDropdown = new Select(driver.findElement(By.xpath("//*[@id='month']")));
		monthDropdown.selectByValue("5");
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Dropdown d = new Dropdown();
		d.launchFB();
	}

}
