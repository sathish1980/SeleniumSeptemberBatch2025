package BasicsOfJava;

public class Encapsulationconcepts extends ArraysConcepts {
	
	public void GetAge()
	{
		setAgeData(50);
		System.out.println(getAgeData());
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulationconcepts E = new Encapsulationconcepts();
		E.GetAge();
	}

}
