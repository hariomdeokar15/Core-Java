package com.org.paymentMethods;

public class CreditCardpayments implements Payment{
	
	public void pay(double amount) {
		System.out.println("Paid Rs."+amount+" using Creditcard");
	}

}
