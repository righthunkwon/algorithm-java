import java.util.Arrays;
import java.util.Scanner;

// 다이나믹 프로그래밍
// 작은 부분 문제를 통해 큰 문제를 해결한다.
public class 동적계획법_02_동전거스름돈 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt(); // 거스름돈

		// 거스름돈에 대한 최소 동전 개수를 구하기
		// 사용할 수 있는 동전(3가지) : 1원 / 4원 / 6원

		int[] dp = new int[money + 1];
		dp[0] = 0; // 거스름돈이 0원일 경우 0개

		for (int i = 1; i <= money; i++) {
			int min = Integer.MAX_VALUE; // i원에 대한 거스름돈의 최소 개수
			
			// 1원을 작은 부분문제에 추가
			min = Math.min(min, dp[i - 1] + 1);
			
			// 4원을 작은 부분문제에 추가
			if (i >= 4) {
				min = Math.min(min, dp[i - 4] + 1);
			}
			
			// 6원을 작은 부분문제에 추가
			if (i >= 6) {
				min = Math.min(min, dp[i - 6] + 1);
			}
			
			// 1번, 4번, 6번 고려 완료
			dp[i] = min;
		}
		System.out.println(dp[money]);
	}
}