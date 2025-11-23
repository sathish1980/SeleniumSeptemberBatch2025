package Basics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class KeyboardActions extends BrowserLaunch{
	
	public void KeyboardImplementation1() throws InterruptedException, AWTException
	{
		lauchTheBrowser("https://www.facebook.com/");
		Actions mouseactions = new Actions(driver);
		mouseactions.moveToElement(driver.findElement(By.id("email"))).sendKeys("sathish")
		.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		Thread.sleep(1000);
		mouseactions.moveToElement(driver.findElement(By.id("pass"))).sendKeys("password").keyDown(Keys.SHIFT).keyDown(Keys.TAB).keyUp(Keys.SHIFT).keyUp(Keys.TAB)
		.perform();
		Thread.sleep(1000);
		mouseactions.moveToElement(driver.findElement(By.id("email")))
		.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_F);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_T);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_A);
		
		
		}
	

	
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		KeyboardActions M =  new KeyboardActions();
		M.KeyboardImplementation1();
	}

}
