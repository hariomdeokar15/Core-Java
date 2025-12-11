package com.org.herarchical;

public class Student extends Person{
	
	String grade;
	
	Student(String name, int age, String id, String grade){
		super(name, age, id);
		this.grade = grade;
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("grade: "+grade);
		System.out.println(".....................................");
		
	}

}
