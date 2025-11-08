package BasicsOfJava;

public class FITAAnnanagar extends conditionsandLoops implements Interface1,CourseInterface{
	
	String[] courses = {"AI","AgenticAI","DEVOPS","Python"};
	public void Wlecome()
	{
		System.out.println("Welcome to FITA Annanagar");
	}

	@Override
	public void salary() {
		// TODO Auto-generated method stub
		System.out.println("You slary is : Rs.10000");
	}

	@Override
	public void Bonus(int amount) {
		// TODO Auto-generated method stub
		double bonus = amount*0.10;
		System.out.println("Your bonus is: "+bonus);
	}

	@Override
	public void Attendance() {
		// TODO Auto-generated method stub
		System.out.println("You attendance is : 80%");
	}
	
	@Override
	public void NeashCourse() {
		// TODO Auto-generated method stub
		for (String eachcourse : courses)
		{
			System.out.println(eachcourse);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1 I = new FITAAnnanagar();
		I.Bonus(10000);
		I.Attendance();
		FITAAnnanagar F = new FITAAnnanagar();
		F.Wlecome();
		CourseInterface I1 = new FITAAnnanagar();
		I1.NeashCourse();
		I1.salary();
		
	}

	

	

}
