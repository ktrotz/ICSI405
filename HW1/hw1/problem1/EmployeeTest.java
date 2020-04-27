package com.ualbany.hw1.problem1;

/* Write a driver class named EmployeeTest that demonstrates class Employee’s capabilities.
   Create two Employee objects and display the yearly salary for each Employee.
   Then give each Employee a 10% raise and display each Employee’s yearly salary again.
 */

public class EmployeeTest 
{
	public static void main(String[] args)
	{
		//Employee objects
		Employee employee1 = new Employee("John", "Snow", 4000);
		Employee employee2 = new Employee("Cersei", "Lannister", 5000);
		
		//Employee yearly salary
		System.out.println("Yearly Salary");
		
		employee1.setMonthSalary(4000);
		double monthly1 = employee1.getMonthSalary();
		double yearly = yearSalary(monthly1);
		System.out.println("$" + yearly);
		
		employee2.setMonthSalary(5000);
		double monthly2 = employee2.getMonthSalary();
		double yearly2 = yearSalary(monthly2);
		System.out.println("$" + yearly2);	
		
		//10% Raise
		System.out.println("\n10% Raise");
		System.out.println("$" + raise(yearly));
		System.out.println("$" + raise(yearly2));
		
	}
	
	public static double yearSalary(double monthly)
	{
		return monthly * 12;
	}
	
	public static double raise(double yearly)
	{
		//10% raise
		return yearly + (yearly * 0.10);
	}

}
