package level_03_loop;

import java.util.Scanner;

public class P_10810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int M = sc.nextInt();

		for (int i = 0; i < M; i++) {
			int I = sc.nextInt();
			int J = sc.nextInt();
			int K = sc.nextInt();

			for (int j = I - 1; j < J; j++) {
				arr[j] = K;
			}
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}
