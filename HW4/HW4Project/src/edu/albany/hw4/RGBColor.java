package edu.albany.hw4;


/* Create another (concrete) subclass of Semigroup called RGBColor. It should store three integers in the
range 0-255. Because colors have complements, RGBColor should also implement the Complementable
interface.
The operator of the Semigroup will be color blending. That is, the components of the new color should
be the (integer) average of the components of the two input colors. The complement operation should
give a new color whose components are each 255 minus the original.
For example, if [R/G/B] represents the three color components, the operator on [32/96/128] and
[0/99/255] would yield [16/97/191]. The complement of the former would be [223/159/127].*/

public class RGBColor extends Semigroup<RGBColor> implements Complementable<RGBColor>  {
	
	 
	 private int R;
	 private int G; 
	 private int B;
	 
	 public RGBColor(int R, int G, int B) {
		 this.R = R;
		 this.G = G;
		 this.B = B;
	 }
	 
	 public int getR() {
		 return R;
	 }
	 
	 public int getG() {
		 return G;
	 }
	 
	 public int getB() {
		 return B;
	 }
	 
	
	 @Override
	public RGBColor operate(RGBColor x) {
		 //average
		 int r = (this.R + x.getR())/2; //or x.R
		 int g = (this.G + x.getG())/2;
		 int b = (this.B + x.getB())/2;
		 
		 return new RGBColor(r, g, b);	 
	 }

	 @Override
	 public RGBColor complement() {		 
		 return new RGBColor(255 - R, 255 - G, 255 - B);
	 } 
	 
	 public String toString() {
		 return "[" + getR() + "/" + getG() + "/" + getB() + "]"; //[0/99/255] 
	 }
	 
	
}
