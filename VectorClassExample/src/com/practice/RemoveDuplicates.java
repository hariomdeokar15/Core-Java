package com.practice;

import java.util.HashSet;
import java.util.Vector;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
		
		v.add(2);
		v.add(2);
		v.add(3);
		v.add(1);
		v.add(4);
		v.add(5);
		v.add(3);
		v.add(6);
		System.out.println("Original Vector: "+v);
//		for(int i = 0; i<v.size(); i++) {
//			
//			for(int j = i+1; j<v.size(); j++) {
//				
//				if(v.get(i).equals(v.get(j))) {
//					v.remove(j);
//					j--;
//				}
//			}
//		}
//		
//		System.out.println("Vector after removing duplicates: "+v);
		
		HashSet<Integer> h = new HashSet<>(v);
		
		v.clear();
		
		v.addAll(h);
		
		System.out.println("Vector after removing duplicates: "+v);

	

	}

}
