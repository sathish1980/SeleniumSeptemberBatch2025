package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadData {

	static String filePath = System.getProperty("user.dir")+"\\Input\\FitaStudents.xlsx";
	
	public void ReadExcelFile() throws IOException
	{
		File F = new File(filePath);
		FileInputStream FS = new FileInputStream(F);
		XSSFWorkbook workbook = new XSSFWorkbook(FS);
		
		Sheet sheet = workbook.getSheet("Studentinfo");
		
		int totalRows = sheet.getPhysicalNumberOfRows();
		for(int i=0;i<totalRows;i++)
		{
			Row row =sheet.getRow(i);
			int totalcolumn = row.getLastCellNum();
			for(int j=0;j<totalcolumn;j++)
			{
				Cell cell =row.getCell(j);
				if(cell != null)
				{
				System.out.print(GetCellValue(cell));
				System.out.print("\t");
				}
				else
				{
				System.out.print("\t");
				}
			}
			System.out.println("");
		}
		workbook.close();
		FS.close();
				
	}
	
	public static Object GetCellValue(Cell cellVal)
	{
		if(cellVal.getCellType().toString()=="STRING")
		{
			return cellVal.getStringCellValue();
		}
		else
		{
			DataFormatter data =  new DataFormatter();
			return data.formatCellValue(cellVal);
			//return cellVal.getNumericCellValue();
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelReadData E = new ExcelReadData();
		E.ReadExcelFile();
	}

}
