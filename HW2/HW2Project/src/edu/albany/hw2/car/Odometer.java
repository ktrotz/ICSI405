package edu.albany.hw2.car;

/*
 *  The Odometer class: This class will simulate the car’s odometer. 
   
    Its responsibilities are asfollows:
		To know the car’s current mileage
		
		To report the car’s current mileage
		
		To be able to increment the current mileage by 1 mile. The maximum mileage the
		odometer can store is 999,999 miles. When this amount is exceeded, the odometer
		resets the current mileage to 0
		
		To be able to work with a FuelGauge object. It should decrease the FuelGuage object’s
		current amount of fuel by 1 gallon for every 22 miles travelled. (The car’s fuel economy
		is 22 miles per gallon)
 */

public class Odometer
{
	public final int maxMileage = 999999; //The maximum mileage the odometer can store is 999,999 miles.
	//public final int MPG = 22; //(The car’s fuel economy is 22 miles per gallon)
	
	private int startMileage;
	private int currentMileage;
	
	private FuelGauge fuelGauge;
	
	//Constructor
	public Odometer(int mileage, FuelGauge fuelGauge)
	{
		startMileage = mileage; //remains the same
		currentMileage = mileage;
		this.fuelGauge = fuelGauge;
	}
	
	public void setMileage(int mileage, FuelGauge fuelGauge)
	{
		startMileage = mileage;
		currentMileage = mileage;
		this.fuelGauge = fuelGauge;
	}
	
	//To report the car’s current mileage
	public int getMileage()
	{
		return currentMileage;
	}
	
	//To be able to increment the current mileage by 1 mile.
	//The maximum mileage the odometer can store is 999,999 miles.
	//When this amount is exceeded, the odometer resets the current mileage to 0
	public void addMileage()
	{
		if(currentMileage < maxMileage)
			currentMileage++;
		
		else
			currentMileage = 0;
		
		//To be able to work with a FuelGauge object. It should decrease the FuelGuage object’s
		//current amount of fuel by 1 gallon for every 22 miles travelled. (The car’s fuel economy
		//is 22 miles per gallon)
		
		int milesDriven = startMileage - currentMileage;
		
		//(The car’s fuel economy is 22 miles per gallon)
		if(milesDriven % 22 == 0)
			fuelGauge.burnFuel();
	}
}
