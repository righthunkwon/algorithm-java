package level_07_array_2;

import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class P_2738_solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[][] result = new int[N][M];

		// A배열 값 삽입
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				result[i][j] = sc.nextInt();
			}
		}
		// A배열에 B배열을 더하여 바로 출력
		for (int i = 0; i <N; i++) {
			for (int j = 0; j < M; j++) {
				result[i][j] += sc.nextInt(); // 와... goat
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}
}
