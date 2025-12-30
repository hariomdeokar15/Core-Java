package com.org.singleinheritance.secondexample;

public class Student {
	
	

	String name;
	int rollNo;
	static String schoolName;
	int age;
	double marks;
	String email;
	String mobileNo;
	
public Student(String name, int rollNo, int age, double marks, String email, String mobileNo) {
		
		this.name = name;
		this.rollNo = rollNo;
		this.age = age;
		this.marks = marks;
		this.email = email;
		this.mobileNo = mobileNo;
	}
	
	
	void result() {
		char grade;
		if(marks>90) {
			grade = 'A';
			System.out.println("grade: "+grade);
		}else if(marks>70 && marks<90) {
			grade = 'B';
			System.out.println("grade: "+grade);
		}else if(marks>50 && marks<70) {
			grade = 'C';
			System.out.println("grade: "+grade);
		}else {
			System.out.println("Fail");
		}
	}
	
	void display() {
		System.out.println("Name: "+ name);
		System.out.println("Roll No: "+rollNo);
		System.out.println("School Name: "+schoolName);
		System.out.println("age: "+age);
		System.out.println("Marks: "+marks);
		System.out.println("Mobile Number: "+mobileNo);
		System.out.println("Email: "+email);
	}
	

}
