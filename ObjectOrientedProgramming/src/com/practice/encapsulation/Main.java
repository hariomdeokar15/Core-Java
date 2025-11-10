package com.practice.encapsulation;

public class Main {

	public static void main(String[] args) {
		
		Bank b = new Bank("Hariom", 2000);
		b.deposite(20000);
		b.withdrawn(5000);
		b.withdrawn(3000);
		b.showCurrentBalance();
		
		System.out.println("\n.....Bank Log History...........");
		for(String log: Logger.getInstance().getLogs() ) {
			System.out.println(log);
		}
		
	}

}
