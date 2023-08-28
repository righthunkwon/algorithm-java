package im;

import java.util.Scanner;

// 기지국
public class S_13707 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int n = sc.nextInt();
			char[][] arr = new char[n + 6][n + 6]; // 확장된 배열(배열 범위 초과 방지)

			// 배열 요소 입력
			for (int i = 3; i < n + 3; i++) {
				String str = sc.next();
				for (int j = 3; j < n + 3; j++) {
					arr[i][j] = str.charAt(j - 3); // String 배열 범위 초과 유의
				}
			}

			// 기지국 변환
			int ans = 0; // 커버되지 않는 집의 수
			for (int i = 3; i < n + 3; i++) {
				for (int j = 3; j < n + 3; j++) {
					int k = 0; // 기지국의 커버 범위
					if (arr[i][j] == 'A') k = 1;
					if (arr[i][j] == 'B') k = 2;
					if (arr[i][j] == 'C') k = 3;

					if (k > 0) {
						for (int c = 1; c <= k; c++) {
							arr[i][j + c] = 'X';
							arr[i][j - c] = 'X';
							arr[i + c][j] = 'X';
							arr[i - c][j] = 'X';
						}
					}
				}
			}

			// 전체를 순회하며 커버되지 않은 집(H)의 수 탐색
			for (int i = 3; i < n + 3; i++) {
				for (int j = 3; j < n + 3; j++) {
					if (arr[i][j] == 'H') ans++;
				}
			}
			System.out.printf("#%d %d\n", t, ans);
		}
	}
}
