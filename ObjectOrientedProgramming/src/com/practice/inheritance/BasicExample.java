package com.practice.inheritance;
class WildAnimal{
	public void sound() {
		System.out.println("The Animals have unique Sounds");
	}
	public void types() {
		System.out.println("There are two types of animal vegiteriance and non vegitarians");
	}
}
class Lion extends WildAnimal{
	public void sound() {
		System.out.println("Lion Roar");
		
	}
	public void hunt() {
		System.out.println("Lion Can hunt");
	}
}

public class BasicExample {

	public static void main(String[] args) {
		
		WildAnimal w = new WildAnimal();//this is WildAnimal class object we can Access
		w.sound();                      //only method belong to this class
		
		Lion l = new Lion();  //this is Lion class object we can Access
		l.sound();            //only method belong to Lion class
		
		WildAnimal wl =  new Lion();// this is Object created by using reference WildAnimal class
		wl.sound();                 //But the object of Lion class using this object we 
		                            //Access only the methods belongs to WildAnimal class
	

	}

}
