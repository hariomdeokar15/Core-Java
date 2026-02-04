
package com.practice.synchronization;

public class Counter {
	
	private int count = 0;
	
	public int increament() {
		count++;
		return count;
	}
	
	public int getCount() {
		return count;
	}

}
