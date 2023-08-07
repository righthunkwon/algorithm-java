package level_13_sort;

import java.util.Scanner;

public class P_2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		// 배열 입력 반복문
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 5 2 3 4 1 (length: n)
		// 정렬
		// 2 3 4 1 5 : 1
		// 2 3 1 4 5 : 2
		// 2 1 3 4 5 : 3
		// 1 2 3 4 5 : 4 (n-1회)
		
		// 배열 정렬
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		
		// 배열 출력
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}
}
