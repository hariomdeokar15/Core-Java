package com.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Methods {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);//o/p = [10, 20, 30, 40, 50] due to toString method
		
		System.out.println(list.get(0));
		
		System.out.println(list.contains(40));
		
		list.add(1, 15);
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		list.remove(Integer.valueOf(30));
		System.out.println(list);
		
	    list.add(3, 10);		
	    System.out.println(list);
		LinkedList<String> slist = new LinkedList<>(Arrays.asList("Apple", "Mango", "orange", "Papaiya"));
		
		slist.remove("Apple");
		System.out.println(slist);
		
		slist.add("Peru");
		System.out.println(slist);
		
		
		
		
		
		

	}

}
