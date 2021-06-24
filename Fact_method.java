import java.util.Scanner;
public class Fact_method {
	public static void main(String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		int sum = 1;
		System.out.print("╪Ж ют╥б : ");
		int n = sc.nextInt( );
		System.out.print(n + "! = ");
		
		for (int i = 1; i <= n; i++) {
			sum *= i;
			if ( i == 1) System.out.print("1");
			else System.out.print(" * " + i);
		}
		System.out.print(" = " + sum);
	}
}