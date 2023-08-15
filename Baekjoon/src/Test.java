import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] arr = { 8, 8, 24, 12, 19, 3, 45, 60 };
		int n = arr.length;

		// 카운팅 정렬은 요소 간의 비교 없이 정렬을 수행하는 방법이다.
		// if문 없이 for문으로만 구현할 수 있다.
		// 원래의 순서를 유지하는 안정정렬이다.

		// 과정은 크게 네 단계로 구성된다.
		// 1. 배열의 최대값 구하기
		// 2. 도수분포표 만들기(개수 카운팅)
		// 3. 누적도수분포표 만들기(0부터 n까지의 도수분포표 중 0에서 n으로 나아가며 누적합)
		// 4. 배열 복사하기(원본배열의 크기와 동일한 배열에 뒤에서부터 순회를 하며 복사)

		// 1. 배열의 최대값 구하기
		int k = -1; // 최대값 초기화
		for (int i = 0; i < n; i++) {
			if (k < arr[i]) {
				k = arr[i];
			}
		}

		// 원래 크기보다 한 칸 더 큰 배열 생성
		int[] cnt = new int[k + 1]; // 61칸 배열 생성

		// 2. 개수를 세는 도수분포표 만들기
		for (int i = 0; i < n; i++) {
			// 해당 값을 인덱스로 하여 카운트를 증가시킨다.
			cnt[arr[i]]++;
		}

		// 3. 누적합을 계산한 누적도수분포표 문들기
		for (int i = 1; i < cnt.length; i++) {
			cnt[i] += cnt[i - 1];
		}

		// 4. 원본배열의 뒤에서부터 순회를 하며 배열에 저장
		int[] sortArr = new int[n];
		for (int i = n - 1; i >= 0; i--) {
			// 저장하고 싶은 값 : arr[i]
			// 저장하고 싶은 위치 : --cnt[arr[i]]
			sortArr[--cnt[arr[i]]] = arr[i];
		}
		System.out.println(Arrays.toString(sortArr));
	}
}
