package com.practice;

public class Question3 {

	public static void main(String[] args) {
		
//		Generate random 6-digit OTP.

//		Expected Range: 100000 – 999999
		
		int otp = (int)(Math.random()*900000)+100000;
		System.out.println("OTP: "+otp);
		
			

	}

}
