package com.ualbany.hw1.problem3;

/* 3. Person – A person has a first and last name, address and has a CheckingBankAccount */

public class Person 
{	
	private static String firstName;
	private static String lastName;
	private static Address address;
	private static CheckingBankAccount account;

	public Person(String f, String l, Address ad, CheckingBankAccount acc)
	{
		firstName = f;
		lastName = l;
		address = ad;
		account = acc;	
	}

	//Setters
	public static void setFirstName(String f)
	{
		firstName = f;
	}

	public static void setLastName(String l)
	{
		lastName = l;
	}

	public static void setAddress(Address ad)
	{
		address = ad;
	}

	public static void setAccount(CheckingBankAccount acc)
	{
		account = acc;
	}


	//Getters
	public static String getFirstName()
	{
		return firstName;
	}

	public static String getLastName()
	{
		return lastName;
	}

	public static Address getAddress()
	{
		return address;
	}

	public static CheckingBankAccount getAccount()
	{
		return account;
	}
}
