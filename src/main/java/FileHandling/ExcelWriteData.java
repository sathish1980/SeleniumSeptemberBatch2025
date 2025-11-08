package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteData {
	
	String[] course = {"JAVA","Python","SQL"};
	
	static String filePath = System.getProperty("user.dir")+"\\Input\\outputdata.xlsX";
	public void WriteExcelFile() throws IOException
	{
		File F = new File(filePath);
		FileOutputStream FS = new FileOutputStream(F);
		XSSFWorkbook workbook = new XSSFWorkbook();
		//HSSFWorkbook workbook =new HSSFWorkbook();
		Sheet sheet = workbook.createSheet("Output");
		int totalsize = course.length;
	
		for(int i=0;i<totalsize;i++)
		{
			Row eachRow=sheet.createRow(i);
			Cell cell =eachRow.createCell(i);
			cell.setCellValue(course[i]);	
		}
		System.out.println("done");
		workbook.write(FS);
		FS.close();
		
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelWriteData E= new ExcelWriteData();
		E.WriteExcelFile();
	}

}
