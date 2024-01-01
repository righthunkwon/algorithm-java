package level_26_divide_and_conquer;

import java.util.Scanner;

// 행렬 곱셈
public class P_2740 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		// N x M 크기의 행렬 입력
		int[][] A = new int[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		
		sc.nextInt(); // M과 동일
		int K = sc.nextInt();
		
		// M x K 크기의 행렬 입력
		int[][] B = new int[M][K];	
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < K; j++) {
				B[i][j] = sc.nextInt();
			}
		}
		
		// 행렬의 곱 결과 배열
		int[][] C = new int[N][K]; // AxB의 행렬을 담을 N x K 크기의 행렬
		for(int i = 0; i < N; i++) { // i = A행렬의 i번째 row
			 
			for(int j = 0; j < K; j++) { // j = B행렬의 j번째 col
		 
				/*
				 * A의 row(i)와 B의 col(j)의 각 원소들을 곱한 뒤 더하는 과정
				 *
				 * ex) A(row1) = [a b c],  B(col1) = [g h i]
				 *     --> = (ab + bh + ci)
				 */
				for(int k = 0; k < M; k++) { // 더해주는 원소의 개수는 총 M개
					
					// A의 i번째 row의 k번째 열 원소와
					// B의 j번째 col의 k번째 행 원소를 곱한 뒤 누적합
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K; j++) {
				System.out.print(C[i][j] + " ");
			}
			System.out.println();
		}
	}
}
