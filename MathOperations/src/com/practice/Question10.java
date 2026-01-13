package com.practice;

public class Question10 {

	public static void main(String[] args) {
		
//		1️⃣3️⃣ Nearest power of 2
//
//		Problem:
//		Given a number, find nearest power of 2.
		

        int n = 5;

        int power = (int) Math.ceil(Math.log(n) / Math.log(2));
        int result = (int) Math.pow(2, power);

        System.out.println(result); // 8
	}

}
