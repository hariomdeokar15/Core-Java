package com.practice.polymorphism;

interface OS{
	public void show();
	
}
class Android implements OS{
	public void show() {
		System.out.println("This is Android Operating System");
	}
}
class IOS implements OS{
	public void show() {
		System.out.println("This is OS");
	}
}
class OSFactory{
	static OS getOS(String type){
		if(type.equals("Android")) return new Android();
		else return new IOS();
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		
		OS os = OSFactory.getOS("IOS");
		os.show();
		

	}

}
