package com.practise;

import java.util.Scanner;

public class RemoveWhiteSpaces {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String inputString = sc.nextLine();
		
		String newString = inputString.replaceAll("\\s+", "");
		
		System.out.println(newString);
		
		sc.close();
		String result = "";
		
		for(int i = 0; i< inputString.length(); i++) {
			
			
			if(inputString.charAt(i) != ' ') {
				result += inputString.charAt(i);
			}
			
		}
		
		System.out.println("String without using inbuild function: "+result);
		
	}

}
