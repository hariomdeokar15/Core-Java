package com.comparator.example;

import java.util.ArrayList;
import java.util.Comparator;

class Student{
	
	private String name;
	private double cgpa;
	private String rollNo;
	
	public Student(String name, double cgpa, String rollNo) {
		
		this.name = name;
		this.cgpa = cgpa;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

	public String getRollNo() {
		return rollNo;
	}
	
	
}

public class Example3 {
	
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>(); 
		
		students.add(new Student("Hariom", 8.8, "912854E"));
		students.add(new Student("Atharv Joshi", 9.8, "912836E"));
		students.add(new Student("Aditya", 9.2, "912836E"));
		students.add(new Student("Atharv", 9.8, "912836E"));
		students.add(new Student("Pritam", 7.8, "912836E"));
		
//		students.sort((a, b)->{
//			if(a.getCgpa()-b.getCgpa()>0) {
//				return -1;
//			}else if(a.getCgpa()-b.getCgpa()<0) {
//				return 1;
//			}else {
//				return a.getName().compareTo(b.getName());
//			}
//			
//		});
		
		Comparator<Student> comparator = Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName);
		
		students.sort(comparator);
		
		for(Student s: students) {
			
			System.out.println("Name: "+s.getName());
			System.out.println("CGPA: "+s.getCgpa());
			System.out.println("ROll Number: "+s.getRollNo()+"\n");
			System.out.println("------------------------------------");
		}
	}

}
