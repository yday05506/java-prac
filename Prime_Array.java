package Array;
import java.util.Scanner;
public class Prime_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int cnt=0;
		System.out.print("수 입력 : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) a[cnt++] = i;
		}
		
		System.out.print(n + "의 약수 : ");
		for(int i = 0; i < cnt; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
