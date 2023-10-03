package level_00_basic;

import java.util.Scanner;

// 나는 요리사다
public class P_2953 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		int max = 0;
		int midx = 0;
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 4; j++) {
				arr[i] += sc.nextInt();
			}
			if (max < arr[i]) {
				max = arr[i];
				midx = i;
			}
		}
		System.out.println(midx + " " + max);
	}
}
