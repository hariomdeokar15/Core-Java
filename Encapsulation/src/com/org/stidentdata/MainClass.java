package com.org.stidentdata;

public class MainClass {
   
	public static void main(String args[]) {
		Student st = new Student();
		
		st.setName("Hariom");
		st.setAge(25);
		st.setCourse("Java FullStack");
		
		System.out.println("Name: "+st.getName());
		System.out.println("Age: "+st.getAge());
		System.out.println("Course: "+st.getCourse());
	}
}
