package com.comparator.example;

import java.util.ArrayList;
import java.util.Comparator;

class Person{
	
	private int age;
	private String name;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}

public class Example2 {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<>();
		
		list.add(new Person("Hariom", 25));
		list.add(new Person("Jayesh", 26));
		list.add(new Person("Pratik", 24));
		list.add(new Person("Prakash", 24));
		list.add(new Person("Rohit", 18));
		list.add(new Person("Aman", 17));
		
//		Comparator<Person> c = Comparator.comparing(Person::getAge).reversed().thenComparing(Person::getName); shortcut
//		list.sort(c);
		list.sort((a, b)-> {
			if(a.getAge()> b.getAge()) {
				return 1;
			}else if(a.getAge() < b.getAge()) {
				return -1;
			}else {
				return a.getName().compareTo(b.getName());
				
			}		
		});
		

		for(Person p: list) {
			System.out.println(p.getName()+" : "+ p.getAge());
		}
		
		
		
		
		
		
		

	}

}
