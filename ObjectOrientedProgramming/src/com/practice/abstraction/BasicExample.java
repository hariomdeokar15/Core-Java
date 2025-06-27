package com.practice.abstraction;

abstract class Animal{
	public abstract void sound();
}
class Dog extends Animal{

	@Override
	public void sound() {
		System.out.println("Dog Barks");
	}
}
class Lion extends Animal{

	@Override
	public void sound() {
		System.out.println("Lion Roar");	
	}
	
}
public class BasicExample {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.sound();
		
		Lion lion = new Lion();
		lion.sound();
	}

}
