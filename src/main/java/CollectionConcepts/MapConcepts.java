package CollectionConcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapConcepts {

	
	public void mapimplementation()
	{
		//Map<Integer,String> m = new HashMap<>();
		//Map<Integer,String> m = new LinkedHashMap<>();
		Map<Integer,String> m = new TreeMap<>();
		System.out.println(m);
		m.put(4, "Sathish");
		m.put(2, "kumar");
		m.put(1, "R");
		m.put(3, "Sathish");
		System.out.println(m);
		
		// retrieve
		System.out.println(m.get(2));
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		for( String eachvalue : m.values())
		{
			if (eachvalue=="kumar")
			{
				System.out.println("Exist");
			}
		}
		
		for(Map.Entry m1:m.entrySet() )
		{
			System.out.println(m1.getKey() + ": "+m1.getValue());
			
		}
		
		// update
		m.replace(3, "B.tech");
		
		System.out.println(m);
		
		m.remove(2);
		
		System.out.println(m);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapConcepts M = new MapConcepts();
		M.mapimplementation();
	}

}
