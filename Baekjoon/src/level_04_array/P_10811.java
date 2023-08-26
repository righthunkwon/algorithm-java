package level_04_array;

import java.util.Scanner;

public class P_10811 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 바구니의 개수
		int m = sc.nextInt(); // 역순으로 만들 바구니의 번호
		int[] arr = new int[n];

		// 배열에 요소 입력
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}

		// 배열을 m번 역순으로
		for (int i = 0; i < m; i++) {
			int start = sc.nextInt() - 1;
			int end = sc.nextInt() - 1;

			while (start < end) {
				int tmp = arr[start];
				arr[start] = arr[end];
				arr[end] = tmp;
				start++;
				end--;
			}
		}
		sc.close();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
