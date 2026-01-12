package com.PaymentSystem;

import java.util.Scanner;

public class Payment {
	private double balance;
	private String name;
	private String password;
	private int debitcardNumber;
	private int creditcardNumber;
	

	public int getDebitcardNumber() {
		return debitcardNumber;
	}
	public void setDebitcardNumber(int debitcardNumber) {
		this.debitcardNumber = debitcardNumber;
	}
	public int getCreditcardNumber() {
		return creditcardNumber;
	}
	public void setCreditcardNumber(int creditcardNumber) {
		this.creditcardNumber = creditcardNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		if(balance>0)this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	 
	
	public void linkaccount(String name, String Password, double initialbalance, int debitcardNumber, int creditcardNumber ) {
		setBalance(initialbalance);
		setName(name);
		setPassword(Password);
		setCreditcardNumber(debitcardNumber);
		setDebitcardNumber(debitcardNumber);
		System.out.println("Account Created Successfully");
	}

}
