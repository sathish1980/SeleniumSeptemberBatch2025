package Basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListConcepts extends BrowserLaunch{
	
	public void ListConceptImplementation(String expectedCountry)
	{
		lauchTheBrowser("https://www.leafground.com/select.xhtml");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='j_idt87:country']//*[starts-with(@class,'ui-selectonemenu-trigger')]")));
		driver.findElement(By.xpath("//*[@id='j_idt87:country']//*[starts-with(@class,'ui-selectonemenu-trigger')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='j_idt87:country_items']//li[last()]")));
		
		List<WebElement> countries = driver.findElements(By.xpath("//*[@id='j_idt87:country_items']//li"));
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
			WebElement countrydetails =driver.findElement(By.xpath("//*[@id='j_idt87:country_items']//li["+i+"]"));
			String actualCountry = countrydetails.getText();
			if(actualCountry.equalsIgnoreCase(expectedCountry))
			{
				countrydetails.click();
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListConcepts L = new ListConcepts();
		L.ListConceptImplementation("Brazil");
	}

}
