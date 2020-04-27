package edu.albany.cruise;


/* Design a CargoShip class that extends the Ship class. 
	   The CargoShip class should have the following members:
		1. A field for the cargo capacity in tonnage (int)
		2. A constructor and appropriate accessors and mutators
		3. A toString method that overrides the toString method in the base class. 
		  The CargoShip class’s toString method should display only the ship’s name
		  and the ship’s cargo capacity*/

public class CargoShip extends Ship {

	private int cargoCapacity; //in tonnage

	public CargoShip(String shipName, String buildYear, int cargoCapacity)
	{
		super(shipName, buildYear);
		this.cargoCapacity = cargoCapacity;
	}

	public void setCapacity(int cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public int getCapacity() {
		return cargoCapacity;
	}

	public String toString() {
		return ("Cargo Ship Name: " + super.getName() + "\nCargo Capacity: " + cargoCapacity + " tons");
	}
}

