package com.org;

public class BankAccount {
	
	double balance;
	
	public BankAccount(double initialBalance) {
		this.balance = initialBalance;
	}
	
	public void deposit(int amount) {
		if(amount >0) {
			balance += amount;
			System.out.println("Deposited Successfully");
			System.out.println("Toal Bank balance:"+balance);
		}else {
			System.out.println("Invalid Amount");
		}
	}
	
	public void withdrawn(int amount) {
		if(amount<0) {
			System.out.println("Invalid Amount");
		}else if(amount <= balance ) {
			balance -= amount;
			System.out.println("Withdrawn Successful");
			System.out.println("Remaining Balance: "+balance);
		}else if(amount>balance){
			System.out.println("Insufficient Amount");
		}else { 
			System.out.println("Error in prosessing");
		}
	}
	

}
