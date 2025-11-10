package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Example1 {

	public static void main(String[] args) throws IOException {
		//How to create a object of BefferedReader
		
		BufferedReader b = new BufferedReader(new FileReader("C:\\Users\\bomba\\OneDrive\\Desktop\\Backend\\Core Java\\input.txt"));
		String s = b.readLine();
		System.out.println("First Line"+s);
		b.close();
	}

}
