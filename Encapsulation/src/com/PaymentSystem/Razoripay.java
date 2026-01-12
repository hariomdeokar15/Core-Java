package com.PaymentSystem;

public class Razoripay {
	String pin;
	
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		if(pin.matches("\\d{4}")) {
			this.pin = pin;
		}else {
			System.out.println("Enter valid Pin");
		}
	}

}
