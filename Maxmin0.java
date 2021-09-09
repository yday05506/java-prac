package Array;
import java.util.Scanner;
public class Maxmin0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("input N : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < a.length; i++) {
			int su=sc.nextInt();
			a[i]=su;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (i==0) {
				max = a[0];
				min = a[0];
			}
			if (a[i] < min) min = a[i];
			if (a[i] > max) max = a[i];
		}
		
		System.out.println("최댓값 : " + max);
		System.out.print("최솟값 : " + min);
	}

}
