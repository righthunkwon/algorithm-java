package level_04_array;

import java.util.Scanner;

public class P_3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10]; // 입력 숫자 배열
		int[] cnt = new int[1000]; // 나머지 카운트 배열

		// 배열에 값을 넣은 뒤 해당 값을 카운트 배열에 넣는다.
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
			cnt[arr[i] % 42]++;
		}

		// 카운트 배열에서 값이 0인 요소들의 개수를 세고 1000에서 해당 개수를 빼서 나머지의 개수를 구한다.
		int zero = 0;
		for (int i = 0; i < 1000; i++) {
			if (cnt[i] == 0) {
				zero++;
			}
		}
		int ans = 1000 - zero;
		System.out.println(ans);
	}
}