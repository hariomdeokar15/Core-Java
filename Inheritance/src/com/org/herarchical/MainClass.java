package com.org.herarchical;

public class MainClass {
	
	public static void main(String[] args) {
		Person p = new Student("Hariom", 25, "Hari123", "A");
		Student s = new Student("Hariom", 25, "Hari123", "A");
		Person st = new Teacher("Ramesh sir", 53, "123", "Math");
		
		p.displayInfo();
		s.displayInfo();
		st.displayInfo();
	}

}
