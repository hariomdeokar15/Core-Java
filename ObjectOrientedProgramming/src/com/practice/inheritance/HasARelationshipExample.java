package com.practice.inheritance;

class Vehical{
	private String brand;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
class Speed{
	private int max;
	
	public int getMax() {
		return max;
		
	}
	public void setMax(int max) {
		this.max = max;
	}
}
class Van extends Vehical{
	private Speed speed;
	
	public Speed getSpeed() {
		return speed;
	}
	
	public void setSpeed(Speed speed) { 
		this.speed=speed;
	}
	
	public void print() {
		System.out.println(getBrand()+" This Brand cars has max speed "+ speed.getMax());
	}
	
	
}
public class HasARelationshipExample extends Vehical{

	public static void main(String[] args) {
		
		Speed s = new Speed();
		Van v = new Van();
		s.setMax(300);
		v.setBrand("BMW");
		v.setSpeed(s);
		v.print();
		
		
		

	}

}
