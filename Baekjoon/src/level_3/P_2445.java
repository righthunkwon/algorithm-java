package level_3;

import java.util.Scanner;

public class P_2445 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			// 1 8 1, 2 6 2, 3 4 3, 4 2 4, 5 0 5
			// 별
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			// 공백
			for (int k = 0; k < (2*n) - 2 - (2*i); k++) {
				System.out.print(" ");
			}
			// 별
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
		for (int i = n; i > 0; i--) { // 4321
			// 4 2 4, 3 4 3, 2 6 2, 1 8 1
			// 별
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			// 공백 2 4 6 8
			for (int k = 0; k < (2*n) - (2*i) + 2; k++) {
				System.out.print(" ");
			}
			// 별
			for (int j = 1; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		

	}
}
