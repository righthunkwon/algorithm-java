package level_07_multi_array;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class P_2738 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		int[][] result = new int[N][M];
		
		// A배열 값 삽입
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		// B배열 값 삽입
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		// result 배열 값 삽입
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				result[i][j] = A[i][j] + B[i][j];
			}
		}
		// result 배열 출력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
