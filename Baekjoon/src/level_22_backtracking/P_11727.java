package level_22_backtracking;

import java.util.Scanner;

// 2xn 타일링 2
// n=1, 1
// n=2, 3
// n=3, 5
// n=4, 11
// n=5, 21
// n=6, 43
// i번째는 i-1번째와 i-2번째*2 만큼 더한 것
public class P_11727 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[1001];
		dp[1] = 1;
		dp[2] = 3;
		for (int i = 3; i < 1001; i++) {
			dp[i] = (dp[i-1] + 2*dp[i-2]) % 10007;
		}
		System.out.println(dp[n]);
	}
}
