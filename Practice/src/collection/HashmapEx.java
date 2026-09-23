package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapEx {
	public static void main(String arg[])
	{
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "Mango");
		map.put(2, "Banana");
		map.put(3, "Apple");
		map.put(4, "Grapes");
		map.put(5, "Santra");
		
		System.out.println(map);
		
		for(Entry<Integer, String> m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
