package BasicsOfJava;

public class Methods {
	/*
	 *  Reusable purposes
	 *  4 type
	 *  Method with out parameter
	 *  method with parameter
	 *  Method with out return type
	 *  Method with return type
	 *  
	 *  Accessmodifier returntype methodname(argument/parameter){}
	 *  
	 *  Constructor:
	 *  
	 *  it should not have any return type
	 *  constructor name should be same as your class name
	 *  
	 *  2 type
	 *  Constructor with parameter
	 *  Constructor with out parameter
	 */
	
	public Methods()
	{
		int c = 2*3;
		System.out.println("Constructor output : "+c);
	}
	
	public Methods(int a , int b)
	{
		int c = a*b;
		System.out.println("Constructor with parameter output : "+c);
	}
	
	public void Add2Number(int a, int b,double c)
	{
		//int d =a+b;
		int d =add2data(a,b);
		double e =d+c;
		System.out.println("output is : "+e);
	}
	
	public int add2data(int a, int b)
	{
		int c =a+b;
		return c;
	}
	public void Add(String value)
	{
		System.out.println("Happy "+value);
		System.out.println("Happy "+value);
		System.out.println("Happy "+value);
		System.out.println("Happy "+value);
		System.out.println("Happy "+value);
		System.out.println("Happy "+value);
		System.out.println("Happy "+value);
		System.out.println("Happy "+value);
		System.out.println("Happy "+value);
		
	}
	
	public static void main(String[] args)
	{
		/*System.out.println("Happy WeddingDay");
		System.out.println("Happy WeddingDay");
		System.out.println("Happy WeddingDay");
		System.out.println("Happy WeddingDay");
		System.out.println("Happy WeddingDay");
		System.out.println("Happy WeddingDay");
		System.out.println("Happy WeddingDay");
		System.out.println("Happy WeddingDay");
		System.out.println("Happy WeddingDay");
		System.out.println("Happy WeddingDay");*/
		Methods M = new Methods(7,7);
		M.Add("WeddingDay");
		M.Add2Number(10, 20,0.10);
	}

}
