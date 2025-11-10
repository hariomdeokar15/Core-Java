package com.practice.instanceinitializerblock;
class A1{
	
	A1(){
		System.out.println("Parent class construcror");//Print first
	}
}
class A2 extends A1 {
	{
		System.out.println("This is Initial initializer block");//print second
	}
	A2(){
		super();
		System.out.println("this is child class constructor");//print last
	}
}
public class SuperConstructor {

	public static void main(String[] args) {
		
		A2 a = new A2();

	}

}
