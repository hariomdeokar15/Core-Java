package com.practice.synchronizationSecondEx;

public class ThreadClass extends Thread{
	


	private String name;
	private Counter counter;

	public ThreadClass(String name, Counter counter){
		this.name = name;
		this.counter = counter;
	}
	
	
	
	public void run() {
		for(int i = 0; i<100; i++) {
			counter.increament();
			
		}
	}
	
	

}
