
public class NumberTest {

	public static void main(String[] args) {
		Integer x = 5; 
	    System.out.println(x); 
	    System.out.println("The bit count is: " +Integer.bitCount(x));
	    System.out.println("parse int is: " +Integer.parseInt("12", 16));
	    System.out.println("highest one bit is: " +Integer.highestOneBit(x));
	    System.out.println("leading zeros are: " +Integer.numberOfLeadingZeros(x));
	    System.out.println("reverse is: " +Integer.reverse(x));
	    System.out.println("rotate left(2) is: " +Integer.rotateLeft(x, 2));
	    System.out.println("binary is: " +Integer.toBinaryString(x));
	    System.out.println("compare is: " +Integer.compare(4, 7));
	    System.out.println("valueOf is: " +Integer.valueOf(9));
	    System.out.println("valueOf is: " +Integer.valueOf("9"));
	    System.out.println("intValue is: " +x.intValue());
	}

}