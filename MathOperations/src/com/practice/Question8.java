package com.practice;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {

//		Calculate compound interest.
//		Formula:
//			A = P × (1 + r/100)^t
		
//		Formula Breakdown
//		A = Future Value (the total amount after interest) 
//		P = Principal (the initial amount invested) 
//		r = Annual Interest Rate (as a decimal, e.g., 5% becomes 0.05) 
//		n = Number of times interest is compounded per year (e.g., annually=1, quarterly=4, monthly=12, daily=365) 
//		t = Time (in years) 
		
//		We need to find A
		
		int principle = 200000;
		double r = 7.0/100; // by 7%
		int t = 3;// for 1 year
		
//		Yearly find coumpound interest
		
		int n = 365;
		
		double finalAmount = principle *(Math.pow( (1 + (r/n)), (n*t)));
		System.out.println("Compound interest = "+ finalAmount);
		System.out.println("The amount of interest per year is : "+(finalAmount - principle));
		
		
		
		// EMI Calculator per month on actual amount and period of time you want ammount 
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter a principle Amount: ");
		double amount  = sc.nextDouble();
		
		System.out.println("Enter a rate of interest: ");
		double rate = sc.nextDouble();		
		double mRate = rate / (12 *100);
		
		System.out.println("Enter period you want to calculate :");
		int years = sc.nextInt();
		int x = years * 12; 
		
		double monthlyEmi = amount *  mRate * (Math.pow(1+mRate, x))/ (Math.pow(1+mRate, x) - 1);
		
		System.out.println("Your monthly EMI on amount "+amount+" is "+monthlyEmi+"/month ");
		
		double totalPaid = monthlyEmi * x ;
		System.out.println("Extra amount need to pay on amount "+amount+" is :"+totalPaid);
		
		double interestPaid = totalPaid -amount;
		System.out.println("Total amount Paid after 20 years: "+ interestPaid);

	}

}
