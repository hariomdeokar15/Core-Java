package com.practice.innerclassexamples;
abstract class Anonymus{
	abstract void greet();
}
public class AnonymusClass {

	public static void main(String[] args) {
		
		Anonymus a = new Anonymus() {
			void greet() {
				System.out.println("This is Example of Anonymus class");
			}
		};
		a.greet();

	}

}
