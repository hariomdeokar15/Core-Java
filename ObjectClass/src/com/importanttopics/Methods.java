package com.importanttopics;

public class Methods {
	
	int id;
	String name;
	
	public Methods() {}
	
	public Methods(int id, String name) {
		this.id = id;
		this.name=name;
		
	}
	
	public String toString() {
		return "Methods{ id:"+id+" name:"+name+"}";
	}

	public static void main(String[] args) {
		
		//toString Default behavior
		Methods m = new Methods();
		System.out.println(m);
		
		//Overriding toString Method
		//toString() is overridden to provide meaningful object representation.
		Methods s = new Methods(10, "Hariom");
		System.out.println(s.toString());
		
		
		

	}

}
