package CollectionConcepts;

public class Stringconcepts {
	
	String name = " Sathish kumar ";
	String name1 = " Sathish kumar ";
	
	public void getName()
	{
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.trim());
		System.out.println(name.replace(" ", ""));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name);
		System.out.println(name.charAt(1));
		System.out.println(name.indexOf('a'));
		System.out.println(name.substring(4,6));
		System.out.println(name==name1);
		System.out.println(name.compareTo(name1));
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name.contains("sa"));
		System.out.println(name+name1);
		System.out.println(name.concat(name1));
		System.out.println(name.startsWith("Sa"));
		System.out.println(name.endsWith("r "));
		System.out.println(name.getBytes());
		char[] c = name.toCharArray();
		for(char eachchar : c)
		{
			System.out.println(eachchar);
		}
		System.out.println(name.toCharArray());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringconcepts sd = new Stringconcepts();
		sd.getName();
	}

}
