package com.org;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		
		BankAccount b = new BankAccount(10000);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr a process withdraw/deposite");
		String process = sc.next();
		
		System.out.println("Enter Amount :");
		int amount = sc.nextInt();
		
		if(process.equals("withdraw")) {
		   b.withdrawn(amount);
		}else if(process.equals("deposite")) {
			b.deposit(amount);
		}else {
			System.out.println("Invalid process");
		}
		
		

	}

}
