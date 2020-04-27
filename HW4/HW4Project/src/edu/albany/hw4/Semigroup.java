package edu.albany.hw4;


//import java.util.ArrayList;

/* Recall that a semigroup requires a binary operation, which means
 *  the operation takes two arguments.
Define an abstract, typed class Semigroup<AnyType> that specififes 
an operator operation, which takes one argument.
 (Note that the other implicit argument of the operation is the 
 object receiving the method call.)
 
  Some aspects of this will be similar both to the Comparator<T>
   and java.lang.Iterable<T> interfaces.
Semigroup objects should be immutable; that is, any operations 
should return new objects of the generic type, rather than being mutators.
 Note that we do not yet have any shared implementations, so
this class will not actually “do” much - yet. (That is, it’s 
functionally similar to an interface.)*/

import java.util.Collection;

public abstract class Semigroup<T> {
	
	public abstract T operate(T b);
	// fix and use - may fix method signature if required
	

public static <T> T combine(Collection<? extends Semigroup<T>> list) { //

/*		T result = null;

		ArrayList<Semigroup<T>> newList = (ArrayList<Semigroup<T>>) list;

		for(Semigroup<T> x: newList) {
			 if(result == null)
				 result = (T) newList.get(0);

			result = x.operate(result);
		}


		return result; */
	return null;
} 

}