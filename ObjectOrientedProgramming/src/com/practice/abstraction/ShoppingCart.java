package com.practice.abstraction;

interface Product{
	String getName();
	int getPrice();
}
class Mobile implements Product{
	public String getName() {
		return "Apple";
	}
	public int getPrice() {
		return 50000;
	}
}
class Laptop implements Product{
	public String getName() {
		return "IdeaPad";
	}
	public int getPrice() {
		return 40000;
	}
}
class Cart{
	
	public int calculateProduct(Product[] items) {
		int sum = 0;
		for(Product p: items) {
			sum +=p.getPrice();
		}
		return sum;
		
	}
}
public class ShoppingCart {

	public static void main(String[] args) {
		
		Product p1 = new Mobile();
		String name1 = p1.getName();
		int price1 = p1.getPrice();
		
		Product p2 = new Laptop();
		String name2 = p2.getName();
		int price2 = p2.getPrice();
		
		Product[] items = { p1, p2 };
		Cart c = new Cart();
		int total = c.calculateProduct(items);
		
		System.out.println("Cart Items");
		System.out.println();
		
		System.out.println("Product 1: "+name1);
		System.out.println("Price : "+price1);
		System.out.println();

		System.out.println("Product 2: "+name2);
		System.out.println("Price : "+price2);
		System.out.println();
		
		System.out.println("Toatl: "+total);

		
	}

}
