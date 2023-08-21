import java.util.Arrays;
import java.util.Scanner;

public class Solution1860 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++) {
			int n = sc.nextInt(); // 손님 수
			int m = sc.nextInt(); // 붕어빵을 만들 수 있는 주기
			int k = sc.nextInt(); // 주기마다 만들 수 있는 붕어빵 개수

			// 손님이 오는 시간 배열 입력
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr); // 정렬

			// 마지막 손님이 오는 시간까지 붕어빵을 만들고,
			// 도중에 붕어빵을 팔 수 없다면 Impossible, 다 팔면 Possible

			int bungeoppang = 0; // 현재 붕어빵 개수
			boolean flag = true; // 조건 판단

			for (int i = 0; i < n; i++) {
				// 붕어빵을 만들어서 i+1번째 손님에게 제공할 수 있는 붕어빵 개수가 i+1보다 작으면
				if (arr[i] / m * k < i + 1) 
					flag = false; // 붕어빵을 제공할 수 없음을 표시
			}

			// 출력
			if (flag) {
				System.out.println("#" + t + " " + "Possible");
			} else {
				System.out.println("#" + t + " " + "Impossible");
			}
		}
	}
}
