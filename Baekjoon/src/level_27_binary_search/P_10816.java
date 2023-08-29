package level_27_binary_search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 숫자 카드 2

// [이진탐색]
// 1. 중간 인덱스를 구한다.
// 2. 중간값과 key값을 비교한다.
// 3. 비교값에 따라 범위를 왼쪽 혹은 오른쪽을 이어 탐색한다. 값이 같은 경우는 해당 인덱스를 반환한다.

// [상계와 하계]
// Upper bound & Lower bound
// 정렬된 배열에서 찾고자 하는 값 key가 있을 때,
// Upper Bound: key보다 큰 첫번째 위치(초과)를 반환.
// Lower Bound: key보다 크거나 같은 첫번째 위치(이상)를 반환.

// 가령, 배열 { 1, 3, 3, 5, 7 }에서 key가 3이면
// Upper Bound = 3(인덱스), Lower Bound = 1(인덱스)이 된다.

// 이진탐색 기본 알고리즘은 중복이 없으며, 반드시 존재하는 데이터를 탐색할 때 용이하다.
// Upper Bound은 중복이 존재하거나 없는 데이터를 탐색할 경우, 바로 다음 결과값을 반환한다. 가장 오른쪽 위치를 구한다.
// Lower Bound는 중복이 존재하거나 없는 데이터를 탐색할 경우, 일치하는 숫자가 가장 처음 나타나는 값을 반환한다. 가장 왼쪽 위치를 구한다.
public class P_10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		// 판단할 숫자 카드 배열
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] search = new int[n];
		for (int i = 0; i < n; i++) {
			search[i] = Integer.parseInt(st.nextToken());
		}

		// 숫자 카드 배열
		int m = Integer.parseInt(br.readLine());
		int[] arr = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		// 정렬
		Arrays.sort(search);

		// 출력
		// 문자열 더하는 방식으로 출력하면 시간초과 발생해서 스트링빌더 사용
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			// 중복되는 요소의 개수는 상계에서 하계를 뺀 것과 동일하다.
			sb.append((upperBound(search, arr[i]) - lowerBound(search, arr[i])) + " "); 
		}
		System.out.println(sb);
	}

	// 하계
	private static int lowerBound(int[] search, int key) {
		int st = 0;
		int ed = search.length;

		while (st < ed) {
			int mid = (st + ed) / 2;

			// key가 중간 위치의 값보다 작거나 같을 경우 중복 원소에 대해 왼쪽으로 탐색하도록 상계를 내린다.
			if (key <= search[mid]) {
				ed = mid;
			} else {
				st = mid + 1;
			}
		}
		return st;
	}

	// 상계
	private static int upperBound(int[] search, int key) {
		int st = 0;
		int ed = search.length;

		while (st < ed) {
			int mid = (st + ed) / 2;

			// key값이 중간 위치의 값보다 크거나 같을 경우 하계를 높인다.
			if (key >= search[mid]) {
				st = mid + 1;
			} else {
				ed = mid;
			}
		}
		return st;
	}
}