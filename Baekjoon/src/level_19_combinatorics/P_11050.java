package level_19_combinatorics;

import java.util.Scanner;

// 이항 계수 1
// 이항 계수는 순서없는 조합의 가짓수

// nCk를 구하는 문제
// n! / k!(n-k)!

// 팩토리얼 메소드를 구현하여 정답을 출력한다.
public class P_11050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(factorial(n) / (factorial(k) * factorial(n - k)));
	}

	private static int factorial(int n) {
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}
