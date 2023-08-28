package im;

import java.util.Scanner;

// 그는 내가 아는 전설의 폭탄마였어
public class S_13772 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t=1; t<=tc; t++) {
			int n = sc.nextInt(); // 배열 크기
			int p = sc.nextInt(); // 파워
			int[][] arr = new int[n+p*2][n+p*2]; // 확장된 배열
			
			// 배열 요소 입력
			for (int i = p; i < n+p; i++) {
				for (int j = p; j < n+p; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			// +폭발 탐색
			int pbomb = 0; // 최종합
			int psum = 0; // 임시합
			for (int i = p; i < n+p; i++) {
				for (int j = p; j < n+p; j++) {
					int pt = p;
					// p만큼 탐색
					int width = i;
					int height = j;
					psum += arr[width][height];
					while (pt > 0) {
						psum += arr[width+pt][height];
						psum += arr[width][height+pt];
						psum += arr[width-pt][height];
						psum += arr[width][height-pt];
						pt--;
					}
					pbomb = Math.max(pbomb, psum);
					psum = 0;
					
				}
			}
			
			// x폭발 탐색
			int xbomb = 0; // 최종합
			int xsum = 0; // 임시합
			for (int i = p; i < n+p; i++) {
				for (int j = p; j < n+p; j++) {
					int pt = p;
					// p만큼 탐색
					int width = i;
					int height = j;
					xsum += arr[width][height];
					while (pt > 0) {
						xsum += arr[width+pt][height+pt];
						xsum += arr[width-pt][height-pt];
						xsum += arr[width-pt][height+pt];
						xsum += arr[width+pt][height-pt];
						pt--;
					}
					xbomb = Math.max(xbomb, xsum);
					xsum = 0;
				}

			}
			System.out.printf("#%d %d\n", t, Math.max(pbomb, xbomb));
		}
	}
}
