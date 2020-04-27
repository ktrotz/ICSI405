package edu.albany.cruise;

public class CruiseShip extends Ship {

	private int maxPassengers;

	public CruiseShip(String shipName, String buildYear, int maxPassengers)
	{
		super(shipName, buildYear);
		this.maxPassengers = maxPassengers;
	}

	public void setMax(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	public int getMax() {
		return maxPassengers;
	}

	public String toString() {
		return ("Cruise Ship Name: " + super.getName() + "\nMax Passengers: " + maxPassengers);
	}

}


