package com.practice.inheritance;

class SingleInheritance {
    String vehical;
    public void run() {
   	 System.out.println("vehical is running");
    }
	

}

 public class Inheritance extends SingleInheritance {

	public static void main(String[] args) {
		
		Inheritance i = new Inheritance();
		
		i.run();

	}

}

