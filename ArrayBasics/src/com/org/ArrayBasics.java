package com.org;

import java.util.Arrays;

public class ArrayBasics {

	public static void main(String[] args) {
		
		//how to create array
		int[] arr = new int[4];
		
		//how to initialize array
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		
		//How to create, Initialize and assign array in single line
		int[] arr2 = {1, 2, 3, 4};
		//**how to print array**//
		
		//Using for each loop
		
		for(int num: arr) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		
		//Using tostring method
		
		System.out.println(Arrays.toString(arr));
		
		//Using simple for loop method
		
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
		
		
		
		
		

	}

}
