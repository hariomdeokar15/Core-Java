package com.practice.inheritance;

class Animal{
	String brid;
	
	Animal(String brid){
		this.brid = brid;
	}
	
}
class Dog extends Animal{

	Dog(String brid){
		super(brid);
	}
	public void bark() {
		System.out.println(brid+" Dogs can bark Loudly");
	}
}

public class IsARelationExample {

	public static void main(String[] args) {
		
		Dog d = new Dog("Rotwiller");
		
		d.bark();

	}

}
/*In the above code Dog is type of animal 
  It Shows is a relationship*/
