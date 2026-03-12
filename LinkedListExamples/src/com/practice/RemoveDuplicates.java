package com.practice;

import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(1);
		
//		HashSet<Integer> set = new HashSet<>(list);
//		
//		list.clear();
//		list.addAll(set);
		
		System.out.println(list);
		
		for(int i = 0; i<list.size(); i++) {
			
			for(int j = i + 1; j< list.size(); j++) {
				
				if(list.get(i).equals(list.get(j))) {
					list.remove(j);
					j--;
				}
			}
		}
		
		System.out.println(list);

	}

}
