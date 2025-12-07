package TestNGSample;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class SecondTestNg {

	/*
	 * Test -Testcase
	 * BeforeMethod
	 * AfterMethod
	 * BeforeClass
	 * AfterClass
	 */
	
	@Test
	public void Tescase1()
	{
		System.out.println("First Testcase in SecondTestNg");
	}
	
	@BeforeTest
	public void BF()
	{
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void AF()
	{
		System.out.println("After Test");
	}
	
	
	
}
