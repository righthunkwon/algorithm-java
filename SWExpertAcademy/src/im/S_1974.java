package im;

import java.util.Scanner;

// 스도쿠 검증
public class S_1974 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// test case
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {

			// 배열 요소 입력
			int[][] arr = new int[9][9];
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			// 값을 판단하기 위한 임시 배열
			int[] rarr = new int[9]; // 행 판단 임시배열
			int[] carr = new int[9]; // 열 판단 임시배열
			int[][] sarr = new int[3][3]; // 사각형 영역 판단 임시배열

			int ans = 1; // 정답 판단

			// (1) 행판단
			l1: for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					rarr[j] = arr[i][j]; // 임시배열에 값 입력
				}

				// 임시 배열을 순회하며 중복된 값이 있을 경우 반복문을 종료하고 정답에 0 저장
				for (int n = 0; n < 9; n++) {
					for (int m = n + 1; m < 9; m++) {
						if (rarr[n] == rarr[m]) {
							ans = 0;
							break l1;
						}
					}
				}
			}

			// (2) 열판단
			l2: for (int j = 0; j < 9; j++) {
				for (int i = 0; i < 9; i++) {
					carr[i] = arr[i][j]; // 임시배열에 값 입력
				}

				// 임시 배열을 순회하며 중복된 값이 있을 경우 반복문을 종료하고 정답에 0 저장
				for (int n = 0; n < 9; n++) {
					for (int m = n + 1; m < 9; m++) {
						if (carr[n] == carr[m]) {
							ans = 0;
							break l2;
						}
					}
				}
			}

			// (3) 3*3 판단
			// 살짝 멍청하지만 성실한 남자의 우직한 풀이 방법
			l3: for (int i = 0; i < 9; i += 3) {
				for (int j = 0; j < 9; j += 3) {
					
					// 임시 배열 요소 입력
					for (int n = 0; n < 3; n++) {
						for (int m = 0; m < 3; m++) {
							sarr[n][m] = arr[i + n][j + m];
						}
					}

					// 임시 배열을 순회하며 중복된 값이 있을 경우 반복문을 종료하고 정답에 0 저장
					// 카운트 배열(boolean)을 만들 경우에 쉽게 풀이할 수 있다.
					for (int n = 0; n < 3; n++) {
						for (int m = 0; m < 3; m++) {
							if ((n != 0 || m != 0) && sarr[0][0] == sarr[n][m]) { // 애매한 풀이
								ans = 0;
								break l3;
							}
						}
					}
				}
			}
			System.out.printf("#%d %d\n", t, ans);
		}
	}
}
