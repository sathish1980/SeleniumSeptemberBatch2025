package Inheritance;

public class Students {
	
	static String schoolName = "DBCC";
	String[] studentName = {"Sathish","Kumar","Heera"};
	
	public boolean StudentInfo(String name)
	{
		for(String eachname : studentName)
		{
			if(eachname.equalsIgnoreCase(name))
			{
				return true;
			}
		}
		return false;
	}
	
	public void StudentExistorNot(String name)
	{
		if(StudentInfo(name))
		{
			System.out.println("The Given Student is Exist");
		}
		else
		{
			System.out.println("Student doensnot exist in our DB");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students S = new Students();
		S.StudentExistorNot("Raja");
	}

}
