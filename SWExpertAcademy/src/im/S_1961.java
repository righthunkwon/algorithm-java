package im;

import java.util.Scanner;

// 숫자 배열 회전
// 배열을 두 개 그린 뒤 회전 이전과 이후의 좌표를 적어두면 규칙을 찾기 편리하다.

// 90도 회전 메소드를 만든다.
// 90도 회전 배열, 180도 회전 배열, 270도 회전 배열을 만든다.
public class S_1961 {

	// 90도 회전의 메소드를 만든 뒤,
	// 180도 회전은 90도 회전 배열을 메소드에 담은 결과로,
	// 270도 회전은 180도 회전 배열을 메소드에 담은 결과로 출력한다.
	public static int[][] Rotation(int[][] arr) {
		// 반환할 결과 배열 생성
		int[][] result = new int[arr.length][arr.length];

		// 1 2 3 
		// 4 5 6 
		// 7 8 9 
		
		// 7 4 1
		// 8 5 2
		// 9 6 3
		
		// 90도 회전
		// 행 -> 배열 길이 - 1 - 열
		// 열 -> 행
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				result[i][j] = arr[arr.length - j - 1][i];
			}
		}
		
		// 결과 배열 반환
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// test case
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int n = sc.nextInt(); // 배열의 크기(n*n)
			int[][] arr = new int[n][n]; // 배열 생성

			// 배열 요소 입력
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			// 회전 배열 저장
			int[][] result_90 = Rotation(arr);
			int[][] result_180 = Rotation(result_90);
			int[][] result_270 = Rotation(result_180);

			// 결과 출력
			// 첫행을 출력한 뒤 공백을 출력하는 방식을 배열의 길이만큼 반복
			System.out.printf("#%d\n", t);
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(result_90[i][j]);
				}
				System.out.print(" ");

				for (int j = 0; j < n; j++) {
					System.out.print(result_180[i][j]);
				}
				System.out.print(" ");

				for (int j = 0; j < n; j++) {
					System.out.print(result_270[i][j]);
				}
				System.out.println();
			}
		}
	}
}
