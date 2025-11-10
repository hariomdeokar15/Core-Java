package com.practice.singletoneclass;

class Singletone{
	
	private static Singletone singletone = new Singletone();
	
	private Singletone() {}
	
	public static Singletone getInstance() {
		return singletone;
	}
	
	public void demonstrate() {
		System.out.println("Demo method for singletone");
	}
}
public class Exampleone {
	public static void main(String args[]) {
		
		Singletone s = Singletone.getInstance();
		s.demonstrate();
		
		
		
	}
}
	



