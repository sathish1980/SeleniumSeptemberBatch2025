package Basics;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tableconcepts extends BrowserLaunch{
	
	public void TableconceptsImplementation1(String expectedCountry) throws InterruptedException
	{
		lauchTheBrowser("https://www.leafground.com/table.xhtml");
		List<WebElement> allPages = driver.findElements(By.xpath("//span[@class='ui-paginator-pages']//a"));
		for( int j=1;j<allPages.size();j++)
		{
			driver.findElement(By.xpath("//span[@class='ui-paginator-pages']//a["+j+"]")).click();
			Thread.sleep(1000);
			
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table//tbody[@id='form:j_idt89_data']//tr"));
		for(int i=1;i<=allRows.size();i++)
		{
			String actualCountry = driver.findElement(By.xpath("//table//tbody[@id='form:j_idt89_data']//tr["+i+"]//td[2]//span[contains(@style,'vertical')]")).getText();
			if(expectedCountry.equalsIgnoreCase(actualCountry))
			{
				String name = driver.findElement(By.xpath("//table//tbody[@id='form:j_idt89_data']//tr["+i+"]//td[1]")).getText();
				System.out.println("Name is : "+name);
			}
		}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Tableconcepts A = new Tableconcepts();
		A.TableconceptsImplementation1("Spain");
	}

}
