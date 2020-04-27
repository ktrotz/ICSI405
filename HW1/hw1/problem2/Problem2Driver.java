package com.ualbany.hw1.problem2;

import java.util.Scanner;

/* Incorporate all of the above methods in a driver class Problem2Driver.
 *  Allow user to provide inputs for the arguments of the methods and also display results from the methods.
 */

public class Problem2Driver 
{
	public static void main(String[] args)
	{
        
        Scanner sc = new Scanner(System.in);
		
		//Even division
        System.out.println("Find if two numbers completely divisible");
        System.out.print("Enter two numbers: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
		System.out.println("Divisible: " + HW1Problem2.multiple(n, m));
		
		//Remainder (divided by 7)
		System.out.println("\nFind the remainder of a number divided by 7");
		System.out.print("Enter a number: ");
        int s = sc.nextInt();
		System.out.println("Remainder: " + HW1Problem2.remainder(s));
		
		//Distance between two points
		System.out.println("\nFind the distance between two x,y points");
		System.out.println("Enter four numbers: ");
		int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
		System.out.println("Distance: " + HW1Problem2.distance(x1,y1,x2,y2));
		
		sc.close();
	}

}
