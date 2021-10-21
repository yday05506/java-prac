package Array;
public class selection_down {
	public static void main(String[] args) {
		int[] data = new int[] {3, 2, 4, 7, 1};
		int temp=0;
		
		for(int i = 0; i < data.length; i++)//i는 3까지
			System.out.println(data[i] + "\t");
		System.out.println();
			
		for(int i = 0; i < data.length; i++) {
			for(int j = i+1; j < data.length; j++) {
				if(data[j] > data[i]) {
					temp = data[j];
					data[j] = data[i];
					data[i] = temp;
				}
			}
		}
		for(int i = 0; i < data.length; i++)
			System.out.println(data[i] + "\t");
	}
}