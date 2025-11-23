package Basics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Screenshot extends BrowserLaunch{
	
	public void ScrollImplementation1() throws InterruptedException, IOException
	{
		lauchTheBrowser("https://www.leafground.com/drag.xhtml");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//vertical scroll down
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		captureScreenshot(driver,"scrolldown");
		//vertical scroll up
		js.executeScript("window.scrollBy(0,-200)", "");
		Thread.sleep(2000);
		captureScreenshot(driver,"scrollup");
		//horizontal scroll right
		js.executeScript("window.scrollBy(500,0)", "");
		Thread.sleep(2000);
		//horizontal scroll left
		js.executeScript("window.scrollBy(-500,0)", "");
		Thread.sleep(2000);
		// vertically scroll down to the end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		captureScreenshot(driver,"scrolltoward end");
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(2000);
		
		WebElement cancelbutton=driver.findElement(By.xpath("//*[@id='form:j_idt120']"));
		js.executeScript("arguments[0].scrollIntoView();", cancelbutton);
		captureScreenshot(driver,"scrolltoSpecificelement");
					
	}
	public void captureScreenshot(WebDriver browser,String filename) throws IOException
	{
		TakesScreenshot scr = (TakesScreenshot)browser;
		File sourcefile =scr.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File(".\\Screenshot\\"+filename+".png");
		FileUtils.copyFile(sourcefile, destinationFile);
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Screenshot A = new Screenshot();
		A.ScrollImplementation1();
	}

}
