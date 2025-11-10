package com.hariom;

public class ThisKeyword{
	  String name;
	  String qualification;
	  int experiance;
	
	  ThisKeyword(String name,String qualification, int experiance){
		  this.name = name;
		  this.qualification = qualification;
		  this.experiance = experiance;
		  
	  }
	  void print() {
		  System.out.println("Candidate name is :"+name);
		  System.out.println("Qualification :"+qualification);
		  System.out.println("Experiance :"+experiance);
	  }

	public static void main(String[] args) {
		ThisKeyword t = new ThisKeyword("Hariom", "BE", 3);
		t.print();
		

	}

}
