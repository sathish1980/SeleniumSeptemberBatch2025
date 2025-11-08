package BasicsOfJava;

public class FITATambaram implements Interface1{
	
	public void Wlecome()
	{
		System.out.println("Welcome to FITA Tambaram");
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println("You slary is : Rs.12000");
	}

	@Override
	public void Bonus(int amount) {
		// TODO Auto-generated method stub
		double bonus = amount*0.12;
		System.out.println("Your bonus is: "+bonus);
	}

	@Override
	public void Attendance() {
		// TODO Auto-generated method stub
		System.out.println("You attendance is : 70%");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1 I = new FITATambaram();
		I.salary();
		I.Bonus(10000);
		I.Attendance();
		FITATambaram F = new FITATambaram();
		F.Wlecome();
		
	}

	

}
