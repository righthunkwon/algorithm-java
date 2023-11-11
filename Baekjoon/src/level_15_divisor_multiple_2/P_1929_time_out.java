package level_15_divisor_multiple_2;

import java.util.Scanner;

// 소수 구하기(시간초과)
public class P_1929_time_out {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int m = sc.nextInt();
		int n = sc.nextInt();

		for (int i = m; i <= n; i++) {
			if (i == 1) continue; // 예외 처리(1은 소수가 아니다)
			if (i == 2) sb.append(2+"\n"); // 예외 처리(2는 소수이다)
			if (i % 2 == 0) continue; // 2의 배수 패스(2를 제외한 2의 배수는 소수가 아니다)

			// 검사하려는 수(i)의 이전 수로 모두 나눠서 해당 수가 소수인지 판단한다.
			boolean flag = true;
			for (int j = m; j < i; j++) {
				if (j <= 2) continue;
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) sb.append(i+"\n");
		}
		System.out.println(sb);
	}
}
