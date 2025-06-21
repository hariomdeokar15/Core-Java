package com.practice.polymorphism;

interface Payment{
	void pay(double amount);
}
class CreditcardPay implements Payment {
	
	public void pay(double amount) {
		
		System.out.println("Paid $"+amount+" using credit card");
		
	}

	
}
class PhonePay implements Payment {
	
	public void pay(double amount) {
		System.out.println("Paid $"+amount+" using Phonepay");
	}
	
}

public class InterfaceBasedExample {

	public static void main(String[] args) {
		Payment payment;
		
		payment = new CreditcardPay();
		payment.pay(2000);
		payment.pay(2300);
		payment = new PhonePay();
		payment.pay(3000);
		
		
		

	}

}
