package com.practice;

public class JoinMethod implements Runnable{
	
	@Override
	public void run() {
		
		for(int i = 0; i<20; i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		JoinMethod j = new JoinMethod();
		
		Thread t = new Thread(j);
	
		
		t.start();
		t.join();
		
		for(int i = 0; i<10; i++) {
			System.out.println("World");
			try {
				Thread.sleep(500);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

	

}
