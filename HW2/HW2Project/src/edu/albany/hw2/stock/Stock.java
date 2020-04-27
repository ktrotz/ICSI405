package edu.albany.hw2.stock;


/* Design a class named Stock that contains the following:
1. A Symbol enum field named symbol for the stock’s symbol

2. A double data field name previousClosingPrice that stores the stock price for the previous day

3. A double data field named currentPrice that stores the stock price for the current time

4. A constructor that creates a stock with specified symbol and name

5. The accessor functions for all data fields

6. The mutator functions for previousClosingPrice and currentPrice

7. A function named getChangePercent() that returns the percentage changed from
previousClosingPrice to currentPrice

8. The Enum “Symbol” – will be used to denote stock for companies
	a. Declare the stock symbols for the following: Microsoft, Apple, Google, Amazon, AT&T
	b. The symbol should have a string value which is the company name
	c. Example Symbol.MSFT represents Microsoft stock.
*/

public class Stock 
{
	public enum Symbol
	{
		MSFT("Microsoft"),  
		AAPL("Apple"),
		GOOGL("Google"),
		AMZN("Amazon"), 
		T("AT&T");  
		
		private String name;
		
		private Symbol(String name)
		{
			this.name = name;
		}
		
		public String getName()
		{
			return name;
		}
	}
	

	private static double previousClosingPrice;
	private static double currentPrice;
	
	
	//Constructor
	public Stock(double prev, double curr)
	{
		previousClosingPrice = prev;
		currentPrice = curr;		
	}

	//Mutators
	public void setPreviousClosingPrice(double prev)
	{
		previousClosingPrice = prev;		
	}

	public void setCurrentPrice(double curr)
	{
		currentPrice = curr;		
	}

	//Accessors
	public double getPreviousClosingPrice()
	{
		return previousClosingPrice;
	}

	public double getCurrentPrice()
	{
		return currentPrice;
	}


	public double getChangePercent()
	{
		double change = ((currentPrice - previousClosingPrice)/previousClosingPrice) * 100;

		return change;
	}
}