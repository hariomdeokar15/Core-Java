package com.practice.aggrigationandcomposition;

class Student{
	int id;
	String name;
	
	Student(int id, String name){
		this.id = id;
		this.name = name;
	}
}
 class Department{
	 String deptName;
	 Student student;
	 Department(String deptName, Student student){
		 this.deptName = deptName;
		 this.student = student;
	 }
	 public void showdetails() {
		 System.out.println(deptName+" department has a student :"+student.name);
	 }
 }

public class AggregationExample {

	public static void main(String[] args) {
		
		Student s = new Student(101, "Rahul");
		
		Department d= new Department("Civil", s);
		
		d.showdetails();

	}

}
