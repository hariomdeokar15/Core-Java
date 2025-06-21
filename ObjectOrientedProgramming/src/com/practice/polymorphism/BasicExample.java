package com.practice.polymorphism;

class Animal{
	public void sound() {
		System.out.println("Animal Make sound");
	}
	public void breed() {
		System.out.println("Animal has verity of breeds");
	}
	public void Print() {
		System.out.println("Print Statement");

	}
}class Dog extends Animal{
	
	public void sound() {
		System.out.println("DOg barks");
	}
	public void breed() {
		System.out.println("Breed: Jerman Seaford");
	}
	public void colour() {
		System.out.println("Dog colour is black");
	}
	
}
public class BasicExample {
	
	public static void main(String args[]) {
		Animal a = new Animal(); // creating object of parent class with 
				                 //reference and type of parent class
		a.sound();//calling parent class method
		
		Animal as = new Dog(); //creating object of type child class by 
                                //reference of parent class of 
		
		as.sound();  //we can call all overridden and other methods of parent class 
		as.breed();  //using child class type object but we cannot call child class other methods
		as.Print(); //using this type of object, and result of overridden method is child class method output 
		//as.colour(); //we cannot call other method of child class
		
		Dog d = new Dog();
		d.breed();
		d.sound();
		d.colour();
	}
}
