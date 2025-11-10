package com.practice.interfaceexample;

public class BasicExample implements BasicExampleInterface {
	
	public void sound() {
		System.out.println("Every Spesiec on Earth has there own specific sounds");
	}
	public void breed() {
		System.out.println("Every spesice divided into different Species");
	}

	public static void main(String[] args) {
		BasicExample b = new BasicExample();
		
		b.sound();
		b.breed();

	}

}
