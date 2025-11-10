package com.practice.interfaceexample;

interface Engine{
	void start();
	void rotatingspeed();
}
interface Tire{
	void rotate();
	void rotatingspeed();
}
interface Vehical extends Engine, Tire{
	void start();
}
public class MultipleInheritanceExample implements Vehical {
	
	public void start() {
		System.out.println("Engine Started");
	}
	public void rotatingspeed() {
		System.out.println("Engine has rotating speed 120kmph");
	}
	public void rotate() {
		System.out.println("Tires are roatating");
	}
	

	public static void main(String[] args) {
		 
		MultipleInheritanceExample m = new MultipleInheritanceExample();
           m.start();
           m.rotatingspeed();
           m.rotate();
	}

}
