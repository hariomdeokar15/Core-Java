package com.org.construcorchaining;

public class User {
	
	long id;
	String name;
	double income;
	
	User(){
		this(0, "Unknown", 0.0);
	}
	User(int id){
		this(id, "Unknown", 0.0);
	}
	User(int id, String name){
		this(id, name, 0.0);
	}
	
    User(int id, String name, double income) {
		this.id = id;
		this.name = name;
		this.income = income;
	}
    void display() {
    	System.out.println("Users ID: "+id);
    	System.out.println("User name: "+name);
    	System.out.println("User income"+income);
    }

	public static void main(String[] args) {
		User u = new User();
		u.display();
        
        System.out.println("------------------------------");
        User u1 = new User(10);
        u1.display();
        
        System.out.println("------------------------------");
        User u2 = new User(10, "Hariom");
        u2.display();
        
        System.out.println("------------------------------");
        User u3 = new User(10, "Hariom", 100000.00);
        u3.display();

	}

}
