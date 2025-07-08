package com.practice.wrapperclasses;

public class ParsingExample {

	public static void main(String[] args) {
		
		//Parsing String Value to primitive using wrapper classes
		
		String str = "123";
		
		int num = Integer.parseInt(str);
		double number = Double.parseDouble(str);
		
		
		
		System.out.println("String to integer: "+num);
		System.out.println("String to double: "+number);
		
		
		//what if the String is like String str = "1 2 3"; having a space between numbers
		//solution: 
		String str1 = "1 2 3";
		String[] parts = str1.split(" ");
		
		for(String part: parts) {
			int num1 = Integer.parseInt(part);
			System.out.println("Parsed int: "+num1);
		}

	}

}
