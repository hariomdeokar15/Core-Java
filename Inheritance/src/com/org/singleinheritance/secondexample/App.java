package com.org.singleinheritance.secondexample;

public class App {

	public static void main(String[] args) {
		
		CollegeStudent cs1 = new CollegeStudent("Hariom", 101, 25, 90.2, "hariom@gmail.com", "9067872316", "SPPU", 93598845, "Java", "IT", "CS", 8000.0, 8.8);
		cs1.display();
        cs1.result();
        cs1.placement();
        System.out.println(); 
        System.out.println("=====================================================");
        System.out.println();   
        CollegeStudent cs2 = new CollegeStudent("Nikhi", 102, 25, 93.2, "Nikhil@gmail.com", "9877872316", "SPPU", 999336845, "Java", "IT", "CS", 8000.0, 8.8);
		cs2.display();
        cs2.result();
        cs2.placement();


	}

}
