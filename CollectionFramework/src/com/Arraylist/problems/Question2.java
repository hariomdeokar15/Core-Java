package com.Arraylist.problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Question2 {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 2, 3, 4, 4, 5};
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int value : arr) {
			list.add(value);
		}
		
		System.out.println(list);
		
		Set<Integer> set = new HashSet<>();
		
		for(int a : list) {
			set.add(a);
		}
		System.out.println(set);
		
	    set.contains(2);
	}

}
