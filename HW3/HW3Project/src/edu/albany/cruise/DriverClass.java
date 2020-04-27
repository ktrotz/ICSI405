package edu.albany.cruise;

/* Demonstrate the classes in a program that has a Ship array.
 *  Assign various Ship, CruiseShip and CargoShip objects to the array elements. 
 *  The program should then step through the array, calling each object’s toString method. */


public class DriverClass {

	public static void main(String[] args) 
	{
		Ship[] array = {new Ship("Storm", "2010"), new CruiseShip("Titanic", "2017", 800), new CargoShip("Neutron", "2008", 500),
							new Ship("Mufasa", "2011"), new CruiseShip("Breezy", "2005", 500), new CargoShip("Heavy Baby", "2001", 1000)};
	 
		for(Ship i: array){
			System.out.println(i.toString() + "\n");
		}
	}
}
