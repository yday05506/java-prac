package IDK;
import java.util.Scanner;
public class Maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int max = 0, min = 0;
		
		System.out.print("������ �Է� : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.print("���� �Է� : ");	
		
		for(int i = 0; i < a.length; i++) {
			int su = sc.nextInt();
			a[i] = su;
		}
		
		for(int i = 0; i < a.length; i++) {
			if(i == 0) {
				max = a[0];
				min = a[0];
			}
			if (a[i] > max) max = a[i];
			if (a[i] < min) min = a[i];
		}
		
		System.out.print(max + " " + min);
	}

}
