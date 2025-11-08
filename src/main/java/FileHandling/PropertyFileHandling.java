package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileHandling {
	
	String filepath = System.getProperty("user.dir")+"\\Input\\EnvData.properties";
	
	public void ReadPropertyfile() throws IOException
	{
		//File F = new File(filepath);
		FileInputStream FS = new FileInputStream(filepath);
		Properties P = new Properties();
		P.load(FS);
		System.out.println(P.getProperty("name"));
		System.out.println(P.getProperty("age"));
		System.out.println(P.getProperty("qualification"));
		System.out.println(P.getProperty("status"));
		
		P.setProperty("status", "Middle Class");
		System.out.println(P.getProperty("status"));
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PropertyFileHandling P = new PropertyFileHandling();
		P.ReadPropertyfile();
	}

}
