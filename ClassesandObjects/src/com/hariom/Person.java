package com.hariom;

 class Person {
	
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
		
	}
	
	void display() {
		System.out.println("Hello I am "+name+" and I am stepping into my "+age+"th");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Person p = new Person("Hariom", 26);
         p.display();
         
	}

	

}

