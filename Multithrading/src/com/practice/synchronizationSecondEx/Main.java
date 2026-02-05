package com.practice.synchronizationSecondEx;

public class Main {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		ThreadClass t1 = new ThreadClass("MyThread", counter);
		
		t1.start();
		System.out.println(counter.getCount());

	}

}
