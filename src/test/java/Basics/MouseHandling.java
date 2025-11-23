package Basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHandling extends BrowserLaunch{
	
	public void MouseImplementation1() throws InterruptedException
	{
		lauchTheBrowser("https://www.ebay.com/");
		Actions mouseactions = new Actions(driver);
		mouseactions.moveToElement(driver.findElement(By.xpath("//*[@class='vl-flyout-nav__js-tab']//*[text()='Motors']"))).perform();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Turbo chargers']")));
		
		mouseactions.moveToElement(driver.findElement(By.xpath("//*[text()='Turbo chargers']"))).click().perform();
	}
	
	public void MouseImplementation2() throws InterruptedException
	{
		lauchTheBrowser("https://www.facebook.com/");
		Actions mouseactions = new Actions(driver);
		mouseactions.moveToElement(driver.findElement(By.id("email"))).sendKeys("sathish").doubleClick().contextClick().perform();
	}
	public void MouseImplementation3() throws InterruptedException
	{
		lauchTheBrowser("https://www.leafground.com/drag.xhtml");
		Actions mouseactions = new Actions(driver);
		mouseactions.moveToElement(driver.findElement(By.id("form:drag"))).dragAndDrop(driver.findElement(By.id("form:drag")), driver.findElement(By.id("form:drop_content"))).perform();
	}
	
	public void MouseImplementation4() throws InterruptedException
	{
		lauchTheBrowser("https://www.leafground.com/drag.xhtml");
		Actions mouseactions = new Actions(driver);
		mouseactions.moveToElement(driver.findElement(By.id("form:conpnl"))).dragAndDropBy(driver.findElement(By.id("form:conpnl")), 250, 0).perform();
		mouseactions.moveToElement(driver.findElement(By.id("form:conpnl"))).dragAndDropBy(driver.findElement(By.id("form:conpnl")), -100, 0).perform();
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MouseHandling M =  new MouseHandling();
		M.MouseImplementation4();
	}

}
