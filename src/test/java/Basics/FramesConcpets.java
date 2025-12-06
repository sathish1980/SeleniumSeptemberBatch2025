package Basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FramesConcpets extends BrowserLaunch{
	
	public void FramesConcpetsImplementation1() throws InterruptedException
	{
		lauchTheBrowser("https://www.leafground.com/frame.xhtml");
		List<WebElement> allFrames = driver.findElements(By.tagName("iframe"));
		for(int i=0;i<allFrames.size();i++)
		{
			driver.switchTo().frame(i);
			List<WebElement> elementExist= driver.findElements(By.xpath("//*[@id='Click' and contains(@style,'ff7295')]"));
			if(elementExist.size()>0)
			{
				driver.findElement(By.xpath("//*[@id='Click' and contains(@style,'ff7295')]")).click();	
				driver.switchTo().defaultContent();
				break;
			}
			driver.switchTo().defaultContent();
		}
			
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FramesConcpets A = new FramesConcpets();
		A.FramesConcpetsImplementation1();
	}

}
