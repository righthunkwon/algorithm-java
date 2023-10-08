package level_23_dynamic_programming_easy;

import java.util.Scanner;

// 1로 만들기
// 1로 만들기 위한 연산의 최소 횟수

// 동적계획법
// 1) Top-Down 방식(재귀로 푸는 방식)
// 2) Bottom-Up 방식(for문으로 푸는 방식)

// 문제 점화식
// 1) 6으로 나눠지는 경우		: 3으로 나누는 경우, 2로 나누는 경우, 1을 빼는 경우 모두 재귀호출 하여 3가지 경우 중 최솟값으로 DP를 갱신
// 2) 3으로만 나눠지는 경우	: 3으로 나누는 경우, 1을 빼는 경우를 재귀호출하여 최솟값으로 DP를 갱신
// 3) 2로만 나눠지는 경우		: 2로 나누는 경우, 1을 빼는 경우를 재귀호출하여 최솟값으로 DP를 갱신
// 4) 그 외				: 1을 빼는 경우만 재귀호출하여 최소값으로 DP를 갱신
public class P_1463 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		// dp 세팅
		int[] dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 0;

		for (int i = 2; i <= n; i++) {
			// 1을 빼는 경우
			dp[i] = dp[i - 1] + 1;

			// 2로 나누어 떨어지는 경우
			if (i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 2] + 1);
			}

			// 3으로 나누어 떨어지는 경우
			if (i % 3 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 3] + 1);
			}
		}
		System.out.println(dp[n]);
	}
}
