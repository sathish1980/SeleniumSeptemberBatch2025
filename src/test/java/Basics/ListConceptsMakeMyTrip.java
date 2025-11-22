package Basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListConceptsMakeMyTrip extends BrowserLaunch{
	
	public void ListConceptImplementation(String expectedCountry) throws InterruptedException
	{
		lauchTheBrowser("https://www.makemytrip.com/");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@data-cy='closeModal']")));
		driver.findElement(By.xpath("//*[@data-cy='closeModal']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='tp-dt-header-icon']//img")));
		driver.findElement(By.xpath("//*[@class='tp-dt-header-icon']//img")).click();
		try
		{
		driver.findElement(By.xpath("//*[@for='fromCity']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@for='fromCity']")));
		driver.findElement(By.xpath("//*[@for='fromCity']")).click();
		}
		catch(Exception e)
		{
			Thread.sleep(3000);
		}
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='react-autowhatever-1']//li[last()]")));
		
		List<WebElement> countries = driver.findElements(By.xpath("//*[@id='react-autowhatever-1']//li"));
		/*for (WebElement eachCountry : countries)
		{
			String actualCountry = eachCountry.getText();
			if(actualCountry.equalsIgnoreCase(expectedCountry))
			{
				eachCountry.click();
				break;
			}
		}*/
		
		for (int i=1;i<=countries.size();i++)
		{
			WebElement countrydetails =driver.findElement(By.xpath("//*[@id='react-autowhatever-1']//li["+i+"]//div[starts-with(@class,'font14')]"));
			String actualCountry = countrydetails.getText();
			if(actualCountry.equalsIgnoreCase(expectedCountry))
			{
				driver.findElement(By.xpath("//*[@id='react-autowhatever-1']//li["+i+"]")).click();
				break;
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ListConceptsMakeMyTrip L = new ListConceptsMakeMyTrip();
		L.ListConceptImplementation("DEL");
	}

}
