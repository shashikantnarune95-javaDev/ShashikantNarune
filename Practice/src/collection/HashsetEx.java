package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetEx {
	public static void main(String args[])
	{
		HashSet<String> set=new HashSet<String>();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");
		
		Iterator itr=set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
