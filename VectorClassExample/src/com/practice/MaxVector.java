package com.practice;

import java.util.Vector;

public class MaxVector {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>(); 
		
		v.add(10);
		v.add(20);
		v.add(40);
		v.add(50);
		v.add(10);
		v.add(35);
		v.add(90);
		
		int max  = v.get(0);
		
		for(int i = 0;  i<v.size(); i++) {
			if(v.get(i)>max) {
				max = v.get(i);
			}
		}
		
		System.out.println("Max Number From Vector is : "+max);

	}

}
