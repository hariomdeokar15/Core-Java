package com.practice.singletoneclass;

public class BIllPughSingletone {
	
	private BIllPughSingletone() {}
	
	private static class Holder{
		private static final BIllPughSingletone instance = new BIllPughSingletone();
	}
	
	public static BIllPughSingletone getInstance() {
		return Holder.instance;
	}
	
	protected void otherMerthod() {
		System.out.println("This is Other method of protected class");
	}
	
	

	public static void main(String[] args) {
		BIllPughSingletone b= BIllPughSingletone.getInstance();
		b.otherMerthod();
	}

}
