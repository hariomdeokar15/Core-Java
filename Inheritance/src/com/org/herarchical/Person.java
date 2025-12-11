package com.org.herarchical;

public class Person {
	
	String name;
	int age;
	String id;
	
	Person(String name, int age, String id){
		this.name = name;
		this.age = age;
		this.id= id;
	}
	
	public void displayInfo() {
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		System.out.println("id: "+id);
	}

}
