package com.importanttopics;

public class ToStringMethod {
	 
	int a =10;
	
	public String toString() {
	   return "a = "+a;	
	}
	
	public static void main(String[] args) {
		ToStringMethod t = new ToStringMethod();
		
		System.out.println(t.toString());
	}

}
