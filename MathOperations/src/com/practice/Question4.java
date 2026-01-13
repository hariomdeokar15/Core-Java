package com.practice;

public class Question4 {

	public static void main(String[] args) {
		
		
//		7️⃣ Distance between two points
//
//		Problem:
//		Find distance between points (x1, y1) and (x2, y2).
		
		int x1, y1, x2, y2;
		x1 = 5;
		y1 = 3;
		x2 = 8;
		y2 = 5;
		
		
		double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.println("The distance between two points are : "+ distance);
		
		
		

	}

}
