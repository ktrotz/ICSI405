package edu.albany.hw3_pt2;

public class Employee extends Person { //super class of cashier & sandwichMaker

	private int id;

	public Employee(String name, int id){
		super(name);
		this.id = id;
	}
	
	public void setID(int id) {
		this.id = id;
	}
	
	public int getID() {
		return id;
	}
}