package com.practice.encapsulation;

public class ImmutableClassExample {
	
	private final String name;
	private final int age;
	
	ImmutableClassExample(String name, int age)
	{
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
		
		ImmutableClassExample obj = new ImmutableClassExample("Hariom", 24);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		

	}

}
