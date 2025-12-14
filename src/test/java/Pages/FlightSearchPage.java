package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import WebDriverCommonUtils.CommonUtility;

public class FlightSearchPage extends CommonUtility {
	WebDriver Browser;
	
	public FlightSearchPage(WebDriver Browser)
	{
		this.Browser=Browser;
	}
	
	public void SelectFromDropdown(String fromLocation) throws InterruptedException
	{
		/*WaitForClickable(Browser, By.cssSelector("[for='fromCity']"));
		WebElement from = Browser.findElement(By.cssSelector("[for='fromCity']"));
		ClickOnButton(from);*/
		WaitandClickOnButton(Browser, By.cssSelector("[for='fromCity']"));
		SelectValueFromList(fromLocation);
	}
	
	public void SelectToDropdown(String toLocation) throws InterruptedException
	{
		/*WaitForClickable(Browser, By.cssSelector("[for='toCity']"));
		WebElement to = Browser.findElement(By.cssSelector("[for='toCity']"));
		ClickOnButton(to);*/
		WaitandClickOnButton(Browser, By.cssSelector("[for='toCity']"));
		SelectValueFromList(toLocation);
	}
	
	public void SelectDepatureDate(String Date) throws InterruptedException
	{
		SelectDate(Date);
	}
	
	public void SelectTraveller(int AdultCount) throws InterruptedException
	{
		SelectTravellersAndClickApply(AdultCount);
	}
	
	public void clickOnSearchbutton() throws InterruptedException
	{
		WaitandClickOnButton(Browser, By.xpath("//a[text()='Search']"));
		//WebelementCommons.WaitForClickable(Browser, By.xpath("//a[text()='Search']"));
		//WebelementCommons.ClickOnButton(Browser.findElement(By.xpath("//a[text()='Search']")));
	}
	
	public void ClosePopup() throws InterruptedException
	{
		try
		{
		WaitForClickable(Browser,By.xpath("//*[@data-cy='closeModal']"));
		ClickOnButton(Browser.findElement(By.xpath("//*[@data-cy='closeModal']")));
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void SelectValueFromList(String selectValue)
	{
		WebDriverWait wait = new WebDriverWait(Browser,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='react-autowhatever-1']//li)[last()]")));
		
		List<WebElement> allcountry =Browser.findElements(By.xpath("//*[@id='react-autowhatever-1']//li"));
	
		for (WebElement eachElement : allcountry)
		{
			String Code = eachElement.findElement(By.cssSelector("div[class^='font14']")).getText();
			System.out.println(Code);
			if(Code.equalsIgnoreCase(selectValue))
			{
				eachElement.click();
				break;
			}
		}
	}
	
	public void SelectDate(String expectedDate) throws InterruptedException
	{
		Thread.sleep(2000);
		List<WebElement> allWeeks = Browser.findElements(By.xpath("(//*[@class='DayPicker-Months']//div[@class='DayPicker-Month'])[last()]//div[@class='DayPicker-Week']"));
		for(WebElement eachWeek : allWeeks)
		{
			List<WebElement> allDaysInaWeek=	eachWeek.findElements(By.cssSelector("div[class^='DayPicker-Day']"));
			for (WebElement eachday : allDaysInaWeek)
			{
				
				String className = GetAttribute(eachday,"class");
				if(!(className.contains("outside")||className.contains("disabled")||className.contains("selected")))
				{
					String actualDate =GetText(eachday.findElement(By.tagName("p")));
					System.out.println(actualDate);
					if(actualDate.equalsIgnoreCase(expectedDate))
					{
						System.out.println(actualDate);
						Thread.sleep(3000);
						eachday.click();
						//ClickOnButton(eachday);
						return ;
					}
				}
			}
		}
	}
	
	public void SelectTravellersAndClickApply(int adultCount) throws InterruptedException
	{
		WaitandClickOnButton(Browser,By.cssSelector("[for='travellers']"));	
		WaitandClickOnButton(Browser,By.xpath("//*[@data-cy='adults-"+adultCount+"']"));
		WaitandClickOnButton(Browser, By.xpath("//*[text()='APPLY']"));
		//Browser.findElement(By.xpath("//*[@data-cy='adults-"+adultCount+"']")).click();
	}
	
	public void WaitandClickOnButton(WebDriver Browser, By element) throws InterruptedException
	{
		WaitForClickable(Browser, element);
		WebElement traveller = Browser.findElement(element);
		ClickOnButton(traveller);
		
	}
	
	public String GetSameCityError()
	{
		return GetText(Browser.findElement(By.xpath("//*[@data-cy='sameCityError']")));
		
	}

}
