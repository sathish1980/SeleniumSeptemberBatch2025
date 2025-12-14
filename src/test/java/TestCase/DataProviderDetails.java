package TestCase;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Utils.ExcelFileRead;

public class DataProviderDetails {
	@DataProvider
	public Object[][] GetValidSearchTestData() throws IOException
	{
		return ExcelFileRead.ExcelRead("Validsearch");
	}
	
	@DataProvider
	public Object[][] GetSameCitySearchTestData() throws IOException
	{
		return ExcelFileRead.ExcelRead("SameCity");
	}
}
