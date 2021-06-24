public class For_Test3 {
	public static void main(String args[ ] ) {
		double sum = 0;
		for (double i = 1; i <= 100; i++) {
			if (i == 1) System.out.print("1 + ");
			else if ( i != 100) System.out.print( "(1 / " + (int)i + ") + " );
			else System.out.print( "(1 / " + (int)i + ")" );
			sum += (1/i);
		}
		System.out.print(" = " + sum);
	}
}