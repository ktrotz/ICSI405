package edu.albany.hw4;

/* In mathematics, a magma is a type of algebraic structure that has a set of elements,
 *  all of the same type, and one binary operation. Such a pairing of a set
 *   (ex. Positive integers) with this operation is a semigroup when the operation is 
 *   associative and produces an element from the same set.
 
Another common algebraic structure features a unary operation that is its own inverse,
 commonly called the complement. One example is the boolean complement operator, 
 which takes a boolean and produces a boolean. By definition, applying a complement 
 operator twice gives the original value.
 
In this assignment, you will create a generic complementable interface and semigroup 
abstract class that support some general operations. You will then create fully concrete
 implementations of some familiar semigroups: positive integers paired with common addition, 
 and RGB colors paired with a combination operation (e.g., averaging the color components
  of the two operands). You will also implement the complementable interface.*/


/* Define a typed interface Complementable<AnyType> that specifies the complement
 *  operation. Because this will be an object method, it takes no argument but
 *   produces an object of the (parameterized) complementable type. 
 *   This is similar to the java.lang.Iterator<T> interface.
 */


public interface Complementable<T> {
	T complement();
}
