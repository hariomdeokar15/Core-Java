package com.practice.encapsulation;

public class WriteOnly {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age = age;	
	}
	

	public static void main(String[] args) {
		
		WriteOnly w = new WriteOnly();
		w.setName("Hariom");
		w.setAge(25);
		
		

	}

}
