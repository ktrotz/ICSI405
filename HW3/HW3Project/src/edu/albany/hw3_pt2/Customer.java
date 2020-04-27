package edu.albany.hw3_pt2;

/* Create classes modeling the purchase of sandwich / sandwiches at a typical 
 * sandwich shop. Use three objects: Cashier, Customer, SandwichMaker. 
 * (You can add more classes if you want but these three should be present in the project)
 */

public class Customer extends Person {
	
	private double cash;	//return change
	public static int count = 1;
	private int customerNum;
	private int orderNum;
	
	public Customer(String name, double cash, int orderNum) {
		
		super(name);
		this.cash = cash;
		this.orderNum = orderNum;
		customerNum = count++;
	}
	

	
	//Receive cash payment
	public void setCash(double cash) {
		this.cash = cash;
	}
	
	public double getCash() {
		return cash;
	}
	
	public void setNewOrder(int orderNum) {
		this.orderNum = orderNum;
	}
	
	public int makeOrder() {
		return orderNum;
	}

	
	public void printNum() {
		System.out.println("Order #" + customerNum);
	}
	
}
