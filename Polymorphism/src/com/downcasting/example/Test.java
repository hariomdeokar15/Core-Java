package com.downcasting.example;

class Animal{
	void sound() {
		System.out.println("Animal can bark");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("Dog Barks");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("Cat can make Sound");
	}
}
public class Test {

	public static void main(String[] args) {
		Animal c = new Cat();
		Animal a = new Dog();
				
		//Dog d = (Dog) c;//this throws error because downcasting is unsafe in case of herarchicle inheritance to avoid this follow following methos
		
		if(a instanceof Dog) {
			
			Dog d1 = (Dog) a;
			d1.sound();
			
		}

	}

}
