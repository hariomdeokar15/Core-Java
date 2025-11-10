package com.practice.enumexample;

public enum Weekdays {
	
	MONDAY, TUESDAY,WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY, SUNDAY;
	
	@Override
	public String toString() {
		return switch(this) {
		case MONDAY : yield "Day 1";
		case TUESDAY : yield "Day 2";
		case WEDNESDAY : yield "Day 3";
		case THRUSDAY : yield "Day 4";
		case FRIDAY : yield "Day 5";
		case SATURDAY : yield "Day 6";
		case SUNDAY: yield "Day 7";
		};
		
	}

}
