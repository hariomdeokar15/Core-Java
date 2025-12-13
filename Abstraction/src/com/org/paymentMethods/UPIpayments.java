package com.org.paymentMethods;

public class UPIpayments implements Payment{
	
	public void pay(double amount) {
		System.out.println("Paid Rs."+amount+" using UPI");
	}

}
