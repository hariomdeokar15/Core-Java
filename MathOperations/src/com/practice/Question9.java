package com.practice;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Random number in range (20–50)
//
//		Problem:
//		Generate random number between 20 and 50.
		
		int max= 50;
		int min = 20;
		
		System.out.println((int)(Math.random()*(max-min+1)+min));
		System.out.println(max-min+1);

	}

}
