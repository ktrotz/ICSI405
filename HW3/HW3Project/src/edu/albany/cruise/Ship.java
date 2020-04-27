package edu.albany.cruise;


/* Design a ship class that has the following members:
	1. A field for the name of the ship (string)
	2. A field for the year that the ship was built (string)
	3. A constructor and appropriate accessors and mutators
	4. A toString method that displays the ship’s name and the year it was built*/

public class Ship {

	private String shipName;
	private String buildYear;

	public Ship(String shipName, String buildYear)
	{
		this.shipName = shipName;
		this.buildYear = buildYear;
	}

	public void setName(String name) {
		shipName = name;
	}

	public void setYear(String year) {
		buildYear = year;
	}

	public String getName() {
		return shipName;
	}

	public String getYear() {
		return buildYear;
	}

	public String toString() {
		return("Ship name: " + shipName + "\n" + "Build Year: " + buildYear);
	}
}


