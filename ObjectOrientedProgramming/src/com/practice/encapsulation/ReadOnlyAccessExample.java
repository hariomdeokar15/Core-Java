package com.practice.encapsulation;

public class ReadOnlyAccessExample {
	
	private String name;
	private int age;
	
	public ReadOnlyAccessExample(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}

	public static void main(String[] args) {
		ReadOnlyAccessExample r = new ReadOnlyAccessExample("Hariom", 24);
		
		System.out.println(r.getName());
		System.out.println(r.getAge());

	}

}
