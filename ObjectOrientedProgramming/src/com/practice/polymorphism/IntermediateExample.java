package com.practice.polymorphism;

class Shape{
	void draw() {
		System.out.println("Drow: ");
	}
}
class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("circle");
	}
}
	
class Rectriangle extends Shape{
	@Override
	void draw() {
		System.out.println("Rectriangle");
	}
}

public class IntermediateExample {

	public static void main(String[] args) {
		
		Shape[] shapes = {new Shape(), new Circle(), new Rectriangle() };
//		Shape s1 = new Shape();
//		s1.draw();
		
		for(Shape s: shapes) {
			
			s.draw();
		}
			
		

	}
}
	
