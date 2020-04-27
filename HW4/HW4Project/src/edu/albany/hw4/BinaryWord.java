package edu.albany.hw4;

/* Create a BinaryWord class implementing the Complementable interface.
 * 
 *  Use java.util.BitSet as the underlying storage container. 
 *  While the BinaryWord constructor implementation is up to you, using a 
 *  String argument may be the most straightforward.
 
The complement operation should yield a bitwise inversion of the word.
 For instance, the complement of 001011 would be 110100.
You should also implement equals and toString methods for later testing.

 What should the parameterized type be for the implements clause? If you're 
 confused, you might refer to the java.lang.Comparable<T> interface and also
  see the declaration of the Integer class in the Java API, as well as the
   java.lang.Iterator<T> interface and the declaration of the java.util.Scanner class.*/

import java.util.*;

public class BinaryWord implements Complementable<BitSet> //defined like this
{
	private BitSet numBits;
	private int size;

	//Constructor
	public BinaryWord(String number) {
		this.size = number.length();
		this.numBits = new BitSet(size);

		//add to bitSet
		for(int i = 0; i < size; i++) {
			if(number.charAt(i) == '1')
				this.numBits.set(i); //set bit of specified index to true
		}	
	}


	public BitSet complement() { //should take no args

		//container
		BitSet comp = new BitSet(size); 
		
		// bitSet.get(i) returns a boolean
		// True = 1, False = 0;	
		for(int i = 0; i < size; i++) {
			if(numBits.get(i) == false)
				comp.set(i); //set bit of specified index to true
		}

		return comp;		
	}
	
	public String convertToString(BitSet numBits) { 
		
		String str = "";
		
		// bitSet.get(i) returns a boolean
		// True = 1, False = 0;		
		for(int i = 0; i < size; i++) {
			if(numBits.get(i)) //
				str = str + "1";
			
			else
				str = str + "0";	
		}
		
		return str;
	}
	
	public String toString() {
		return convertToString(numBits);
	}
}
