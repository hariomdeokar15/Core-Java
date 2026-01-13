package com.practice;

import java.util.Scanner;

public class Question6 {
	
	public static void main(String[] args) {
		
//		🔟 Pagination problem
//
//		Problem:
//		Total records = 102
//		Records per page = 10
//		Find total pages.
//
//		Expected Output: 11
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Records");
		double records = sc.nextDouble();
		
		System.out.println("Enter the Recodes per page");
		double recordsPerPage= sc.nextDouble();
		
		int numOfPages = (int)Math.ceil(records/recordsPerPage);
		
		System.out.println("Number of Pages: "+numOfPages);
		


	}

}
