package edu.albany.hw3_pt2;

/* Create classes modeling the purchase of sandwich / sandwiches at a typical 
 * sandwich shop. Use three objects: Cashier, Customer, SandwichMaker. 
 * (You can add more classes if you want but these three should be present in the project)
 */

public class SandwichDriver {
	
	public static void main(String[] args)
	{		
		Menu menu = new Menu();
		menu.print();
		
		SandwichMaker sm = new SandwichMaker("Sandwich Maker", "Jerry Springer", 4032);// id
		Cashier cashier0 = new Cashier("Cashier", "Becky Goodhair", 302); 	
		
		Customer customer0 = new Customer("Micky Minach", 10.00, 1); //name, cash, orderNum
		Customer customer1 = new Customer("Doodlebob", 20.00, 3);
		Customer customer2 = new Customer("Dwight Shrute", 5.00, 0);
				
		System.out.println(cashier0);
		System.out.println(sm);
		
		
		//Customer makes order and cashier receives it and sends it to be made
		
		//1st Customer receipt
		cashier0.takeOrder(customer0.makeOrder());
		String meal1 = sm.makeSandwich(cashier0.getOrder());
		System.out.println(meal1);
		System.out.println("Payment: $" + String.format("%.2f", customer0.getCash()));		
		double change = customer0.getCash() - menu.getPrice(customer0.makeOrder());	
		System.out.println("Change: $" + String.format("%.2f", change) + "\n");
		
		//2nd Customer receipt
		cashier0.takeOrder(customer1.makeOrder());
		String meal2 = sm.makeSandwich(cashier0.getOrder());
		System.out.println(meal2);
		System.out.println("Payment: $" + String.format("%.2f", customer1.getCash()));		
		change = customer1.getCash() - menu.getPrice(customer1.makeOrder());	
		System.out.println("Change: $" + String.format("%.2f", change) + "\n");
		
		//3rd Customer receipt
		cashier0.takeOrder(customer2.makeOrder());
		String meal3 = sm.makeSandwich(cashier0.getOrder());
		System.out.println(meal3);
		System.out.println("Payment: $" + String.format("%.2f", customer2.getCash()));	
	    change = customer2.getCash() - menu.getPrice(customer2.makeOrder());	    
		System.out.println("Change: $" + String.format("%.2f", change) + "\n");		
	}
}
