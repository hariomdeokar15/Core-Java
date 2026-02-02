package com.practice;

public class ExampleUsingThreadClass extends Thread{
	
	ExampleUsingThreadClass(String name){
		super(name);
	}
	
	public void run() {
		
		for(int i = 0; i<10; i++) {
			String a = "";
			for(int j=0; j<10000; j++) {
				a += a;
				
			}
			System.out.println(Thread.currentThread().getName()+" - Priority: "+ Thread.currentThread().getPriority());
			
		}
		
	}
	
	public static void main(String[] args) {
		 
		ExampleUsingThreadClass t1 = new ExampleUsingThreadClass("Hariom");
		ExampleUsingThreadClass t2 = new ExampleUsingThreadClass("John");
		ExampleUsingThreadClass t3 = new ExampleUsingThreadClass("sahil");
		
		t1.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(NORM_PRIORITY);
		
	
		t1.start();
		t2.start();
		t3.start();
		
//		for(;;) {
//			System.out.println("WORLD");
//			try {
//				Thread.sleep(2000);
//			}catch(InterruptedException e) {
//				e.printStackTrace();
//				
//			}
//		}
		
		
		
	}

}
