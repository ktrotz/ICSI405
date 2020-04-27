package edu.albany.hw3_pt2;

//import java.util.Hashtable;

/* Create classes modeling the purchase of sandwich / sandwiches at a typical 
 * sandwich shop. Use three objects: Cashier, Customer, SandwichMaker. 
 * (You can add more classes if you want but these three should be present in the project)
 */

public class SandwichMaker extends Employee {
	
	private String job;

	public SandwichMaker(String job, String name, int id) {
		super(name, id);
		this.job = job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public String getJob() {
		return job;
	}
	
	public String makeSandwich(int order) {
		
		System.out.println("Meal #" + order);
		
		Menu menu = new Menu();
		
		String meal = menu.chooseSandwich(order);
		return meal;
	}
	
	public String toString() {
		return job + ": " + super.getName() + "\nID#" + super.getID() + "\n";
	}
}
