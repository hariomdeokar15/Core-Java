package com.constructorUsingSuperKeyword;

public class Employee extends Person {
	
	String Dpt = "IT";
	
	Employee(){
		super(10, "Hariom");
		System.out.println("Employee Default Constructor");
	}
	Employee(String Dpt){
		super(10, "Hariom");
		this.Dpt = Dpt;
		System.out.println("Employee Parameterise Constructor");
	}

}
