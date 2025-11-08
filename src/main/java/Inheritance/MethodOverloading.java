package Inheritance;

public class MethodOverloading {
	
	public void add(int a, int b)
	{
		int c =a+b;
		System.out.println("twoparam"+c);
	}
	
	public void add(int a, int b, int d)
	{
		int c =a+b+d;
		System.out.println("Thre param"+c);
	}
	
	public void add(int a, double b)
	{
		double c =a+b;
		System.out.println("twoparam with doulb "+c);
	}
	
	public void add(double a, double b)
	{
		double c =a+b;
		System.out.println("twoparam with 2 doulb "+c);
	}
	
	public void Discount(int amount)
	{
		double disc= amount;
		System.out.println("Discount percentage is: "+disc);
	}
	
	public void Discount(int amount,boolean premiumCustomer)
	{
		if(premiumCustomer)
		{
		double disc= amount*.05;
		System.out.println("Discount percentage is: "+disc);
		}
		else
		{
			double disc= amount*.05;
			System.out.println("No Discount percentage is: "+disc);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading M = new MethodOverloading();
		M.add(1,2);
		M.Discount(200);
	}

}
