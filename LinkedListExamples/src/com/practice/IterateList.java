package com.practice;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateList {
	
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("Java");
		list.add("Python");
		list.add("C++");
		
		Iterator<String> itr =  list.iterator();
		
		while(itr.hasNext()) {
				System.out.println(itr.next());
		}
		
	}
}
