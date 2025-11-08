package BasicsOfJava;

public class conditionsandLoops {
	
	/*
	 * conditions and loops
	 * conditions:
	 * if -4types
	 * if
	 * if-else
	 * if-elseif
	 * nested if
	 * 
	 * switch (if elseif)
	 *
	 */
	
	public void TrafficSignal(String lightColor,String vehicletype,boolean Patient)
	{
		if(lightColor.equals("Red"))
		{
			
			if(vehicletype=="Ambulance" && Patient==true)
			{
				//if(Patient==true)
				//{
				System.out.println("Please give a way to ambulance");
				/*}
				else
				{
					System.out.println("Please stop your vehicle");
				}*/
			}
			else
			{
				System.out.println("Please stop your vehicle");
			}
		}
		else if(lightColor=="Green")
		{
			System.out.println("You are good to go");
		}
		else if(lightColor=="Orange")
		{
			System.out.println("You are about to stop");
		}
		else
		{
			System.out.println("This is not a valid color");
		}
	}
	
	public void swtichCondition(String genderCode)
	{
		switch(genderCode.toUpperCase())
		{
		case "M":
			System.out.println("You are Male");
			break;
		case "F":
			System.out.println("You are FeMale");
			break;
		case "T":
			System.out.println("You are Transgender");
			break;
		default:
			System.out.println("Not a valid code");
			break;
		}
		
	}
	
	
	public void forloop()
	{
		/*System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");*/
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
	
	public void whileloop()
	{
		int i=10;
		while(i<10)
		{
			System.out.println(i);
			i=i+1;
		}
	}
	
	public void dowhileloop()
	{
		int i=1;
		do
		{
			System.out.println(i);
			i=i+1;
		}while(i<10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conditionsandLoops c = new conditionsandLoops();
		c.TrafficSignal("Red", "Ambulance",true);
		c.swtichCondition("m");
		c.dowhileloop();
	}

}
