package level_22_backtracking;

import java.util.Scanner;

// RGB 거리
public class P_1149 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] dp = new int[n + 1][3];
		for (int i = 1; i <= n; i++) {
			int r = sc.nextInt();
			int g = sc.nextInt();
			int b = sc.nextInt();
			
			dp[i][0] = Math.min(dp[i - 1][1], dp[i - 1][2]) + r; // 26 / 40+49 / 13+83 
			dp[i][1] = Math.min(dp[i - 1][0], dp[i - 1][2]) + g; // 40 / 26+60 / 89+83
			dp[i][2] = Math.min(dp[i - 1][0], dp[i - 1][1]) + b; // 83 / 26+57 / 99+86
		}
        System.out.println(Math.min(dp[n][0], Math.min(dp[n][1], dp[n][2])));
	}
}
