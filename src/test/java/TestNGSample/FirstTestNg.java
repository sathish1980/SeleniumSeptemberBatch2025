package TestNGSample;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class FirstTestNg {

	/*
	 * Test -Testcase
	 * BeforeMethod
	 * AfterMethod
	 * BeforeClass
	 * AfterClass
	 */
	
	@Test(priority=1,invocationCount=1,invocationTimeOut=60,description="Login Testcase",groups="Sanity")
	public void Tescase1()
	{
		System.out.println("First Testcase");
	}
	
	
	@Test(priority=1,timeOut=60,groups= {"Sanity","SIT"})
	public void Tescase3()
	{
		System.out.println("thrd Testcase");
	}
	
	@Test(priority=0,enabled=true,groups="SIT")
	public void Tescase2()
	{
		System.out.println("Second Testcase");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void BM()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void AM()
	{
		System.out.println("After Method");
	}
	
	@BeforeClass
	public void BC()
	{
		System.out.println("Before Class");
	}
	
	@AfterClass
	public void AC()
	{
		System.out.println("After Class");
	}
	
	@AfterSuite
	public void AS()
	{
		System.out.println("After Suite");
	}
	
	@BeforeSuite
	public void BS()
	{
		System.out.println("Before Suite");
	}
}
