package com.practice.polymorphism;

abstract class Employee{
	String name;
	
	Employee(String name){
		this.name= name;
	}
	
	abstract double calculatesalary();
}

class FulltimeSalary extends Employee{
	
	double monthlySalary;
	
	FulltimeSalary(String name, double monthlySalary){
		super(name);
		this.monthlySalary = monthlySalary;
	}
	
	public double calculatesalary() {
		return monthlySalary;
	}
	
	
}
class ParttimeSalary extends Employee{
	int hoursWorked;
	double hourlySalary;
	ParttimeSalary(String name, int hoursWorked, double hourlySalary){
		super(name);
		this.hourlySalary = hourlySalary;
		this.hoursWorked = hoursWorked;
		
	}
	
	public double calculatesalary() {
		return hourlySalary*hoursWorked;
	}
	
}

public class AdvancedExample {

	public static void main(String[] args) {
		
		Employee e1 = new FulltimeSalary("Hariom",  200000);
		Employee e2 = new ParttimeSalary("Pratik", 300, 40);
		
		System.out.println(e1.name+" has Full Time Salary : "+e1.calculatesalary());
		System.out.println(e2.name+" has Part Time Salary : "+e2.calculatesalary());

	}

}
