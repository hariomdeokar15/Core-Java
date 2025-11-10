package com.practice.inheritance;

class Base{
	public void baseclass() {
		System.out.println("this is base class method");
	}
}
class Child1 extends Base{
	
	public void child1method() {
		super.baseclass();
		System.out.println("this is child 1 method with base class method call");
	}
	
}
class Child2 extends Base{
	public void child2method() {
		super.baseclass();
		System.out.println("this is child 2 method with base class method call");
	}
	
}
public class Hirarchiclal{

	public static void main(String[] args) {
		
		Child1 c1 = new Child1();
		c1.child1method();
		
		Child2 c2 = new Child2();
		c2.child2method();
		

	}

}
