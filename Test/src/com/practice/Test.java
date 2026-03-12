package com.practice;

public class Test {
	
	int age;
	String name;
	
	Test(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		
		Test t1 = (Test) obj;
		if(this.age == t1.age && this.name.equals(t1.name) ) {
			return true;
			
		}
		return false;
		
	}
	
	public String toString() {
		return "Test class Object";
	}
	public static void main(String[] args) {
		
		Test t = new Test(25, "Hariom");
		Test t2 = new Test(25, "Hariom");
		
		String s1 = "Hariom";
		String s2 = "Hariom";
		System.out.println(s1.equals(s2));
		System.out.println(t.equals(t2));

	}
}
