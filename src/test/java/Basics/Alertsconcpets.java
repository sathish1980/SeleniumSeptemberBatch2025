package Basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class Alertsconcpets extends BrowserLaunch{
	
	public void alertImplementation1() throws InterruptedException
	{
		lauchTheBrowser("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		/*
		 * accept
		 * dismiss
		 * sendkeys
		 * getText
		 */
		//driver.switchTo().alert().accept();
		//or
		Alert a =driver.switchTo().alert();
		String header = a.getText();
		System.out.println(header);
		a.accept();
		String validationtext = driver.findElement(By.id("simple_result")).getText();
		if (validationtext.equalsIgnoreCase("You have successfully clicked an alert"))
		{
			System.out.println("your test is pass");
		}
		else
		{
			System.out.println("Your test is FAIL");
		}
		
		String bgcolor = driver.findElement(By.id("j_idt88:j_idt93")).getCssValue("background-color");
		System.out.println(bgcolor);
		if(bgcolor.equalsIgnoreCase("rgba(251, 192, 45, 1)"))
		{
			System.out.println("color mathced : YELLOw");
		}
		
		String type = driver.findElement(By.id("j_idt88:j_idt93")).getAttribute("type");
		System.out.println(type);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Alertsconcpets A = new Alertsconcpets();
		A.alertImplementation1();
	}

}
