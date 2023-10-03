import java.util.Scanner;

public class 동적계획법_03_배낭문제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(input);

		int N = sc.nextInt(); // 물건의 개수
		int W = sc.nextInt(); // 가방의 무게

		int[] weights = new int[N + 1];
		int[] cost = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			weights[i] = sc.nextInt();
			cost[i] = sc.nextInt();
		}

		int[][] dp = new int[N + 1][W + 1];
		// 물건을 하나도 고려하지 않을때를 초기화 시켜주어야 하나 0행은 이미 0으로 초기화 되어 있음
		// 물건을 하나씩 고려를 하면서 처리를 해보자.
		for (int i = 1; i <= N; i++) {
			// i번째 물건까지 고려를 한 경우가 저장이 됨.
			// w : 임시 배낭의 크기
			for (int w = 0; w <= W; w++) {
				if (weights[i] <= w) {
					// 해당 물건을 이제 판단 해보겠다.
					// 현재 해당 무게에서의 최적해는 dp[i-1][w]
					// 이번에 물건을 고려한 최적해는 dp[i-1][w-weigths[i]] + cost[i]
					// 위의 두가지의 경우 중 베스트 값을 현재 저장하겠따.
					dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i]] + cost[i]);
				} else {
					dp[i][w] = dp[i - 1][w];// 현재 고려할 물건의 무게가 임시무게를 벗어나 고려할수 없을떄
				}
			}

		} // 물건을 한개씩 고려하겠다.

		System.out.println(dp[N][W]);
	}

	public static String input = "4 10\r\n" + "5 10\r\n" + "4 40\r\n" + "6 30\r\n" + "3 50\r\n" + "";

}