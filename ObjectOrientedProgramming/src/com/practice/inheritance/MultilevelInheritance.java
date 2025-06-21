package com.practice.inheritance;

class A{
	
	public void a() {
		System.out.println("This is the method of class a");
	}
	
}
class B extends A{
	public void b() {
		System.out.println("This is the method of class a");
	}
	
}
class C extends B{
	public void c() {
		System.out.println("This is the method of class a");
	}
	
}

public class MultilevelInheritance  extends C{

	public static void main(String[] args) {
		MultilevelInheritance obj = new MultilevelInheritance();
		
		obj.a();
        obj.b();
        obj.c();
        
          
	}

}
