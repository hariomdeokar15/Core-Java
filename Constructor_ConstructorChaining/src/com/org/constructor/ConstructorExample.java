package com.org.constructor;

public class ConstructorExample {
	
	ConstructorExample(){
		System.out.println("Non parameterise");
	}
	
	ConstructorExample(int a, int b){
		System.out.println("Sum: "+(a+b));
	}
	
	public static void main(String[] args) {
		ConstructorExample c = new ConstructorExample();
		ConstructorExample c1 = new ConstructorExample(10, 20);
		
		
		
	}

}
