package com.PaymentSystem;

public class Debitcard {
	
	BankAccount b;
	double balance = b.getBalance();
	
	public void withdraw(double amount) {
		balance -= amount;
		b.setBalance(balance);
		System.out.println("Payment Successfull! \n");
		System.out.println("Ramaing Balance is: "+b.getBalance());
	}
	
	
	
	
	
	
	 

}
