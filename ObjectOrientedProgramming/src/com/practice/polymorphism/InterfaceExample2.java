package com.practice.polymorphism;

import java.util.Scanner;

interface Motor{
	public void defination();
	public void uses();
}
class SynchronusMotor implements Motor{
	
	@Override
	public void defination() {
		System.out.println("Defination : 'Synchronus MOtor is motor in which rotar has same speed as stator magnetic field'");
		
	}
	
	@Override
	public void uses() {
		System.out.println("It use in clock, Electric vehical, convarebelts etc");
		
	}
	
	
}
class Asynchronus implements Motor{

	@Override
    public void defination() {
		System.out.println("Defination: 'Asynchronus motor is also called induction motor the speed of rotor is alwayes less than the speed of stator magnetic field");
		
	}
	@Override
	public void uses() {
		System.out.println("It is use fan, pump, industrial uses etc");
		
	}
}
class GetMotor{
	static Motor getMotor(String type) {
		
		if(type.equals("SynchronusMotor")) return new SynchronusMotor();
		else return new Asynchronus();
		
	}
	public void charactristic() {
		System.out.println("We can control the speed of synchronus motor i.e we can asselerate of decelerate the Synchronus motor");
	}
}
public class InterfaceExample2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of motor you want the information of");
		System.out.println("1.SynchronusMotor");
		System.out.println("2.ASynchronusMotor");
		
		String type = sc.nextLine();
		
		Motor motor = GetMotor.getMotor(type);
		motor.defination();
		motor.uses();
		
		if(type.equalsIgnoreCase("SynchronusMotor")) {
			GetMotor gm = new GetMotor();
			gm.charactristic();
		}

		
		

	}

}
