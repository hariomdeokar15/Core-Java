package com.practice;

import java.util.LinkedList;

public class ReverseManually {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println("list: "+list);
		LinkedList<Integer> reverse = new LinkedList<>();
		
		for(int i = list.size()-1; i>=0; i--) {
			reverse.add(list.get(i));
		}
		System.out.println("Reverse List: "+reverse	);
		

	}

}
