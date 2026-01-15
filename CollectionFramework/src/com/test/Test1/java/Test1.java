package com.test.Test1.java;

class Parent {
    void show() {
        System.out.println("Parent show");
    }

    void common() {
        System.out.println("Parent common");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Child show");
    }

    void childOnly() {
        System.out.println("Child only method");
    }
}


public class Test1 {
	
	public static void main(String[] args) {
		
		Parent p = new Child();
		
		p.show();
		p.common();
		
		
		Child c = new Child();
		c.show();
		c.common();
		c.childOnly();
		
		System.out.println("-----------------------------------------");

		



		
	}

}
