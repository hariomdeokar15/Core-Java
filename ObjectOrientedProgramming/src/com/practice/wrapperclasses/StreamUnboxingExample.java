package com.practice.wrapperclasses;

import java.util.Arrays;
import java.util.List;

public class StreamUnboxingExample {

	public static void main(String[] args) {
		
		List<Integer>  marks = Arrays.asList(20, 30, 45, 60);
		
		double average = marks.stream().mapToInt(Integer::intValue).average().orElse(0);
		
		System.out.println(average);

	}

}
