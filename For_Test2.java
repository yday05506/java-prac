public class For_Test2 {
	public static void main(String args[ ] ) {
		for (int i = 1; i <= 10; i++) {
			if ( i == 10 )
				System.out.print("10");
			else System.out.print("0" + i);
			if (i == 1 || i == 3 || i == 6)
				System.out.println( );
		}
	}
}