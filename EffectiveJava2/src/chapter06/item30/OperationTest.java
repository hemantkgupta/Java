package chapter06.item30;

public class OperationTest {

	public static void main(String[] args) {
			double x = 4.5;
			double y =1.5;
			for (Operation2 op : Operation2.values())
			System.out.printf("%f %s %f = %f%n",x, op, y, op.apply(x, y));
			
			System.out.println(Operation2.valueOf("MINUS").ordinal());
	}

}
