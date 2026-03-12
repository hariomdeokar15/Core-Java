package com.practice;

import java.util.LinkedList;

public class CheckWheatherEmptyOrNot {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		
		if(list.isEmpty()) {
			System.out.println("The list is empty");
		}else {
			System.out.println("The list is not Empty");
		}

	}

}
