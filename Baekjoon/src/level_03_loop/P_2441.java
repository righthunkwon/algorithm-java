package level_03_loop;

import java.util.Scanner;

public class P_2441 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			// 공백(0 1 2 3 4)
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			// 별(5 4 3 2 1)
			for (int k = 0; k < n - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
