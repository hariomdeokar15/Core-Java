package com.org.compiletimePolymorphism;

public class Calculator {
	int x, y, z;
	public void Addition(int x, int y) {
		System.out.println("Sum: "+ (x+y));
	}
	
	public void Addition(int x, int y, int z) {
		System.out.println("Sum: "+ (x+y+z));
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.Addition(10, 20);
		c.Addition(10, 20, 30);
	}

}
