package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Scroll extends BrowserLaunch{
	
	public void ScrollImplementation1() throws InterruptedException
	{
		lauchTheBrowser("https://www.leafground.com/drag.xhtml");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//vertical scroll down
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		//vertical scroll down
		js.executeScript("window.scrollBy(0,-200)", "");
		Thread.sleep(2000);
		
		//horizontal scroll right
		js.executeScript("window.scrollBy(500,0)", "");
		Thread.sleep(2000);
		//horizontal scroll left
		js.executeScript("window.scrollBy(-500,0)", "");
		Thread.sleep(2000);
		// vertically scroll down to the end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(2000);
		
		WebElement cancelbutton=driver.findElement(By.xpath("//*[@id='form:j_idt120']"));
		js.executeScript("arguments[0].scrollIntoView();", cancelbutton);

					
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scroll A = new Scroll();
		A.ScrollImplementation1();
	}

}
