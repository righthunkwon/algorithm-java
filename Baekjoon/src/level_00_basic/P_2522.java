package level_00_basic;

import java.util.Scanner;

// 별 찍기 - 12
public class P_2522 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// 상단부
		for (int i = 0; i < n; i++) {
			// 공백
			for (int j = n - 1; j > i; j--) {
				System.out.print(" ");
			}
			// 별
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 하단부
		for (int i = 0; i < n-1; i++) {
			// 공백
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			// 별
			for (int j = n; j > i + 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
