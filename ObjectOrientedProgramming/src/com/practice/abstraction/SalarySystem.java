package com.practice.abstraction;

abstract class Employee{
	String name;
	double basesalary;
	
	Employee(String name, double basesalary){
		this.name = name;
		this.basesalary = basesalary;
	}
	
	public abstract double calculateSalary();
	public abstract void details();
}
class Developer extends Employee{
	
	Developer (String name, double basesalary){
		super(name, basesalary);
	}
	public void details() {
		System.out.println("Name :"+name);
		System.out.println("BaseSalary: "+basesalary);
	}
	
	public double calculateSalary() {
		return basesalary+1000;
	}
}
class Manager extends Employee{
	Manager(String name, double basesalary){
		super(name, basesalary);
	}
	public void details(){
		System.out.println("Name :"+name);
		System.out.println("BaseSalary: "+basesalary);
		
	}
	public double calculateSalary() {
		return basesalary+2000;
	}
}

public class SalarySystem {

	public static void main(String[] args) {
		
		Developer d = new Developer("Hariom Deokar", 100000);
		double developerSalary = d.calculateSalary();
		d.details();
		System.out.println("Toatal calculate salary: "+developerSalary);
		
		System.out.println();
		
		Manager m = new Manager("sahil", 200000);
		double managerSalary = m.calculateSalary();
		m.details();
		System.out.println("Total calculate salary: "+managerSalary);

	}

}
