package level_07_array_2;

import java.util.Scanner;

public class P_2566 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[9][9];
		int max = 0;
		int maxi = 0;
		int maxj = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
				if (max < arr[i][j]) {
					max = arr[i][j];
					maxi = i;
					maxj = j;
				}
			}
		}
		System.out.println(max);
		System.out.println((maxi + 1) + " " + (maxj + 1));

	}
}
