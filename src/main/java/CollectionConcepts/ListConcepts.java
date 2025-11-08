package CollectionConcepts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListConcepts {
	
	public void arraylistCourse()
	{
		//List<String> AL = new ArrayList<>();
		//List<String> AL1 = new ArrayList<>();
		LinkedList<String> AL = new LinkedList<>();
		List<String> AL1 = new LinkedList<>();
		AL1.add("test1");
		AL1.add("test2");
		System.out.println(AL);
		AL.add("python");
		AL.add("Java");
		AL.add("python");
		AL.addFirst("SQL");
		AL.addAll(AL1);
		System.out.println(AL);
		
		// get or retreive
		
		System.out.println(AL.get(0));
		
		for(String eachvalue : AL)
		{
			System.out.println(eachvalue);
		}
		
		//update
		
		AL.set(5, "MYSQL");
		System.out.println(AL);
		System.out.println(AL.size());
		
		//delete
		
		AL.remove(0);
		AL.removeLast();
		
		System.out.println(AL);
		
		System.out.println(AL.isEmpty());
		System.out.println(AL.contains("Java"));
		System.out.println(AL.reversed());
		System.out.println(AL);
		//AL.sort(null);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListConcepts lc = new ListConcepts();
		lc.arraylistCourse();
	}

}
