package IDK;
import java.util.Scanner;
public class The_Number {

	public static void main(String[] args) {
		int[] alph = new int[3];
		int a = 1;
		int sum = 1;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		
		for(char i = 'A'; i <= 'C'; i++) {
			System.out.print(i+ " ют╥б : ");
			alph[a] = sc.nextInt();
			sum *= alph[a];
		}
		System.out.println("A * B * C = " + sum);
		
		for(int i = 0; i <= 9; i++)
		{
			if (sum % i == 0) cnt++;
		}
		System.out.println(cnt);
	}

}
