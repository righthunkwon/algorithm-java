package level_09_divisor_multiple;

import java.util.Scanner;

// 약수 구하기
// p를 q로 나누었을 때 나머지가 0이면 q는 p의 약수
// 무지성으로 제출하지말고 다양한 반례를 미리 적어두고 대입해보자
public class P_2501 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 나눌 수
		int k = sc.nextInt(); // k번째 순서
		
		int[] divisor = new int[n+1]; // 약수 배열(인덱스 1부터 시작)
		int idx = 2; // 약수 배열 인덱스
		divisor[1] = 1; // 모든 수는 1을 약수로 갖는다.
		
		// 약수 배열에 약수 입력
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				divisor[idx++] = i;
			}
		}
		divisor[idx] = n; // 모든 수는 자기 자신을 약수로 갖는다.

		if (k == 1) {
			System.out.println(1);
		} else if (idx < k ) {
			System.out.println(0);
		} else {
			System.out.println(divisor[k]);
		}
	}
}
