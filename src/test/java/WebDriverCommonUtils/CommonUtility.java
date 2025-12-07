package WebDriverCommonUtils;

import org.openqa.selenium.WebElement;

public class CommonUtility {
	
	public void EnterText(WebElement Element, String Text)
	{
		if(Element.isDisplayed())
		{
			Element.sendKeys(Text);
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException("Element not found");
		}
	}

}
