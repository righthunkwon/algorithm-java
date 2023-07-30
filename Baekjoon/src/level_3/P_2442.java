package level_3;

import java.util.Scanner;

public class P_2442 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			// 공백(4 3 2 1 0)
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print(" ");
			}
			// 별(1 3 5 7 9)
			for (int k = 0; k < (2 * i) + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
