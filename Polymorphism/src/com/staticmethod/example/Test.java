package com.staticmethod.example;

class Parent {
	  static void show() {
	        System.out.println("Parent");
	    }

   
}
class Child extends Parent {
     static void show() {
        System.out.println("Child");
    }
}

public class Test {
	public static void main(String[] args) {
		Parent p = new Child();
        p.show(); //Calling parent class even the code object is of child clas
       
    }
   
}



