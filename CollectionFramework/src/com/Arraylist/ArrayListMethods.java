package com.Arraylist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListMethods {
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.add(1, 2);
		
		System.out.println(list);
		list.add(5, 6);
		System.out.println(list);
		
		list.addAll(list);
		
		System.out.println(list);
		list.set(5, 5);
		System.out.println(list);
		
		
		list.remove(1);
		System.out.println(list);
		
		Integer num = 2;
		list.remove(Integer.valueOf(2));
		System.out.println(list);
		
		list.remove(num);
		System.out.println(list);
		
		list.removeIf(n -> n == 2);
		System.out.println(list);
		
		System.out.println(list.contains(3));
		
	    System.out.println(list.toString());
	    
	    System.out.println(list.toArray());
	
	}
	
	

}
