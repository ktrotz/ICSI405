package edu.albany.hw2.car;

public class FuelGauge 
{

	public final static int maxGallons = 15; //(The car can hold max 15 gallons)
	
	private int gallons = 0;
	
	//Constructor
	public FuelGauge(int g)
	{
		gallons = g;
	}
	
	//To set the car’s current amount of fuel, in gallons
	public void setFuel(int g)
	{
		if(g <= maxGallons)
			gallons = g;
		
		else
			gallons = maxGallons;
	}
	
	//To report the car’s current amount of fuel in gallons
	public int getFuel()
	{
		return gallons;
	}
	
	//To be able to increment the amount of fuel by 1 gallon. This simulates putting fuel in the car 
	public void addFuel()
	{
		if(gallons < maxGallons)
			gallons++;
		
		else
			System.out.println("Fuel Tank is Full.\n");
	}
	
	//To be able to decrement the amount of fuel by 1 gallon, if the amount of fuel is greater
    // than 0 gallons. This simulates burning fuel as the car runs. 
	public void burnFuel()
	{
		if(gallons > 0)
			gallons--;
		
		else
			System.out.println("Fuel Tank is Empty.");
	}
	
}
