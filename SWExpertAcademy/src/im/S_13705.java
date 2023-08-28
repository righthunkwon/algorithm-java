package im;

import java.util.Scanner;

// 파동파동
public class S_13705 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int n = sc.nextInt(); // 배열 크기
			int m = sc.nextInt(); // 파동 시작값
			int r = sc.nextInt(); // 행
			int c = sc.nextInt(); // 열
			int d = sc.nextInt(); // 증감

			int[][] arr = new int[n + 1][n + 1];
			for (int i = 0; i < n; i++) { // 파동의 크기에 따라 반복하여 값을 할당

				// 대칭적인 파동 패턴(-i ~ +i)
				for (int j = -i; j <= i; j++) {
					if (r - i > 0 && c + j > 0 && c + j <= n) {
						arr[r - i][c + j] = m;
					}
					if (r + i <= n && c + j > 0 && c + j <= n) {
						arr[r + i][c + j] = m;
					}
					if (c - i > 0 && r + j > 0 && r + j <= n) {
						arr[r + j][c - i] = m;
					}
					if (c + i <= n && r + j > 0 && r + j <= n) {
						arr[r + j][c + i] = m;
					}
				}
				m += d; // 파동 증감
				if (m < 0) {
					m = 0;
				} else if (m > 255) {
					m = 255;
				}
			}

			System.out.printf("#%d", t);
			for (int i = 1; i <= n; i++) {
				int sum = 0;
				for (int j = 1; j <= n; j++) {
					sum += arr[i][j];
				}
				System.out.print(" " + sum);
			}
			System.out.println();
		}
	}
}
