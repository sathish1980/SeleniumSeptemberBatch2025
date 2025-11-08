package Inheritance;

public class OldPrice {
	
	public void PriceDiscount(int number)
	{
		double percentage =number*0.05;
		System.out.println(percentage);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OldPrice O = new OldPrice();
		O.PriceDiscount(1000);
	}

}
