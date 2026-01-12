package com.PaymentSystem;

import java.util.*;

public class BankAccount {
	
	private String name;
	private String phone;
	private double balance;
	StringBuilder credit_card = new StringBuilder();
	StringBuilder credit_cvv = new StringBuilder();
	StringBuilder debit_card = new StringBuilder();
	StringBuilder debit_cvv = new StringBuilder();
	Random random = new Random();
	
	 String to_credit_card ;
	 String to_credit_cvv;
	 String to_debit_card;
	 String to_debit_cvv;
	

	public BankAccount() {};
	
	public BankAccount(String name, String phone, double balance) {
	
		this.name = name;
		this.phone = phone;
		this.balance = balance;
		
	
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
	public boolean setBalance(double balance) {
		
			if(balance > 0) {
				this.balance = balance;
				return false;
			}else {
				System.out.println("Invalid Amount \n");
				return true;
		
			}
	}
	
	public String getPhone() {
		return phone;
	}
	
	
	
	public boolean setPhone(String phone) {
		

			if(phone.length()==10 && phone.matches("\\d+")) {
				this.phone = phone;
				return false;
			}else {
			  System.out.println("Invalid Number");
			  return true;
			}
			
			
	
	}
	
	


	public void creditcardGenerator() {
		
		        
		
		for (int i = 0; i < 16; i++) {

			credit_card.append(random.nextInt(10));
		}
		to_credit_card = credit_card.toString(); 
		for (int i = 0; i < 3; i++) {

			credit_cvv.append(random.nextInt(10));
		}
		to_credit_cvv = credit_cvv.toString();
		
	}
	
	public void generateDebitcardNumber() {
		
		
		for(int i = 0; i<16; i++) {
			debit_card.append(random.nextInt(10));
		}
		to_debit_card = debit_card.toString() ;
		for(int i = 0; i<3; i++) {
			debit_cvv.append(random.nextInt(10));
		}
		to_debit_cvv = debit_cvv.toString();
	}
	public void createAccount() {
		
		
		
		System.out.println("Congratulation "+name+", your banck Account created Successfully! \n");
		
		System.out.println("you have assisgn Credit and Debit card \n");
		creditcardGenerator();
		System.out.println("Credit card number: "+to_credit_card);
		System.out.println("Card CVV: "+to_credit_cvv+"\n");
		
		generateDebitcardNumber();
		System.out.println("Debit card number: "+to_debit_card);
		System.out.println("Debit CVV: "+to_debit_cvv+"\n");
		

		
	}
	

}
