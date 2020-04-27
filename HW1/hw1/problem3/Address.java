package com.ualbany.hw1.problem3;

/* 2. Address – This is a simple class which has all String fields to represent an address (ex. Address
	line 1, line2, City, State, Zip) */

public class Address 
{
	private static String line1;
	private static String line2;
	private static String city;
	private static String state;
	private static String zip;

	public Address(String l1, String l2, String c, String s, String z)
	{
		line1 = l1;
		line2 = l2;
		city = c;
		state = s;
		zip = z;
	}

	//Setters
	public static void setLine1(String l1)
	{
		line1 = l1;
	}

	public static void setLine2(String l2)
	{
		line2 = l2;
	}

	public static void setCity(String c)
	{
		city = c;
	}

	public static void setState(String s)
	{
		state = s;
	}

	public static void setZip(String z)
	{
		zip = z;
	}


	//Getters
	public static String getLine1()
	{
		return line1;
	}

	public static String getLine2()
	{
		return line2;
	}

	public static String getCity()
	{
		return city;
	}

	public static String getState()
	{
		return state;
	}

	public static String getZip()
	{
		return zip;
	}
}
