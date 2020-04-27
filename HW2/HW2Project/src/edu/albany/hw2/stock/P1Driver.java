package edu.albany.hw2.stock;

import java.text.DecimalFormat;

import edu.albany.hw2.stock.Stock.Symbol;

/* 	
	Write a test program that creates a Stock object with
	the stock symbol MSFT and the previous closing stock price of 58.9. Set a new current price to 59 and
	display the price change percentage. Repeat for one other company. */

public class P1Driver 
{
	public static void main(String[] args)
	{
		//Microsoft
		Symbol microsoft = Symbol.MSFT;
		System.out.println(microsoft.getName());
		
		
		Stock stock = new Stock(58.9, 59);
		stock.setPreviousClosingPrice(58.9);
		stock.setCurrentPrice(59);
		
		DecimalFormat df = new DecimalFormat("#.00");
		
		if(stock.getChangePercent() > 0)
			System.out.println(df.format(stock.getChangePercent()) + "% increase\n");
		
		else
			System.out.println(df.format(stock.getChangePercent()) + "% decrease\n");
		
	
		//Apple
		Symbol apple = Symbol.AAPL;
		System.out.println(apple.getName());
		
		stock.setPreviousClosingPrice(60);
		stock.setCurrentPrice(59.3);
		
		if(stock.getChangePercent() > 0)
			System.out.println(df.format(stock.getChangePercent()) + "% increase\n");
		
		else
			System.out.println(df.format(stock.getChangePercent()) + "% decrease\n");
	}

}
