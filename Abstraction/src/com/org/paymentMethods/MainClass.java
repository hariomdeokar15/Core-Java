package com.org.paymentMethods;

public class MainClass {

	public static void main(String[] args) {
		
		Payment u =  new UPIpayments();
		u.pay(1000);
		
		Payment c = new CreditCardpayments();
		c.pay(20000);

	}

}
