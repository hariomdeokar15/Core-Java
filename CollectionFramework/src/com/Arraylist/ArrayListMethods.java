package com.Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListMethods {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.add(1, 2);
		
		System.out.println(list);
		list.add(5, 6);
		System.out.println(list);
		
		list.addAll(list);
		
		System.out.println(list);
		list.set(5, 5);
		System.out.println(list);
		
		
		list.remove(1);
		System.out.println(list);
		
		Integer num = 2;
		list.remove(Integer.valueOf(2));
		System.out.println(list);
		
		//Remove Elements
		list.remove(num);
		System.out.println(list);
		
		//Remove element on the basis of condition using lambda expression
		list.removeIf(n -> n == 2);
		System.out.println(list);
		
		//TO check weather value is contain in list or not
		System.out.println(list.contains(3));
		
	    System.out.println(list.toString());//No need to write to string method 
	    System.out.println(list);//Class automatically implements to string method
	    
	    System.out.println(list.toArray());//We cannot direct print the to array methods it returns the String representation of object
	    
	    List<Integer> list2 = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
	    
	    ArrayList<Integer> list3 = new ArrayList<>(list);
	    
	    List<ArrayList<Integer>> list4 = Arrays.asList(list);
	    
	    System.out.println(list4);
	    
	    //Convert list to default object array if we don't know the type
	    Object[] arr = list.toArray();
	    System.out.println(Arrays.toString(arr));
	    
	    //Converting to the Integer array
	    Integer[] arr2 = list.toArray(new Integer[0]);
	    System.out.println(Arrays.toString(arr2));
	    
	    //TO find the size of array
	    System.out.println(list.size());
	    
	    List<Double> doublelist = new ArrayList<>(Arrays.asList(2.2, 4.3, 5.3, 6.2, 1.9, 3.3));
	    doublelist.sort(null);
	    System.out.println(doublelist);
	    doublelist.add(3.5);
	    
	    System.out.println("After adding: "+doublelist);
	    
	    List<String> slist = Arrays.asList("Hario", "Om", "Anil");
	    System.out.println("Main list: " +slist);
	    
	    
	    try {
	    	slist.add("Pranav");
	    	System.out.println("After adding"+slist);
	    	throw new Exception("Cannot add new when list is created by using Arrays.as list method from list interface");
	    }catch(Exception e) {
	    	System.out.println(e.getLocalizedMessage());
	    	
	    }
	    
	    
	}
	
	

}
