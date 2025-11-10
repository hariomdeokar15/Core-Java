package com.practice.wrapperclasses;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingExample {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		for (int i=1; i<=5; i++) {
			
			list.add(i);
			
		}
		for(int a: list) {
			System.out.print(a+" ");
		}
		
		

	}

}
