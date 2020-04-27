package edu.albany.hw4;

import java.util.ArrayList;
import java.util.BitSet;

public class DriverClass {

	public static void main (String[] args) {

		//BinaryWord
		String binary = "001011"; //the complement of 001011 would be 110100.
		BinaryWord bw = new BinaryWord(binary);
		
		BitSet complement = bw.complement();
		
		System.out.println("Original: " + bw);
		System.out.println("Complement: " + bw.convertToString(complement));	
	
		//PositiveInteger
		System.out.println();
		PositiveInteger p = new PositiveInteger(50);
		Integer i = 90;
		Integer result = p.operate(i);
		System.out.println(p.getX() + " + " + i + " = " + result);
		
		
		ArrayList<PositiveInteger> posInt = new ArrayList<PositiveInteger>();
		posInt.add(new PositiveInteger(30));
		posInt.add(new PositiveInteger(20));
		posInt.add(new PositiveInteger(40));
		posInt.add(new PositiveInteger(10));
		posInt.add(new PositiveInteger(5)); 
		
		//Semigroup.combine(posInt);

		//RGBColor		 
		System.out.println();
		RGBColor color = new RGBColor(100, 200, 90); //range: 0 - 255
		RGBColor color2 =  new RGBColor(30, 222, 111);

		System.out.println("Color 1: " + color);
		System.out.println("Color 2: " + color2);

		RGBColor average = color.operate(color2);
		System.out.println("Average: " + average);
		System.out.println("Complement: " + average.complement());



	}
}
