package BasicsOfJava;

public class SecondClass {
	
	DataTypeandVariables D = new DataTypeandVariables();
	public void Today()
	{
		System.out.println("Today is sunday");
		System.out.println(DataTypeandVariables.firstnumber);
		DataTypeandVariables.Myname();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondClass S = new SecondClass();
		S.Today();
		Methods M = new Methods();
		M.Add("Onam");
		M.Add("TeacherDay");
		M.Add("MiladiNabi");
	}

}
