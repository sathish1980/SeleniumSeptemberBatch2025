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

public class WindowsHandlingConcpet extends BrowserLaunch{
	
	public void WindowsHandlingImplementation1() throws InterruptedException
	{
		lauchTheBrowser("https://www.leafground.com/window.xhtml");
		String currentWindow = driver.getWindowHandle();
		System.out.println(currentWindow);
		driver.findElement(By.id("j_idt88:new")).click();
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows);
		
		for(String childwindowname :allWindows)
		{
			System.out.println("child window name ; "+childwindowname);
			if(!currentWindow.equalsIgnoreCase(childwindowname))
			{
				driver.switchTo().window(childwindowname);
				List<WebElement> elementExist = driver.findElements(By.id("menuform:j_idt40"));
				if(elementExist.size()>0)
				{
					driver.findElement(By.id("menuform:j_idt40")).click();
					driver.findElement(By.id("menuform:m_input")).click();
					driver.findElement(By.id("j_idt88:name")).sendKeys("Sathish");
					driver.close();
					driver.switchTo().window(currentWindow);
				}
			}
		}
			
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WindowsHandlingConcpet A = new WindowsHandlingConcpet();
		A.WindowsHandlingImplementation1();
	}

}
