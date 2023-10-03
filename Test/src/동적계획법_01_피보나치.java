import java.util.Scanner;

public class 동적계획법_01_피보나치 {
	private static int fibo1callcnt, fibo2callcnt, fibo3callcnt; // 호출 횟수
	private static int[] memo; // fibo2의 메모이제이션을 위한 배열

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		memo = new int[n + 1];
		memo[0] = 0;
		memo[1] = 1;

		System.out.println("----------------------");
		System.out.println(fibo1(n));
		System.out.println(fibo1callcnt);
		System.out.println("----------------------");
		System.out.println(fibo2(n));
		System.out.println(fibo2callcnt);
		System.out.println("----------------------");
		System.out.println(fibo3(n));
		System.out.println(fibo3callcnt);
		System.out.println("----------------------");
	}

	// 재귀호출의 횟수가 너무 많고,
	// 이전에 호출했던 리턴값이 저장이 안 되고 계속 호출해서 이를 다시 구한다는 문제점 발생
	public static int fibo1(int n) {
		fibo1callcnt++; // 호출 횟수

		// 기저조건
		// 0일 경우 0 리턴
		// 1일 경우 1 리턴
		if (n < 2) {
			return n;
		}

		// 재귀조건
		return fibo1(n - 1) + fibo1(n - 2);
	}

	// 메모이제이션
	// 하향식 처리방법
	// 이전에 계산한 값을 메모리에 저장해서 매번 다시 계산하지 않도록 하여 효율성을 추구하는 방법
	public static int fibo2(int n) {
		fibo2callcnt++; // 호출 횟수

		if (n >= 2 && memo[n] == 0) {
			memo[n] = fibo2(n - 1) + fibo2(n - 2);
		}
		return memo[n];
	}

	// 동적계획법
	// 상향식 처리방법
	// 다이나믹 프로그래밍
	// 작은 문제들의 최적해를 이용하여 순환적으로 큰 문제를 해결한다.
	// 순환적인 관계를 명시적으로 표현하기 위해 일반적으로 점화식을 활용하고, 이를 기록하기 위해 메모이제이션을 활용한다.
	public static long fibo3(int n) {
		fibo3callcnt++; // 호출 횟수
		
		long[] dp = new long[n + 1];
		dp[0] = 0;
		dp[1] = 1;

		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 2] + dp[i -  1];
		}
		return dp[n];
	}

}
