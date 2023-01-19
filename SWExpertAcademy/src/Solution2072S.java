import java.util.Scanner;

public class Solution2072S {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = s.nextInt();
		for(int i=1; i<=cnt; i++) {
			int sum = 0;
			for(int j=1; j<=10; j++) {
				int data = s.nextInt();
				if(data%2==1) {
					sum += data;
				}
			}
			System.out.println("#"+i+" "+sum);
		}
		
	}

}
