package level_23_dynamic_programming;

import java.util.Scanner;

// 알고리즘 수업 - 피보나치 수1
public class P_24416 {
	private static int n, fibo1call, fibo2call;
	private static int[] dp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		fibo1call = fibo2call  = 0;
		fibo1(n); fibo2(n);
		
		System.out.printf("%d %d", fibo1call, fibo2call);
	}

	// 단순 재귀호출(O(2^n)의 시간복잡도)
	private static int fibo1(int n) {
		
		if (n == 1 || n == 2) {
			fibo1call++; // 호출횟수
			return 1;
		}
		return fibo1(n - 1) + fibo1(n - 2);
	}

	// 동적 계획법(O(n)의 시간복잡도)
	private static int fibo2(int n) {
		
		dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 1;

		for (int i = 3; i <= n; i++) {
			fibo2call++; // 호출횟수
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}
}
