package com.PaymentSystem;

import java.util.Scanner;

public class Main {
	
	public static void showPaymentMethod(Scanner sc, String credit_card, String credit_cvv, String mainpin, String debit_card, String debit_cvv) {
		System.out.println("Choose Payment Method \n");
		System.out.println("1. Credit Card: ");
		System.out.println("2. Debit card");
		int choice = sc.nextInt();
		
		if(choice == 1) {
			boolean isDataNotInsertCorrectly = true;
			do {
				System.out.println("Enter Credit card number: \n");
				String credit_number = sc.next();
				System.out.println("Enter Credit card cvv: \n");
				String creditcard_cvv = sc.next();
				
				System.out.println("Enter Amount: \n");
				double amount = sc.nextDouble();
				
				System.out.println("Enter pin: \n");
				String credit_pin = sc.next();
				
				if(credit_number.equals(credit_card) && creditcard_cvv.equals(credit_cvv) && credit_pin.equals(mainpin) ) {
					CreditCard c= new CreditCard();
					c.payment(amount);
					isDataNotInsertCorrectly = false;
				}else {
					System.out.println("Details Enter are invalid Enter Again \n");
				}
			}while(isDataNotInsertCorrectly);
			
		}else if(choice == 2) {
			boolean isDataNotInsertCorrectly = true;
			do {
				System.out.println("Enter Debit card number: \n");
				String debit_number = sc.next();
				System.out.println("Enter Debit card cvv: \n");
				String debitcard_cvv = sc.next();
				
				System.out.println("Enter Amount: \n");
				double amount = sc.nextDouble();
				
				System.out.println("Enter pin: \n");
				String debit_pin = sc.next();
				
				if(debit_number.equals(debit_card) && debitcard_cvv.equals(debit_cvv) && debit_pin.equals(mainpin) ) {
					 Debitcard d= new Debitcard();
					 
					 d.withdraw(amount);
				}else {
					System.out.println("Details Enter are invalid Enter Again \n");
				}
				}while(isDataNotInsertCorrectly);
			
		}
	}
	
	public static void LinkBankAccount(Scanner sc, String name, String phone, String credit_card, String debit_card) {
		boolean isDataNotValid = true;
		
		
		do {
			
			System.out.println("Enetr name: ");
			String userName = sc.next();
			
			System.out.println("Enetr Phone Number: \n");
			String phoneNumber = sc.next();
			if(userName.matches(name) && phoneNumber.matches(phone)) {
				System.out.println("Add your creadit card and Debit Card to razoripay: \n");
				
				boolean isCreditCardNotValid = true;
				
				do {
					System.out.println("Enter Credit card Number");
					String creditCardNum = sc.next();
					
					if(creditCardNum.matches(credit_card) ) {
						System.out.println("Creadit card added successfully!");
						isCreditCardNotValid = false;
					}else {
						System.out.println("Credit Card Number you Entered is incorrect ");
					}
				}while(isCreditCardNotValid);
				
				boolean isdeditCardNotValid = true;
				
				do {
					System.out.println("Enter Dedit card Number");
					String deditCardNum = sc.next();
					
					if(deditCardNum.equals(debit_card))  {
						System.out.println("Deadit card added successfully! \n");
						isdeditCardNotValid = false;
					}else {
						System.out.println("Dedit Card Number you Entered is incorrect \n");
					}
				}while(isdeditCardNotValid);
				
				

				
				isDataNotValid = false;
			}else {
				System.out.println("User name or Password is invalid enter again \n");
			}
		}while(isDataNotValid);
		
		System.out.println("Account Linked Succlessfully! \n");
		
	}

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		Razoripay r = new Razoripay();
		BankAccount b = new BankAccount();
		
		double balance = b.getBalance();
		String name = b.getName();
		String phone = b.getPhone();
		
		

        
		
		
		
		System.out.println("Welcome to Razori Payment getway");
		
		System.out.println("Set pin: ");
		String pin = sc.next();
		r.setPin(pin);
		String mainpin = r.getPin();
		
		
		System.out.println("Enter pin: ");
		String pin2 = sc.next();
		
		if(pin2.matches(mainpin)) {
			do{
				String credit_card = b.to_credit_card;
				String credit_cvv = b.to_credit_cvv;
				String debit_card = b.to_debit_card;
				String debit_cvv = b.to_debit_cvv;
				System.out.println("Welcome to Razori Payment getway \n");
				System.out.println("Is you have bankaccount");
				System.out.println("1. Yes ");
				System.out.println("2. No");
				int isaccount = sc.nextInt();
				
				if(isaccount == 1) {
					
					System.out.println("Is your banck account is connected to razori pay");
					System.out.println("1. Yes ");
					System.out.println("2. No");
					int option = sc.nextInt();
					
					if(option == 1) {
						showPaymentMethod(sc, credit_card, credit_cvv, mainpin, debit_card, debit_cvv);
						
					}else if(option == 2){
						System.out.println("Link your account first \n");
						
						LinkBankAccount(sc, name, phone, credit_card, debit_card);	
						
					}else {
						System.out.println("Enter valid choice! \n");
					}
					
					
				}else if(isaccount == 2) {
					
					System.out.println("Create your banck account: \n");
					System.out.println("Enter name :");
					name = sc.next();
					b.setName(name);
	                
				
					boolean isInvalid;
					
					do {
						System.out.println("Enter Phone Number: ");
						phone = sc.next();
						isInvalid = b.setPhone(phone);
					}while(isInvalid);
					
					
					boolean isBalanceInvalid;
					
					do {
						System.out.println("Enter Balance");
						 balance = sc.nextInt();
						isBalanceInvalid = b.setBalance(balance);
					}while(isBalanceInvalid);
					
					
					
					b.createAccount();
					
					
					System.out.println("Redirecting to Razorypay.....");
					
					
					
				}
	 				
				
				
			}while(true);
			

	   

		
			
		}else {
			System.out.println("Invalid Pin");
		}
		
		
		
		
		
	}

}
