package com.practice.encapsulation;

public class Bank {
	
	private String accountHolder;
	private double balance;
	
	public Bank(String name, double initialbalance){
		this.accountHolder = name;
		this.balance = initialbalance;
		Logger.getInstance().log("Account created for "+name+" Account balance is "+initialbalance);
	}
	
	public void deposite(double amount) {
		balance += amount;
		Logger.getInstance().log("Deposited $"+amount+" into "+accountHolder+"'s account");
	}
	
	public void withdrawn(double amount) {
		if(amount <= balance) {
			balance -= amount;
			Logger.getInstance().log("Withdrawn $"+amount+" from "+accountHolder+ "'s Account");
		}else {
			Logger.getInstance().log("Error: Insufficient balance for withdraw by"+accountHolder);
		}
	}
	public void showCurrentBalance() {
		System.out.println("balance Current balance is "+balance);
	}
	
}
