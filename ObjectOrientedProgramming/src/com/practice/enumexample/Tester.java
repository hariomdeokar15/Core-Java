package com.practice.enumexample;

public class Tester {

	public static void main(String[] args) {
		
		Weekdays w = Weekdays.MONDAY;
		System.out.println(w);        //direct access constants from Enum
 
		Trafficlight t = Trafficlight.GREEN;
		System.out.println(t);
		System.out.println(t.getDiscription());
		
		Trafficlight t1 = Trafficlight.YELLOW;
		System.out.println(t1);
		System.out.println(t1.getDiscription());
		
		Trafficlight t2 = Trafficlight.RED;
		System.out.println(t2);
		System.out.println(t2.getDiscription());
		
		Weekdays w2 = Weekdays.MONDAY;
		System.out.println(w2.toString());
		
		Weekdays w3 = Weekdays.TUESDAY;
		System.out.println(w3.toString());
		
		Weekdays w4 = Weekdays.WEDNESDAY;
		System.out.println(w4.toString());
		
		Weekdays w5 = Weekdays.FRIDAY;
		System.out.println(w5.name());
		
		
	}

}
