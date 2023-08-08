package level_05_string;

import java.util.Scanner;

public class P_2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// test case
		int tc = sc.nextInt();
		for (int t = 0; t < tc; t++) {
			
			int R = sc.nextInt();
			String S = sc.next();
			
			for (int i = 0; i < S.length(); i++) {
				for(int j = 0; j < R; j++) {
					System.out.print(S.charAt(i));
				}
			}
			System.out.println();
		}
	}
}