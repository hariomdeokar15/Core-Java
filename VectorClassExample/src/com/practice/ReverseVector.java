package com.practice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Vector;

public class ReverseVector {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
		
		
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		
		//Collections.reverse(v);
		
		System.out.println(v);
		
		Vector<Integer> v1 = new Vector<>();
		
		for(int i = v.size()-1; i>=0; i--) {
			v1.add(v.get(i));
		}
		System.out.println("Reverse Vector: "+v1);
		
		LinkedList<Integer> list  = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		LinkedList<Integer> list2  = new LinkedList<>();
		for(int i = list.size()-1; i>=0; i--) {
			list2.add(list.get(i));
		}
		System.out.println("Reverse List: "+list2);

	}

}
