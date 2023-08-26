package level_00_not_classified;

import java.util.Scanner;

public class P_2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 8개의 음계 배열
		int[] arr = new int[8];

		// 배열 요소 입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		String ans = ""; // 정답을 담을 문자열
		
		// 이전 요소가 이후 요소보다 1이 작다면 오름차순
		// 이전 요소가 이후 요소보다 1이 크다면 내림차순
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1] - 1) {
				ans = "ascending";
			} else if (arr[i] == arr[i + 1] + 1) {
				ans = "descending";
			} else {
				ans = "mixed";
				break;
			}
		}
		System.out.println(ans);
	}

}
