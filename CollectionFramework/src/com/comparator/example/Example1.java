package com.comparator.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class myStringComparator implements Comparator<String>{
	
	@Override
	public int compare(String s1, String s2) {
		return s2.length() - s1.length();
	}
}

class myComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2 - o1;
	}


	
}

public class Example1 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(4, 5, 2, 1, 3, 5, 5, 6));
		System.out.println("Original list: "+list1);
		
		list1.sort(null);
		System.out.println("After default sort: "+list1);
		
//		list1.sort(new myComparator());
//		System.out.println("Acending sorting using comparator class: "+list1);
		
//		list1.sort(new myComparator());
//		System.out.println("Decending sorting using comparator class: "+list1);
		
		list1.sort((a, b)-> b- a);
		System.out.println("Decending sorting using lambda expression: "+list1);
		
		
		
		
		System.out.println("\n--------------------------------------------------------------\n");
		
		
		ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Hariom", "Rohit", "Pratik", "Aman", "Ashis"));
		
		System.out.println("Original list: "+list2);
		
		list2.sort(null);
		System.out.println("Default String list sorting: "+list2);
		
		list2.sort(new myStringComparator());
		System.out.println("Decending Sorting String by length of charector using comparator class: "+list2);
		
	    list2.sort((a, b)-> a.length()- b.length());
	    System.out.println("Acending Sorting String by length of charector using lamda expression: "+list2);
		
		
	}

}
