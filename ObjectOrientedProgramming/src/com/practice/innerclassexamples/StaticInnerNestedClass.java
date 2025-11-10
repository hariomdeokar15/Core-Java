package com.practice.innerclassexamples;

public class StaticInnerNestedClass {
	
	static class Inner{
		public void print() {
			System.out.println("This is inner static class method");
		}
	}

	public static void main(String[] args) {
		
		StaticInnerNestedClass.Inner i = new StaticInnerNestedClass.Inner();
		i.print();

	}

}
