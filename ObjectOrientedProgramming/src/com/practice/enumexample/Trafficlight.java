package com.practice.enumexample;

public enum Trafficlight {
	
	GREEN("GO"),
	YELLOW("GO SLOW"),
	RED("STOP");
	
	private String discriotion;
	
	Trafficlight(String discriotion){
		this.discriotion = discriotion;
	}
	public String getDiscription() {
		return discriotion;
	}

}
