package com.practice.encapsulation;

import java.util.Scanner;

public class UsingScannerClass {
	
    private String product1;
    private String product2;
    private String product3;
    
    public void setProduct1(String product) {
    	this.product1 = product;
    }
    public void setProduct2(String product) {
    	this.product2 = product;
    }
    public void setProduct3(String product) {
    	this.product3 = product;
    }
    public String getProduct1() {
    	return this.product1= product1;
    }
    public String getProduct2() {
    	return this.product2= product2;
    }
    public String getProduct3() {
    	return this.product3= product3;
    }

	public static void main(String[] args) {
		
		UsingScannerClass u = new UsingScannerClass();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product1: ");
		String product1 = sc.next();
		
		System.out.println("Enter Product1: ");
		String product2 = sc.next();
		
		System.out.println("Enter Product1: ");
		String product3 = sc.next();
		
		u.setProduct1(product1);
		u.setProduct2(product2);
		u.setProduct3(product3);
		
		String p1 = u.getProduct1();
		String p2 = u.getProduct2();
		String p3 = u.getProduct3();
		
		System.out.println("Product1 :"+p1);
		System.out.println("Product2 :"+p2);
		System.out.println("Product3 :"+p3);
	}

}
