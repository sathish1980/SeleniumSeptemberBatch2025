package Inheritance;

public class Marks extends Students{
	
	int[] Sathishmarks= {55,65,40,30};
	int[] Heeramarks= {50,60,40,30};
	int[] Kumarmarks= {55,85,90,80};
	
	public void GetStudentMark(String StudentName)
	{
		if(StudentName.equalsIgnoreCase("Sathish"))
		{
			int total =0;
			for(int eachmark : Sathishmarks)
			{
				System.out.println("Your mark is: "+eachmark);
				total=total+eachmark;
			}
			System.out.println("Yout total mark is: "+total);
		}
		else if(StudentName.equalsIgnoreCase("Heera"))
		{
			int total =0;
			for(int eachmark : Heeramarks)
			{
				System.out.println("Your mark is: "+eachmark);
				total=total+eachmark;
			}
			System.out.println("Yout total mark is: "+total);
		}
		else if(StudentName.equalsIgnoreCase("Kumar"))
		{
			int total =0;
			for(int eachmark : Kumarmarks)
			{
				System.out.println("Your mark is: "+eachmark);
				total=total+eachmark;
			}
			System.out.println("Yout total mark is: "+total);
		}
	}
	
	public void GetStudentMArkDetails(String name)
	{
		//System.out.println(schoolName);
		if(StudentInfo(name))
		{
			GetStudentMark(name);
		}
		else
		{
			System.out.println("Student doesnot exist in out DB");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marks M = new Marks();
		System.out.println("Welcome to "+schoolName);
		M.GetStudentMArkDetails("Sathish");
	}

}
