import java.util.Scanner;

public class Solution2072 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		int sum = 0;

		for(int j=0; j<input; j++) {
			for(int i=0; i<10; i++) {
				int num = scan.nextInt();
				if (num%2!=0) {
					sum += num;
				}
			}
			System.out.println("#"+(j+1)+" "+sum);
			sum = 0;
		}

	}
}
