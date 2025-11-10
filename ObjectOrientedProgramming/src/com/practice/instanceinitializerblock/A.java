package com.practice.instanceinitializerblock;

public class A {
	
	{
		System.out.println("This is instance initializer block");
	}
	A(){
		System.out.println("This is constructor");
	}

	public static void main(String[] args) {
		
		A a = new A();
		

	}

}
