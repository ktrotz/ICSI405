package com.ualbany.hw1.problem2;

/* Problem 2: Methods
Create a class called HW1Problem2. Create the following (public) methods in the class:
1. Write a method called multiple that takes two integers as its arguments and returns 
   true if the first integer is divisible evenly by the second one (i.e., there is no
   remainder after division); otherwise, the method should return false.
   
2. Write a method called reminder that takes an integer as an argument and returns the
   remainder of that value divided by 7.
   
3. Write method distance to calculate the distance between two points (x1, y1) and 
   (x2, y2). All numbers and return values should be of type double.
   
4. BONUS: Write a method that uses random numbers to simulate 10 flips of a coin.
*/

public class HW1Problem2
{
	public static boolean multiple(int x, int y)
	{
		boolean T = false;
		
		if(x % y == 0)
			T = true; 
		
		
		return T;
	}
	
	public static int remainder(int x)
	{
		return x % 7;
	}
	
	public static double distance(double x1, double y1, double x2, double y2)
	{
		double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 
		
		return distance;
	}
}

