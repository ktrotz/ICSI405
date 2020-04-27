I HAVE DONE THIS IN ECLIPSE IDE, I PUT SOME COMMENTS FOR BETTER UNDERSTANDING.

JAVA CODE:

//BinaryWord.java

	import java.util.*;

public class BinaryWord implements Complementable<BinaryWord> {
	private BitSet bits;
	private int length;

	public BinaryWord(String bits) {
		this.length = bits.length();
		this.bits = new BitSet(length); // length of BitSet = length of input strength

		for (int i = 0; i < length; i++) { // for each character in the input string
			if (bits.charAt(i) == '1') { // if it's a 1
				this.bits.set(i); // set the same bit in the BitSet to 1
			}
		}
	}

	public BinaryWord complement() {
		BitSet bitsComp; // container for complement
		BinaryWord wordComp; // container for output

		bitsComp = new BitSet(length);
		bitsComp.or(bits); // copy the original BitSet
		bitsComp.flip(0, length); // flip each bit

		wordComp = new BinaryWord(BitSetToString(bitsComp));

		return wordComp;
	}

	public String toString() {
		return BitSetToString(bits);
	}

	private String BitSetToString(BitSet bits) {
		String string = "";

		for (int i = 0; i < length; i++) { // for each bit in BitSet
			if (bits.get(i)) { // if it's a 1
				string += "1"; // add 1 to the output string
			}
			else { // if it's a 0
				string += "0"; // add 0 to the output string
			}
		}

		return string;
	}
}

//Main.java

import java.util.*;

public class Main {
	public static void main(String[] args) {
		String binaryNum;
		BinaryWord word, comp;
		PositiveInteger posInt1, posInt2, posInt3, posIntSum;
		int number1, number2, number3;
		RGBColor color1, color2, color3, colorCombo;
		int red1, green1, blue1, red2, green2, blue2, red3, green3, blue3;
		Collection<RGBColor> colorList = new ArrayList<RGBColor>();
		Collection<PositiveInteger> intList = new ArrayList<PositiveInteger>();

		Scanner kbd = new Scanner(System.in);

		System.out.printf("Enter a binary number: ");
		binaryNum = kbd.next();
		word = new BinaryWord(binaryNum);
		comp = word.complement();

		System.out.printf("\n%10s BinaryWord: %s\n", "original", word);
		System.out.printf("%10s BinaryWord: %s\n", "complement", comp);

		System.out.printf("\n Enter value of red for color 1: ");
		red1 = kbd.nextInt();
		System.out.printf("Enter value of green for color 1: ");
		green1 = kbd.nextInt();
		System.out.printf(" Enter value of blue for color 1: ");
		blue1 = kbd.nextInt();
		System.out.printf(" Enter value of red for color 2: ");
		red2 = kbd.nextInt();
		System.out.printf("Enter value of green for color 2: ");
		green2 = kbd.nextInt();
		System.out.printf(" Enter value of blue for color 2: ");
		blue2 = kbd.nextInt();

		color1 = new RGBColor(red1, green1, blue1);
		color2 = new RGBColor(red2, green2, blue2);
		color3 = color1.operator(color2);

		System.out.printf("\nBlend of colors 1, 2 RGB: %d %d %d\n", color3.getRed(), color3.getGreen(), color3.getBlue());

		System.out.printf("\n Enter value of red for color 3: ");
		red3 = kbd.nextInt();
		System.out.printf("Enter value of green for color 3: ");
		green3 = kbd.nextInt();
		System.out.printf(" Enter value of blue for color 3: ");
		blue3 = kbd.nextInt();

		color3 = new RGBColor(red3, green3, blue3);
		colorList.add(color1);
		colorList.add(color2);
		colorList.add(color3);
		colorCombo = RGBColor.combine(colorList);

		System.out.printf("\nCombination of colors 1, 2, 3 RGB: %d %d %d\n", colorCombo.getRed(), colorCombo.getGreen(), colorCombo.getBlue());

		System.out.printf("\nEnter positive integer 1: ");
		number1 = kbd.nextInt();
		System.out.printf("Enter positive integer 2: ");
		number2 = kbd.nextInt();
		System.out.printf("Enter positive integer 3: ");
		number3 = kbd.nextInt();

		posInt1 = new PositiveInteger(number1);
		posInt2 = new PositiveInteger(number2);
		posInt3 = new PositiveInteger(number3);
		intList.add(posInt1);
		intList.add(posInt2);
		intList.add(posInt3);
		posIntSum = PositiveInteger.combine(intList);

		System.out.printf("\nSum of numbers: %d\n", posIntSum.getInt());

		kbd.close();

		System.exit(0);
	}
}

//Complementable.java
public interface Complementable<T> {
	T complement();
}

//RGBColor.java

public class RGBColor extends Semigroup<RGBColor> implements Complementable<RGBColor> {
	private int red, green, blue;

	public RGBColor(int red, int green, int blue) {
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	public int getRed() {
		return red;
	}

	public int getGreen() {
		return green;
	}

	public int getBlue() {
		return blue;
	}

	public RGBColor complement() {
		return new RGBColor(255 - red, 255 - green, 255 - blue);
	}

	public RGBColor operator(RGBColor color) {
		RGBColor colorBlend;
		int red, green, blue;

		red = (color.getRed() + this.red) / 2;
		green = (color.getGreen() + this.green) / 2;
		blue = (color.getBlue() + this.blue) / 2;
		colorBlend = new RGBColor(red, green, blue);

		return colorBlend;
	}
}

//Semigroup.java

import java.util.*;

public abstract class Semigroup<T> {
	abstract T operator(T object);

	static <T> T combine(Collection<T> collection) {
		Semigroup<T> object = null;

		for (T element: collection) {
			if (object == null) {
				object = (Semigroup<T>) element;
			}
			else {
				object = (Semigroup<T>) object.operator(element);
			}
		}

		return (T) object;
	}
}

//PositiveInteger.java

public class PositiveInteger extends Semigroup<PositiveInteger> {
	private int posInt;

	public PositiveInteger() {
		this(0);
	}

	public PositiveInteger(int posInt) {
		if (posInt >= 0) {
			this.posInt = posInt;
		}
		else {
			throw new IllegalArgumentException();
		}
	}

	public int getInt() {
		return posInt;
	}

	public PositiveInteger operator(PositiveInteger posInt) {
		PositiveInteger newPosInt;
		int sum;

		sum = posInt.getInt() + this.posInt;
		newPosInt = new PositiveInteger(sum);

		return newPosInt;
	}
}
