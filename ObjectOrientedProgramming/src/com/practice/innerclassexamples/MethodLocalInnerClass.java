package com.practice.innerclassexamples;

public class MethodLocalInnerClass {
	
	public void myMethod() {
		
		String className = "Method Local Inner class";
		
		class InnerClass{
		      
			public void innerclassMethod() {
				System.out.println("Class name is : "+className);
			}
		}
		
		InnerClass inner = new InnerClass();
		inner.innerclassMethod();
		
	}

	public static void main(String[] args) {
		MethodLocalInnerClass m = new MethodLocalInnerClass();
		
		m.myMethod();

	}

}
