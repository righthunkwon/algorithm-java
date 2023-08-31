package level_24_recursion;

import java.util.Scanner;

// 재귀의 귀재
public class P_25501 {
	private static int recursiontimes = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}
		for (int i = 0; i < n; i++) {
			recursiontimes = 0; // 초기화
			System.out.println(isPalindrome(arr[i]) + " " + recursiontimes);
		}
	}

	// 팰린드롬
	public static int isPalindrome(String s) {
		return recursion(s, 0, s.length() - 1);
	}

	// 재귀
	public static int recursion(String s, int left, int right) {
		recursiontimes++; // 재귀 호출 횟수 증가

		// 기저파트(종료조건)
		if (left >= right) {
			return 1;
		} else if (s.charAt(left) != s.charAt(right)) {
			return 0;
		}

		// 재귀부분(반복수행)
		return recursion(s, left + 1, right - 1);
	}

}