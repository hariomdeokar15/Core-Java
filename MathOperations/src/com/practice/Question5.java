package com.practice;

import java.util.Scanner;

public class Question5 {
	
	public static void main(String[] args) {
		
		//9️⃣ Check number sign
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		
		System.out.println("the sign is : "+Math.signum(num));
	}

}
