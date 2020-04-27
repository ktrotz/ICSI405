package com.ualbany.hw1.problem3;

/* 	
	4. Bank – Bank is “associated” with the checking account. Bank has a String name and address. You
	do not need to have a CheckingBankAccount object within this class. However it is up to you to
	design/model this representation.
	
	Once you have the above classes create a main method in the Bank class.
	Simulate a person arriving to the bank (print the person’s name, and the bank’s name),
	then simulate the person opening an account with initial deposit of $1000. Simulate a deposit of $1000 and a withdrawal of $500. Every time a
	withdrawal or deposit happens, a receipt is printed with the name, address of the person and his/her
	current balance.
*/

public class Bank 
{
	private static String name;
	private static Address address;
	
	public Bank(String n, Address ad)
	{
		name = n;
		address = ad;
	}
	
	//Setters
	public static void setBankName(String b)
	{
		name = b;
	}
	
	public static void setBankAddress(Address a)
	{
		address = a;
	}
	
	//Getters
	public static String getBankName()
	{
		return name;
	}
	
	public static Address getBankAddress()
	{
		return address;
	}
	
	
	//Main
	public static void main(String[] args)
	{
		//Bank Details
		new Bank("Bank of America", new Address("190-09 182st", "", "Queens", "NY", "11903"));
		
		
		//Person opening an account			
		Address personAdd = new Address("133-09 150st", "", "Jamaica", "NY", "11436");		
		new Person("James", "Brown", personAdd, new CheckingBankAccount(1000));
		
		System.out.println("Bank Name: " + Bank.getBankName());
		System.out.println("\nPerson Name: " + Person.getFirstName() + " " + Person.getLastName());	
		System.out.println("Person Address: " + Address.getLine1() + Address.getLine2() + ", " +
		                       Address.getCity() + " " + Address.getState() + " " + Address.getZip());
		
		
		//Deposit Receipt
		System.out.println(CheckingBankAccount.deposit(1000));
		
		//Withdraw Receipt
		System.out.println(CheckingBankAccount.withdraw(500));	
		
	}
}
