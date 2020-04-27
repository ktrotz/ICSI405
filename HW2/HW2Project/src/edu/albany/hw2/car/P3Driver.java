package edu.albany.hw2.car;

public class P3Driver 
{
	public static void main(String[] args)
	{
		int currentGallons = 5;
		
		FuelGauge fuel = new FuelGauge(0);
		Odometer od = new Odometer(0, fuel);
		
		fuel.setFuel(currentGallons);
		
		System.out.println("Filling Tank...");
		
		//Simulate filling the car up with fuel
		for(int i = 0; i <= FuelGauge.maxGallons - currentGallons; i++)
		{
			fuel.addFuel();
		}
		
		//run loop that increments the odometer until the car runs out of fuel.
	
		
		while(fuel.getFuel() > 0)
		{
			od.addMileage();
			
			//During each loop iteration, print the
			//car’s current mileage and amount of fuel.
			System.out.println("Current Mileage:" + od.getMileage());
			System.out.println("Gallons of Fuel:" + fuel.getFuel() +"\n");
			
			if(fuel.getFuel() == 0)
				System.out.println("Fuel Tank is Empty.");
				
			
		} 
	}
}