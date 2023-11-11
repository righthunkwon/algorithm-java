package level_22_backtracking;

import java.util.Scanner;

// 부녀회장이 될테야
// 3층  1  5  15 35
// 2층  1  4  10 20
// 1층  1  3  6  10 ...
// 0층  1  2  3  4  ... 
public class P_2775 {
	public static void main(String[] args) {
		int[][] dp = new int[15][15]; // 층,호
		
		// 초기값(0층) 세팅
		for (int i = 1; i <= 14; i++) {
			dp[0][i] = i; 
		}
		
		// 1층부터 계산
		for (int i = 1; i <= 14; i++) { // 층
			for (int j = 1; j <= 14; j++) { // 호
				
				// 이전 층을 누적합하여 현재 층에 대입
				int sum = 0;
				for (int k = 1; k <= j; k++) {
					sum += dp[i-1][k];
				}
				dp[i][j] = sum;
				
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int k = sc.nextInt(); // 층
			int n = sc.nextInt(); // 호
			System.out.println(dp[k][n]); // 정답 출력
		}
	}
}
