package level_27_binary_search;

import java.util.Arrays;
import java.util.Scanner;

// 수 찾기

// [이진탐색]
// 1. 중간 인덱스를 구한다.
// 2. 중간값과 key값을 비교한다.
// 3. 비교값에 따라 범위를 왼쪽 혹은 오른쪽을 이어 탐색한다. 값이 같은 경우는 해당 인덱스를 반환한다.
public class P_1920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 판단할 배열
		int n = sc.nextInt();
		int[] search = new int[n];
		for (int i = 0; i < n; i++) {
			search[i] = sc.nextInt();
		}

		// 검색할 자료 배열
		int m = sc.nextInt();
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) {
			arr[i] = sc.nextInt();
		}

		// 정렬
		// 검색할 자료는 순서에 따라 결과를 출력해야 하므로
		// 판단할 배열만 정렬해야 한다.
		Arrays.sort(search);

		// 이진탐색
		for (int i = 0; i < m; i++) {
			System.out.println(binarySearch(search, arr, arr[i]));
		}

	}

	private static int binarySearch(int[] search, int[] arr, int key) { // 판단기준, 검색배열, 검색값

		int st = 0; // 시작 인덱스
		int ed = search.length - 1; // 끝 인덱스

		while (st <= ed) {
			int mid = (st + ed) / 2; // 중간 인덱스
			if (key < search[mid]) {
				ed = mid - 1;
			} else if (key > search[mid]) {
				st = mid + 1;
			} else if (key == search[mid]) {
				return 1;
			}
		}
		return 0;
	}
}