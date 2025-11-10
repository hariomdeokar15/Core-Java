package com.practice.abstraction;

import java.util.Scanner;

interface Payment{
	public void makePayment(double amount);
}
class Phonepay implements Payment{
	public void makePayment(double amount){
		System.out.println("paying $"+amount+" via Phonepay");
	}
}
class Creditcard implements Payment{
	public void makePayment(double amount) {
		System.out.println("Paying $"+amount+" via credit card");
	}
}
public class InterfaceBasedExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a amount: ");
		double amount = sc.nextDouble();
		
		System.out.println("Enter one option from below to make payment: ");
		System.out.println("1. PhonePay");
		System.out.println("2. Creditcard");
		String method = sc.nextLine();
		
		
		if(method.equals("PhonePay")) {
			Payment p = new Phonepay();
			p.makePayment(amount);
		}else if(method.equals("Creditcard")) {
			Payment p = new Creditcard();
			p.makePayment(amount);
	    }else {
	    	System.out.println("Enter a vaild option");
	    }

	}

}

/* Advance Version According to Industrial Standards
   package com.practice.abstraction;

import java.math.BigDecimal;
import java.util.Scanner;

interface Payment {
    void makePayment(BigDecimal amount);
}

class PhonePay implements Payment {
    @Override public void makePayment(BigDecimal amount) {
        System.out.println("Paying ₹" + amount + " via PhonePe");
    }
}

class CreditCard implements Payment {
    @Override public void makePayment(BigDecimal amount) {
        System.out.println("Paying ₹" + amount + " via Credit Card");
    }
}

public class InterfaceBasedExample {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter an amount: ");
            if (!sc.hasNextBigDecimal()) {
                System.out.println("Amount must be numeric.");
                return;
            }
            BigDecimal amount = sc.nextBigDecimal();
            sc.nextLine(); // consume leftover newline

            if (amount.compareTo(BigDecimal.ZERO) <= 0) {
                System.out.println("Amount must be > 0.");
                return;
            }

            System.out.print("""
                    Choose payment method:
                    1. PhonePe
                    2. Credit Card
                    > """);
            String option = sc.nextLine().trim();

            Payment payment = switch (option) {
                case "1", "phonepe"   -> new PhonePay();
                case "2", "creditcard"-> new CreditCard();
                default -> null;
            };

            if (payment == null) {
                System.out.println("Invalid option.");
            } else {
                payment.makePayment(amount);
            }
        }
    }
}

 */
