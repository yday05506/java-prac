public class For_Test1 {
	public static void main (String args[ ] ) {
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
				System.out.print("X" + "\t");
			if (i % 10 == 1)
				System.out.println( );
		if ( i == 1) System.out.print("1" + "\t");
		else System.out.print(i + "\t");
		}
	}
}