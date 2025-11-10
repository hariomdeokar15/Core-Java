package com.practice.encapsulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UnmodifiableList {
	
	private List<String> subjects = new ArrayList<>();
	
	public void addList(String subject) {
		subjects.add(subject);
	}
	
	public List<String> getList(){
		return Collections.unmodifiableList(subjects);
	}

	public static void main(String[] args) {
		
		UnmodifiableList u = new UnmodifiableList();
		
		u.addList("Hariom");
		u.addList("Pratik");
		u.addList("Jayesh");
		
		List<String> s = u.getList();
		
		for(String print : s) {
			System.out.println(print);
		}

	}

}
