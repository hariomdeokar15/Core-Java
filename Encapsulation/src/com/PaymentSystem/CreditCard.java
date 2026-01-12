package com.PaymentSystem;

import java.util.Random;

public class CreditCard {
	
	
	
	
	public void	 payment(double amount){

	    Random r = new Random();
	    StringBuilder s = new StringBuilder();
	    
	    for(int i =0; i< 10; i++) {
	    	s.append(r.nextInt(10));
	    }
		System.out.println("Payment Successful !");
		System.out.println("Payment id: "+s);
	}

}
