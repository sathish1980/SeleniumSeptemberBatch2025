package Inheritance;

public class Attendance extends Marks {
	
	int Sathishmarks= 50;
	int Heeramarks= 65;
	int Kumarmarks= 70;
	
	public int AttendancePercentage(String name)
	{
		if(name.equalsIgnoreCase("Sathish"))
		{
			return Sathishmarks;
		}
		else if(name.equalsIgnoreCase("kumar"))
		{
			return Kumarmarks;
		}
		else if(name.equalsIgnoreCase("Heera"))
		{
			return Heeramarks;
		}
		return 0;
	}
	
	public void AttendanceValue(String name)
	{
		if(AttendancePercentage(name) <=60)
		{
			System.out.println("you should improve the attendace percentage");
		}
		else if(AttendancePercentage(name) <=80)	
		{
			System.out.println("you are good at mainting the attendace percentage");

		}
		else if(AttendancePercentage(name) <=100)	
		{
			System.out.println("you are excellent at mainting the attendace percentage");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Attendance A = new Attendance();
		System.out.println("Welcome to "+schoolName);
		String name = "Sathish";
		//Marks M  = new Marks();
		A.GetStudentMArkDetails(name);
		A.AttendanceValue(name);
	}

}
