package com.practice.polymorphism;


public class MethodOverloadingExample {
	
	void sum(int a, int b) {
		System.out.println("The sum of two numbers: "+(a+b));
	}
	
	void sum(int a, int b, int c) {
		System.out.println("The sum of three numbers: "+(a+b+c));
	}

	public static void main(String[] args) {
		
		MethodOverloadingExample m = new MethodOverloadingExample();
        m.sum(10, 2);
        m.sum(2, 12, 3);
	}

}
