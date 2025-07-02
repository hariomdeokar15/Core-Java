package com.practice.singletoneclass;

public class PreventCloningExample implements Cloneable{
	
	private static PreventCloningExample instance = new PreventCloningExample();
	
	private PreventCloningExample() {System.out.println("Singletone instance created");}
	
	public static PreventCloningExample getInstance() {
		return instance;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException{
		throw new CloneNotSupportedException("Cloning is not supported in Singletone class");
	}
	
	protected void demoMethod() {
		System.out.println("This is demoMethod for Singletone class");
	}

	public static void main(String[] args) {
		
	    try {
	    	PreventCloningExample p = PreventCloningExample.getInstance();
	    	p.demoMethod();
	    	
	    	PreventCloningExample p2 = (PreventCloningExample) p.clone();
	    }catch(CloneNotSupportedException e) {
	    	System.out.println(e.getMessage());
	    }
		
   
	}

}
