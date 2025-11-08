package BasicsOfJava;

public class DataTypeandVariables {

	/*
	 * Primitive and non Primitve
	 * 
	 * 	int	-Whole number
	 * 	double -Decimal
	 * 	char -one character
	 * 	String -Word
	 * 	boolean - true or false
	 * 
	 * Non Primitive
	 * class
	 * array
	 * interface
	 * 
	 * Variable
	 * datatype variablename = value
	 * variable is a container which holds the value
	 * 3 type
	 * local
	 * global
	 * Static
	 */
	
	static int firstnumber = 100;
	double amount = 2.33;
	char status ='A';
	String name = "Sathish";
	boolean active = true;
	
	
	public static void Myname()
	{
		int firstnumber =200; //local variable
		System.out.println(firstnumber);
	}
	
	public void secondName()
	{
		System.out.println(firstnumber);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataTypeandVariables D = new DataTypeandVariables();
		D.Myname();
		D.secondName();
	}

}
