package com.ualbany.hw1.problem1;

/* Problem 1: Create an Employee class 
 
   Create a class to represent Employee information called Employee. 
   This class includes three pieces of information as instance variables—a first name (type String),
   a last name (type String) and a monthly salary (type double). 
   Your class should have a constructor that initializes the three instance variables.   
   Provide a set and a get method for each instance variable.
   
   If the monthly salary is not positive, set it to 0.0. 
   */

public class Employee
{
	private static String firstName;
	private static String lastName;
	private static double monthSalary;
	
	//Constructor
	public Employee(String f, String l, double m)
	{
		firstName = f;
		lastName = l;
		monthSalary = m;
	}
	
	//Setters
	public void setFirst(String f)
	{
		firstName = f;
	}
	
	public void setLast(String l)
	{
		lastName = l;
	}
	
	public void setMonthSalary(double s)
	{
		if(s < 0)
			s = 0.0;
		
		monthSalary = s;	
	}
	
	//Getters
	public String getFirst()
	{
		return firstName;
	}
	
	public String getLast()
	{
		return lastName;
	}
	
	public double getMonthSalary()
	{
		return monthSalary;
	}
}
