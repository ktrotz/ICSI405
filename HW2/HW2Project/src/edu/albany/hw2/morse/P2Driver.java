package edu.albany.hw2.morse;

import java.util.Scanner;

public class P2Driver 
{	
	public static void main(String[] args)
	{
		/* Write a program that asks the user to enter a string and then converts that string into Morse code. 
		   Use hyphens	for dashes and periods for dots.
		*/
		
		Scanner input = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a string: ");
		String message = input.nextLine(); 
		
		Morse.toMorse(message);
		
		input.close();
	}

}
