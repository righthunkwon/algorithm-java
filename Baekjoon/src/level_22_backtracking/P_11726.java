package level_22_backtracking;

import java.util.Scanner;

// 2xn 타일링
// n=1, 1
// n=2, 2
// n=3, 3
// n=4, 5
// n=5, 8
// n=6, 13
// 피보나치 느낌
public class P_11726 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[1001];
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i < 1001; i++) {
			dp[i] = (dp[i-1] + dp[i-2]) % 10007;
		}
		System.out.println(dp[n]);
	}
}
