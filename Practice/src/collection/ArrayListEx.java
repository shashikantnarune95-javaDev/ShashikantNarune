package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx {
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Mango");
		list.add("Banana");
		list.add("Apple");
		list.add("Grapes");
		
		Collections.sort(list);
		
		for(String fruits:list)
			
		{
			System.out.println(fruits);
		}
	}

}
