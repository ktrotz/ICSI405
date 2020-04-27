package edu.albany.hw4;

/* Create a (concrete) subclass of Semigroup called PositiveInteger.
What should the parameterized type be for the extends clause? 
This is similar to Complementable,
except BinaryWord implements a generic interface while 
PositiveInteger extends a generic class.
Implement the required method of the class (operator) using the
 typical add operation on integers. You
should also implement equals and toString methods for later testing.*/

public class PositiveInteger extends Semigroup<Integer> { 
	
	private Integer x;
	
	public PositiveInteger(Integer x) {
		
		this.x = x;
	}
	
	// store value
	@Override
	public Integer operate(Integer b) {
		
		// operation would be own value + value of b
		return this.x + b;	
	}
	
	public Integer getX() {
		return x;
	}
}
