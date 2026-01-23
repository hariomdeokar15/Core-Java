package com.practice;

public class Test {
	
	public static void main(String[] args) {
		 
		System.out.println(Days.SATURDAY);
		
		Days s =  Days.WEDNESDAY;
		System.out.println(s.ordinal());
		
		s.display();
		
		for(Days day: Days.values()) {
			System.out.println(day);	
		}
		
		Days day = Days.MONDAY;
		System.out.println(day.getHindi());
		
		switch(day) {
		case MONDAY:
			System.out.println("this is :"+day);
			
		case TUESDAY:
			System.out.println("This is :"+Days.TUESDAY);
			
		default:	
			System.out.println("Holidays");
		
		}
		
		switch(day) {
		case MONDAY ->
			System.out.println("M");
		
		
		case TUESDAY ->{
			System.out.println("M");
		
		}
		}
	}

}
