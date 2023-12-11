package level_08_math;

import java.util.Scanner;

// 소수
// 자연수 M과 N이 주어질 때 
// 해당 사이의 수 중 소수인 것들 모두 골라 합과 최솟값 구하기

// 소수를 판단하는 문제의 경우 1의 예외처리에 유의하자(1은 소수가 아니다)
public class P_2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		int min = Integer.MAX_VALUE;

		// 예외처리(1은 소수가 아님)
		if (n == 1) {
			System.out.println(-1);
			System.exit(0);
		}
		
		for (int i = m; i <= n; i++) {
			if (i == 1) continue; // 1은 소수가 아님
			boolean flag = true; // 소수여부 판단 변수
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					flag = false; // 소수가 아님
					break;
				}
			}
			// 소수일 경우
			if (flag) {
				min = Math.min(min, i); // 최소값 갱신
				sum += i; // 누적합
			}
		}

		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
