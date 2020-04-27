package edu.albany.hw3_pt2;

import java.util.Hashtable;

public class Menu {//base class
	
	private static String[] sandwichArray;
	Hashtable<Integer, Double> prices = new Hashtable<>();
	
	public Menu() {	
		sandwichArray = new String[]{"BLT", "Tuna Sandwich", "Philly Cheesesteak", "Chopped Cheese", "Bacon, Egg & Cheese"};
			
		prices.put(0, 3.00); //(sandwichNum, price in dollars)
		prices.put(1, 4.00);
		prices.put(2, 6.00); 
		prices.put(3, 4.50);
		prices.put(4, 3.50);			
	}
	
	public double getPrice(int i) {
		return prices.get(i);
	}


	public void print() {
		
		System.out.println("************ MENU ************");
		System.out.println("  #:      Name:");
		
		for(int i = 0; i < sandwichArray.length; i++)	{
			System.out.println("  " + i + "       " + sandwichArray[i]
				+ "  ------> $" + prices.get(i) + "\n");
		}
	}
	
	public String chooseSandwich(int i)	{
		return ("Sandwich Name: " + sandwichArray[i] + "\n" + "Price: $" + String.format("%.2f", prices.get(i)));	
	}	
}
