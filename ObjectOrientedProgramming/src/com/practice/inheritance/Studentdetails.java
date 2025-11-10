package com.practice.inheritance;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age  = age;
		
	}
	public void displayDetails() {
		System.out.println("Person Information is as below :");	
	}
	
}
class Student extends Person {
	private int rollNo;

	public Student(String name, int age,int rollNo ) {
		super(name, age);
		this.rollNo = rollNo;
	}
	public void displayDetails() {
		System.out.println( " this is the ");
	}
	
	
	
}
public class Studentdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
