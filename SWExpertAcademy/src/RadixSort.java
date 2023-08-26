import java.util.LinkedList;
import java.util.Queue;

//기수 정렬
public class RadixSort {
	static int[] arr = {28, 93, 39, 81, 62, 72, 38, 26}; // 두 자리의 정수형 배열
	static final int bucketSize = 10; // 10진수이므로 버킷 사이즈는 10 (0부터 9까지의 숫자)
	
	// radixSort(정렬할 배열, 정렬할 배열의 길이)
	public static void radixSort(int[] arr, int n) {
		// 열 개의 bucket 생성
		Queue<Integer>[] bucket = new LinkedList[bucketSize];
		for (int i = 0; i < bucketSize; ++i) {
			bucket[i] = new LinkedList<>();
		}
		
		// 정렬할 자릿수를 나타내는 변수
		int factor = 1;
		
		// 정렬할 자릿수의 크기 만큼 반복(예제에서는 두 자리)
		for (int d = 0; d < 2; ++d) {
			
			// 배열의 모든 원소들을 버킷에 나누어 넣음
			for (int i = 0; i < n; ++i) {
				int digit = (arr[i] / factor) % 10; // 현재 자릿수의 숫자 추출 
				bucket[digit].add(arr[i]); // 버킷(큐)에 추가
			}
			
			// 버킷에 있는 숫자들을 배열로 다시 모음
			for (int i = 0, j = 0; i < bucketSize; ++i) {
				while (!bucket[i].isEmpty()) {
					arr[j++] = bucket[i].poll();
				}
			}
			
			// 다음 자릿수로 이동하기 위해 * 10
			factor *= 10;
		}
	}
}