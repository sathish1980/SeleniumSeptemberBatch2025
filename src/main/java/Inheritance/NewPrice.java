package Inheritance;

public class NewPrice extends OldPrice {

	public void PriceDiscount(int number1)
	{
		double percentage =number1*0.03;
		System.out.println(percentage);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewPrice N = new NewPrice();
		N.PriceDiscount(1000);
		
	}

}
