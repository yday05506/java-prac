package IDK;
import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int place = 0;
		int[] a = new int[9];
		
		System.out.print("숫자 입력 : ");
		for(int i = 0; i < a.length; i++) {
			int n = sc.nextInt( );
			a[i] = n;
		}
		
		for(int i = 0; i < a.length; i++) {
			if (i == 0)
				max = a[0];
			if(a[i] > max) {
				max = a[i];
				place = i + 1;
			}
		}
		
		System.out.println("최댓값 : " + max);
		System.out.print("위치 : " + place);
	}

}
