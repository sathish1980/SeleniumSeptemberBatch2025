package CollectionConcepts;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetConcepts {
	
	public void SetConcepts()
	{
		//Set<String> s = new HashSet<>();
		//Set<String> s = new LinkedHashSet<>();
		TreeSet<String> s = new TreeSet<>();
		System.out.println(s);
		
		// CRUD
		
		s.add("Python");
		s.add("java");
		s.add("C#");
		s.add("Python");
	
		System.out.println(s);
		
		// retrieve
		
		for(String eachvalue : s)
		{
			System.out.println(eachvalue);
		}
		
		
		//update -- its not possible
		//delete
		s.remove("javas");
		System.out.println(s);
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.contains("C#"));
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetConcepts s = new SetConcepts();
		s.SetConcepts();
	}

}
