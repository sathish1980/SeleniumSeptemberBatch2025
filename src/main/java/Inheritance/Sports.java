package Inheritance;

public class Sports extends Marks{
	
	String SathishSports= "running";
	String HeeraSports= "dancing";
	String KumarSports= "football";
	
	public void SportsInterest(String name)
	{
		if(name.equalsIgnoreCase("Sathish"))
		{
			System.out.println("Sathish interestes in :"+SathishSports);
		}
		else if(name.equalsIgnoreCase("kumar"))
		{
			System.out.println("Kumar interestes in :"+KumarSports);
		}
		else if(name.equalsIgnoreCase("Heera"))
		{
			System.out.println("Heera interestes in :"+HeeraSports);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sports S = new Sports();
		System.out.println(schoolName);
		String name = "Heera";
		if(S.StudentInfo(name))
		{
		S.GetStudentMark(name);
		S.SportsInterest(name);
		}
		else
		{
			System.out.println("Student does not exist in DB");
		}
	}

}
