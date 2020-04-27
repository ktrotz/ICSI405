package edu.albany.hw3_pt2;

import java.util.Hashtable;

/* Create classes modeling the purchase of sandwich / sandwiches at a typical 
 * sandwich shop. Use three objects: Cashier, Customer, SandwichMaker. 
 * (You can add more classes if you want but these three should be present in the project)
 */

public class Cashier extends Employee {
	
	Hashtable<Integer, Integer> orders = new Hashtable<>();
	public static int count = 0;
	private int orderNum;
	
	private String job;
	private int customerOrder;
	
	public Cashier(String job, String name, int id) {
		super(name, id);
		this.job = job;
		orderNum = count;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public String getJob() {
		return job;
	}
	
	public void takeOrder(int customerOrder) {
		this.customerOrder = customerOrder;
		
		orderNum = count++;
		orders.put(orderNum, customerOrder);
	}
	
	public int getOrder()
	{	
		System.out.println("Customer: " + orderNum);

		return customerOrder; 
	}

	public String toString() {
		return job + ": " + super.getName() + "\nID#" + super.getID() + "\n";
	}


}
