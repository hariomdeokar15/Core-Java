package com.practice;

public enum Days {
	
	MONDAY("maonday", "somwar"), 
	TUESDAY("tuesday", "mangalwar"), 
	WEDNESDAY("wednesday", "budhwar"),
	THURSDAY("thursday", "guruwar"), 
	FRIDAY("friday", "shukrwar"), 
	SATURDAY("saturday", "shanivar"), 
	SUNDAY("sunday", "ravivar");
	
	
	private String lower;
	private String hindi;
	
	private Days(String lower, String hindi) {
		this.lower = lower;
		this.hindi = hindi;
	}

	public String getLower() {
		return lower;
	}

	public String getHindi() {
		return hindi;
	}
	
	public void display() {
		System.out.println("Today is :"+this.name());
	}
	
	

}
