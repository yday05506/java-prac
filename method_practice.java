import java.util.Scanner;
public class method_practice {	//이름만 이럼. 성적 받는 프로그램임.
	public static void main( String args[ ] ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 입력 : ");
		int people = sc.nextInt();
		System.out.print("점수 입력 : ");
		int[] score = new int[people];
		String[] cnt = {"", "", "", "", ""};
		
		for(int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}
		
		for(int i = 0; i < score.length; i++) {
			if(score[i] >= 90) {
				cnt[0]+="*";
			}
			else if (score[i] >= 80) {
				cnt[1]+="*";
			}
			else if (score[i] >= 70) {
				cnt[2]+="*";
			}
			else if (score[i] >= 60) {
				cnt[3]+="*";
			}
			else if (score[i] <= 59){
				cnt[4]+="*";
			}
		}
		if(cnt[0] != "")
			System.out.println("90점 대 이상 : " + cnt[0]);
		if(cnt[1] != "")
			System.out.println("80점 대 이상 : " + cnt[1]);
		if(cnt[2] != "")
			System.out.println("70점 대 이상 : " + cnt[2]);
		if(cnt[3] != "")
			System.out.println("60점 대 이상 : " + cnt[3]);
		if(cnt[4] != "")
			System.out.println("50점 대 이하 : " + cnt[4]);
	}
}