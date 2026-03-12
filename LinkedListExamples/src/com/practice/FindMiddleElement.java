package com.practice;

import java.util.LinkedList;

public class FindMiddleElement {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		int size = list.size();
		
		System.out.println("Size of list: "+list.size());
		
		
		if(size % 2 == 0) {
			int middle2 = size/2;
			int middle1 = (size/2)-1;
			System.out.println("The list is of size "+size+" so the Middle Element will be: "+list.get(middle1)+" or "+list.get(middle2));
		}else {
			int middle = size/2;
			System.out.println("Middle Element is: "+list.get(middle));
		}

	}

}
