package com.practice;

import java.util.Collections;
import java.util.Stack;

public class ReverseStringStack {

	public static void main(String[] args) {
		
		Stack<String> s = new Stack<>(); 
		
		s.add("Java");
		s.add("Python");
		s.add("C");
		s.add("c++");
		
		Collections.reverse(s);
		System.out.println("After Reverse: "+s);

	}

}
