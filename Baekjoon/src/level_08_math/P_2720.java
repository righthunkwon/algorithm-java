package level_08_math;

import java.util.Scanner;

// 세탁소 사장 동혁
// 변수들이 배수 관계에 있을 경우 그리디 알고리즘
public class P_2720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 거스름돈
		int Q = 25; // 쿼터
		int D = 10; // 다임
		int N = 5; // 니켈
		int P = 1; // 페니
		
		// 거스름돈 담을 배열
		int[] arr = new int[4];
		
		// test case
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int change = sc.nextInt();
			
			// 구현
			arr[0] = change / Q;
			change %= Q;
			
			arr[1] = change / D;
			change %= D;
			
			arr[2] = change / N;
			change %= N;
			
			arr[3] = change / P;
			change %= P;
			
			// 출력
			System.out.printf("%d %d %d %d\n", arr[0], arr[1], arr[2], arr[3]);
		}
	}
}
