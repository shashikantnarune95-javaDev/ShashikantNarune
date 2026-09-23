package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class App {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(2);
		list.add(8);
		
		Set<Integer> set=new HashSet<>(list);
		System.out.println("Before"+list);
		System.out.println("After"+set);
		
		
	
	
			}
			
			
		

		
		
	}


