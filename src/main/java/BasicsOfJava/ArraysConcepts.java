package BasicsOfJava;

public class ArraysConcepts {
	
	private int age=20;
	
	public int getAgeData()
	{
		return age;
	}
	
	public void setAgeData(int age)
	{
		this.age=age;
	}
	
	String name = "SAthish";
	
	String[] names = {"Sathish","Kumar","R","Raja","Priya"};
	String[][] names2 = {{"Sathish","Kumar"},
						 {"R","Raja"},
						 {"Priya","RAgu"}};
	
	String[] newName = new String[5];
	
	public void getNames()
	{
		System.out.println(name);
		System.out.println(names);
		System.out.println(names[3]);
		for(String eachvalue : names)
		{
			System.out.println(eachvalue);
		}
		newName[0]="FITA";
		newName[4]="Annanagar";
		newName[2]="Tambaram";
		for(String eachvalue1 :newName)
		{
			System.out.println(eachvalue1);
		}
		
		System.out.println(names2.length);
		for(int i=0; i<names2.length;i++)
		{
			for(int j=0;j<names2[i].length;j++)
			{
				System.out.print(names2[i][j]);
			}
			System.out.println("");
		}
		
		System.out.println(age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraysConcepts A = new ArraysConcepts();
		A.getNames();
	}

}
