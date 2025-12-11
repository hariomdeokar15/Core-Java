package com.org.herarchical;

public class Teacher extends Person{
	
	String subject;
	
	public Teacher(String name, int age, String id, String subject) {
		super(name, age, id);
		this.subject = subject;
		
	}
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Subject: "+subject);
	}

}
