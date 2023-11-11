package level_00_basic;

import java.util.Scanner;

// 별 찍기 - 13
public class P_2523 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// 상단
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 하단
		for (int i = 0; i < n-1; i++) {
			for (int j = i; j < n-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
