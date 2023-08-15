package level_12_bruteforce;

import java.util.Arrays;
import java.util.Scanner;

public class P_1018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		// 전체 배열 입력
		String[] sarr = new String[n];
		char[][] carr = new char[n][m];
		for (int i = 0; i < n; i++) {
			sarr[i] = sc.next();
		}
		for (int i = 0; i < n; i++) {
			carr[i] = sarr[i].toCharArray();
		}

		// 체스판 자르기
		// 전체 체스판 크기 = 검은 체스판 최소비용 + 흰 체스판 최소비용
		for (int i = 0; i < n - 8; i++) {
			for (int j = 0; j < m - 8; j++) {
				// 현 체스판의 최소 비용 구하기
				
				// 전체 최적 값과 비교 후 갱신
			}
		}
	}
}
