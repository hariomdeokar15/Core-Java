package com.practice;

public class Question2 {

	public static void main(String[] args) {
		//Round a double value
		
		double d = 98.6;
		System.out.println("Nearest Possible value of "+d+" is: "+Math.round(d));
		
		//Divide 53 items into groups of 10.
		//How many groups needed?
		
		int items = 53;
		
		
		int findGroups = (int)Math.ceil((items/10.0));
//		int findGroups = Math.ceilDiv(items, 10.0); NOTE - ceilDiv does not support double or float
		
		System.out.println("If 53 items devided into 10 groups then we need "+findGroups+" Groups");
		
		//How many full teams can be made from 29 players if each team has 5 players?
		int players = 29;
		int eachTeamPlayersCount = 5;
		
		int teams = Math.floorDiv(players, eachTeamPlayersCount);
		
		System.out.println("The full teams can be made from 29 players are "+teams);
		
		

	}

}
