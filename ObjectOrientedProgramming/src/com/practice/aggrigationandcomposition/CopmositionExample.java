package com.practice.aggrigationandcomposition;

class Engine{
	void start() {
		System.out.println("Engin started");
	}
}
class Car{
	Engine engine = new Engine();
	void drive() {
		engine.start();
		System.out.println("car is driving");	
	}
}
public class CopmositionExample {

	public static void main(String[] args) {	
		Car c = new Car();		
		c.drive();
	}
}
/*In this code car is contain engine and car cannot start without 
 * Engine that means tightly coupled and strong Association thats
 *  why it is called Composition*/
