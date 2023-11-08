package level_23_dynamic_programming;

import java.util.Scanner;

// 게임
public class P_1103 {

	private static int[] dx = { -1, 1, 0, 0 };
	private static int[] dy = { 0, 0 - 1, 1 };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 세로 크기
		int m = sc.nextInt(); // 가로 크기
		int[][] map = new int[n][m]; // 보드

		// 보드 배열 요소 입력
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			for (int j = 0; j < m; j++) {
				if (s.charAt(j) == 'H')
					map[i][j] = -1; // 구멍
				else
					map[i][j] = s.charAt(j) - '0'; // 보드 상태
			}
		}
		
	}
}
