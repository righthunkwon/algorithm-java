package level_13_sort;

import java.util.Arrays;
import java.util.Scanner;

public class P_2750_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		// 배열 입력 반복문
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 배열 정렬
		Arrays.sort(arr);

		// 배열 출력
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}

	}
}
