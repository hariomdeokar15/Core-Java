package com.practice.encapsulation;

public class ValidationLogic {
	
	private int age;
	
	public void setAge(int age) {
		if(age>=0) {
			this.age = age;
		}else {
			throw new IllegalArgumentException("Age cannot be negitive");
		}
	}
	public int getAge() {
		return this.age;
	}

	public static void main(String[] args) {
		ValidationLogic v = new ValidationLogic();
		
		try {
			v.setAge(10);
			System.out.println("The age of person is: "+v.getAge());
		}catch(IllegalArgumentException e) {
		    System.out.println("Error: "+e.getMessage());
		}
	}

}
