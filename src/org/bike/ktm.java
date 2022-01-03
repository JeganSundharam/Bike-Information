package org.bike;

public class ktm implements Bike  {

	
	public void cost() {
		System.out.println("Cost of the bike : Rs.1,50,000");
		
	}

	
	public void speed() {
		System.out.println("Top Speed of the bike : 200KmpH");
		
			}
	public static void main (String[] args) {
		ktm k=new ktm();
		k.cost();
		k.speed();
		System.out.println("hello world");
		System.out.println("Welcome to India");
		
	}

}
