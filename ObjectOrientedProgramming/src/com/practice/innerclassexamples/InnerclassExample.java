package com.practice.innerclassexamples;

public class InnerclassExample {
	
	public class Motion{
		public void defination() {
			System.out.println("The change in position of object with respect to time and reference point is called as Motion");
		}
	}

	public static void main(String[] args) {
		
		InnerclassExample m = new InnerclassExample();
		InnerclassExample.Motion motion = m.new Motion();
		
		motion.defination();
	}

}
