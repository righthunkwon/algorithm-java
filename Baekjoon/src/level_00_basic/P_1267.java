package level_00_basic;

import java.util.Scanner;

// 핸드폰 요금
public class P_1267 {
	private static int Y; // 영식 요금제(30초마다 10원)
	private static int M; // 민식 요금제(60초마다 15원)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 통화 개수
		int[] arr = new int[n]; // 통화 시간 배열
		
		// 통화 시간 배열 요소 입력
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 통화 시간과 요금 계산
		for (int i = 0; i < n; i++) {
			Y += ((arr[i] / 30) + 1) * 10;
			M += ((arr[i] / 60) + 1) * 15;
		}
		if (Y == M) {
			System.out.println("Y M " + Y);
		} else if (Y > M) {
			System.out.println("M " + M);
		} else {
			System.out.println("Y " + Y);
		}
	}
}
