package level_03_loop;

import java.util.Scanner;

public class P_2438 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String star = "*";
		for(int i=1; i<=N; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}
	}

}
