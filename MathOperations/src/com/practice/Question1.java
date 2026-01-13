package com.practice;

public class Question1 {
	
	public static void main(String[] args) {
		double a = 1.1;
		
		System.out.println(Math.ceil(a));
		System.out.println(Math.round(a));
		System.out.println(Math.floor(a));
		
		//Find absolute difference
		int b= 100;
		int c= 200;
		
		int absolute_diff = Math.abs(b - c);//use to avoid negative value
		
		System.out.println("Absolute Difference between b and c is: "+absolute_diff);
		
		//2️⃣ Find maximum of three numbers
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		int compare1 = Math.max(num1,num2);
		int max = Math.max(compare1, num3);
		System.out.println("Max number is: "+max);
		
		
	}

}
