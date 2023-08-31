package level_00_not_classified;

import java.util.Scanner;

// 별 찍기 - 9
public class P_2446 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// (1) 위 역삼각형(1포함)
		for (int i = 0; i < n; i++) {
			
			// 공백(좌측)
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			// 별(우측)
			for (int k = 0; k < 2*(n-i)-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// (2) 아래 삼각형(1미포함)
		for (int i = 1; i < n; i++) {
			
			// 공백(좌측)
			for (int j = 1; j < n - i; j++) {
				System.out.print(" ");
			}
			
			// 별(우측)
			for (int k = 0; k < 2*i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}