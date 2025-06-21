package com.practice.classandobject;

public class ClassAndObjectCreation {
	
	 
	
	public int sum(int a, int b) {
		return a+b;                   //This is Method
	}

	public static void main(String[] args) {
		
		ClassAndObjectCreation obj = new ClassAndObjectCreation();
		
		int ans = obj.sum(10, 20);
		System.out.println("The sum of a and b is: "+ans);
	
	}

}
