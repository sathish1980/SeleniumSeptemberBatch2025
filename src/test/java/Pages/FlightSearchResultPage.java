package Pages;

import org.openqa.selenium.WebDriver;

import WebDriverCommonUtils.CommonUtility;

public class FlightSearchResultPage  extends CommonUtility{
	WebDriver Browser;
	
	public FlightSearchResultPage(WebDriver Browser)
	{
		this.Browser=Browser;
	}
	
	public void GetFightSearchResultURL()
	{
		GetCurrentURL(Browser);
	}
	
	public String GetDetailsFromURL(String URL,String excpectedDetails)
	{
		String[] splitUrl = URL.split("=");
		String[] splitFromLocation = splitUrl[1].split("-");
		if(excpectedDetails.equalsIgnoreCase("From"))
		{
		return splitFromLocation[0];
		}
		else if(excpectedDetails.equalsIgnoreCase("To"))
		{
		return splitFromLocation[1];
		}
		else if(excpectedDetails.equalsIgnoreCase("Date"))
		{
			String wholeDate =splitFromLocation[2].substring(0,10);
			return splitFromLocation[2].substring(0,2);
		}
		return null;
	}
}
