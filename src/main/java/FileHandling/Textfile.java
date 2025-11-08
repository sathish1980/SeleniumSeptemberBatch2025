package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class Textfile {
	
	String filepath =System.getProperty("user.dir")+"\\Input\\TestData.txt";
	String outfilepath =System.getProperty("user.dir")+"\\Input\\output.txt";
	
	public void ReadTxtfile() throws IOException
	{
		File F = new File(filepath);
		FileInputStream FS = new FileInputStream(F);
		int i;
		while((i=FS.read())!=-1)
		{
		System.out.print((char)i);
		}
		FS.close();
	}
	
	public void ReadTxtfileusingFileReader() throws IOException, InterruptedException
	{
		File F = new File(filepath);
		FileReader FS = new FileReader(F);
		BufferedReader Bs = new BufferedReader(FS);
		String i;
		while((i=Bs.readLine())!=null)
		{
		System.out.println(i);
		Thread.sleep(1000);
		}
		FS.close();
	}
	
	public void WriteTxtfile() throws IOException, InterruptedException
	{
		String content = "Hi Sathish kumar R Welcome to fita";
		File F = new File(outfilepath);
		FileOutputStream FO = new FileOutputStream(F);
		FO.write(content.getBytes());
		FO.close();
		System.out.println("done");
	}
	
	public void copyFile() throws IOException, InterruptedException
	{
		File F = new File(filepath);
		File F1 = new File(outfilepath);
		FileUtils.copyFile(F, F1);
		System.out.println("done");
	}
	
	public void WriteTxtfileusingFileWriter() throws IOException, InterruptedException
	{
		String content = "Hi Sathish kumar R Welcome to fita";
		File F = new File(outfilepath);
		FileWriter FO = new FileWriter(F);
		FO.write(content);
		FO.close();
		System.out.println("done");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Textfile T = new Textfile();
		T.copyFile();
	}

}
