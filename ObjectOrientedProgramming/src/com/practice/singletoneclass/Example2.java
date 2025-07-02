package com.practice.singletoneclass;

class SingletoneExample2{
	
	
	private static SingletoneExample2 instance;
	
	private SingletoneExample2() {}
	
	public static SingletoneExample2 getInstance() {
		if(instance == null) {
			instance = new SingletoneExample2();
		}
		return instance;
	}
	
	protected void showMessage() {
		System.out.println("This message is of SinglotoneExample2 class");
	}
}
public class Example2 {

	public static void main(String[] args) {
		SingletoneExample2 s = SingletoneExample2.getInstance();
		s.showMessage();

	}

}
