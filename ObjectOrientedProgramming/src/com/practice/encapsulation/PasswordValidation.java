package com.practice.encapsulation;

public class PasswordValidation {
	
	private String password;
	
	public void setPassword(String password) {
		
		if(password.length()>= 8 &&
		   password.matches(".*[A-Z].*")&&
		   password.matches(".*[a-z].*")&&
		   password.matches(".*\\d.*")) {
			this.password = password;
		}else {
			throw new IllegalArgumentException("Weak Password! must be 8 charector and contain at least one uppercase, lowercase and digit");
		}
		
	}
	
	public String getPassword() {
		return "********";
	}
	
	public boolean isCorrectPassword(String input) {
		return password != null && password.equals(input);
	}

	public static void main(String[] args) {
		PasswordValidation p = new PasswordValidation();
		
		try {
			p.setPassword("Hari1234");
			System.out.println("Password set Successfully!");
		}catch(IllegalArgumentException e) {
			System.out.println("Error :"+e.getMessage());
		}
		
		if(p.isCorrectPassword("Hari1234")) {
			System.out.println("Password Matched");
		}else {
			System.out.println("Incorrect Password");
		}

	}

}
