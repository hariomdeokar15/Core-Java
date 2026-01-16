package com.practice;

public class Example1 {
	
	public int factorial(int n) {
		
		if(n == 1) {
			return 1;
		}
		return n* factorial(n-1);
		
	}
	
	public static void main(String[] args) {
		
		
		Example1 e = new Example1();
		System.out.println(e.factorial(5));
		
		
		
		
	}

}
