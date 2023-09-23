package level_08_math;

import java.util.Scanner;

// 벌집
// 1, 6, 12, 18, 24, ... 순으로 증가

// n이 1일때				: 1번
// n이 2~7(1+6*1)일때		: 2번
// n이 7~19(7+6*2)일때		: 3번
// n이 20~37(19+6*3)일때	: 4번
// ...

public class P_2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 방의 번호
		int lv = 1; // 겹 수
		int range = 2; // 범위

		if (n == 1) {
			System.out.print(1);
		}

		else {
			while (range <= n) { // 범위가 n보다 커지기 직전까지 반복
				range = range + (6 * lv); // 다음 범위의 최솟값으로 초기화
				lv++; // lv 1 증가
			}
			System.out.print(lv);
		}
	}
}
