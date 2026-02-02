package com.practice;

public class InterruptMethod extends Thread{
	
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Tread inturrupted :"+e.getMessage());
		}
	}

	public static void main(String[] args) {
		
		InterruptMethod i = new InterruptMethod();
		
		i.start();
		i.interrupt();
        
		

	}

}
