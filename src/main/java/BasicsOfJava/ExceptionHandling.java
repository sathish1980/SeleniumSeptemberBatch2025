package BasicsOfJava;

import java.io.IOException;

public class ExceptionHandling {
	
	public void div(int a, int b) throws NullPointerException,IOException
	{
		try
		{
		int c=a/b;
		throw new NullPointerException("This is invalid");
		//System.out.println("div is: "+c);
		}
		catch(Exception E)
		{
			System.out.println(E);
			 b=10;
			 int c=a/b;
			 System.out.println("new div is: "+c); 
			
		}
		finally
		{
			System.out.println("Finally");
		}
	}

	public void add(int a, int b )
	{
		int c= a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionHandling E = new ExceptionHandling();
		//E.div(10, 5);
		E.add(10, 5);
	}

}
